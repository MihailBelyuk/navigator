package com.solvd.navigator;

import com.solvd.navigator.domain.Trip;
import com.solvd.navigator.domain.exception.ResourceNotFoundException;
import com.solvd.navigator.service.ITripService;
import com.solvd.navigator.service.impl.TripServiceImpl;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class TripServiceImplTest {

    private ITripService tripService;

    @BeforeSuite
    public void showBeforeSuiteMsg() {
        System.out.println("Before suite msg");
    }

    @BeforeTest
    public void showBeforeTestMsg() {
        System.out.println("Before test msg");
    }

    @BeforeClass
    public void initialize() {
        tripService = new TripServiceImpl();
        System.out.println("Before class msg");
    }

    @BeforeMethod
    public void showBeforeMethodMsg() {
        System.out.println("Before method msg");
    }

    @Test(testName = "Checks if ResourceNotFoundException is thrown", dataProvider = "notExistingTripIds",
            dataProviderClass = DataProviderClass.class,
            expectedExceptions = ResourceNotFoundException.class)
    public void checkIfThrowsResourceNotFoundException(Long id) {
        tripService.getById(id);
    }

    @Test(testName = "Check if retrieved trip is not Null", dataProvider = "existingTripIds",
            dataProviderClass = DataProviderClass.class)
    public void checkIfRetrievedTripIsNotNull(Long id) {
        Trip trip = tripService.getById(id);
        Assert.assertNotNull(trip, "Retrieved trip is not Null.");
    }

    @Test(testName = "Check if retrieved objects are a trip instance", dataProvider = "objects",
            dataProviderClass = DataProviderClass.class)
    public void checkIfRetrievedObjectsAreInstanceOfTrip(List<Object> objects) {
        AtomicBoolean isTripInstance = new AtomicBoolean(false);
        objects.forEach(object -> isTripInstance.set(object instanceof Trip));
        Assert.assertTrue(isTripInstance.get(), "Provided object is instance of Trip");
    }

    @AfterMethod
    public void showAfterMethodMsg() {
        System.out.println("After method msg");
    }

    @AfterClass
    public void showAfterClassMsg() {
        System.out.println("After class msg");
    }


    @AfterClass
    public void showAfterTestMsg() {
        System.out.println("After test msg");
    }


    @AfterSuite
    public void showAfterSuiteMsg() {
        System.out.println("All suite tests are processed.");
    }

}
