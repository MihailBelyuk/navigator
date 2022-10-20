package com.solvd.navigator;

import com.solvd.navigator.domain.Point;
import com.solvd.navigator.domain.exception.ResourceNotFoundException;
import com.solvd.navigator.service.IPointService;
import com.solvd.navigator.service.impl.PointServiceImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class PointTest {

    private IPointService pointService;
    private Point point;
    private List<Point> allPoints;

    @BeforeClass
    public void initializeService() {
        pointService = new PointServiceImpl();
        point = new Point();
        allPoints = pointService.getAll();
    }

    @Test(testName = "Check if point can be created in db", dataProvider = "pointParameters",
            dataProviderClass = DataProviderClass.class)
    public void checkIfPointCanBeCreatedInDb(String city, Integer index, Integer value) {
        point.setCity(city);
        point.setIndex(index);
        point.setValue(value);
        pointService.create(point);
        Point checkingPoint = pointService.getById(point.getId());
        Assert.assertNotNull(checkingPoint);
    }

    @Test(testName = "Check if point is deleted from db",
            expectedExceptions = ResourceNotFoundException.class)
    public void checkIfPointCanBeDeletedFromDbById() {
        Point point = allPoints.get(allPoints.size() - 1);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotNull(point, "Retrieved point is not null.");
        pointService.delete(point);
        pointService.getById(point.getId());
    }

    @Test(testName = "Check for points presence in db.")
    public void shouldContainPointsInDb() {
        Assert.assertFalse(allPoints.isEmpty(), "Db contains points.");
    }

    @Test(testName = "Provided city should match any point from db.", dataProviderClass = DataProviderClass.class,
            dataProvider = "points")
    public void providedPointShouldMatchAnyPointFromDb(Point p) {
        point = allPoints.stream()
                .filter(point -> point.getId().equals(p.getId()))
                .findAny().get();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(point.getCity(), p.getCity());
        softAssert.assertEquals(point.getIndex(), p.getIndex());
        softAssert.assertAll();
    }
}
