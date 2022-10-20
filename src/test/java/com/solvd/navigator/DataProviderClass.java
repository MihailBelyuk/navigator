package com.solvd.navigator;

import com.solvd.navigator.domain.Point;
import com.solvd.navigator.service.impl.PointServiceImpl;
import com.solvd.navigator.service.impl.RouteServiceImpl;
import com.solvd.navigator.service.impl.TripServiceImpl;
import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "notExistingTripIds")
    public static Object[][] provideNotExistingId() {
        return new Object[][]{
                {1L}, {3L}, {9L}, {100L}, {101L}, {102L}, {103L}, {104L}
        };
    }

    @DataProvider(name = "existingTripIds")
    public static Object[][] provideExistingId() {
        return new Object[][]{
                {36L}, {37L}, {38L}
        };
    }

    @DataProvider(name = "objects")
    public static Object[][] provideObjects() {
        return new Object[][]{
                {new PointServiceImpl().getAll()},
                {new RouteServiceImpl().getAll()},
                {new TripServiceImpl().getAll()}
        };
    }

    @DataProvider(name = "points")
    public static Object[][] providePoints() {
        Point minsk = new Point();
        minsk.setCity("mins");
        minsk.setId(19L);
        minsk.setIndex(20005);
        Point slutsk = new Point();
        slutsk.setCity("slutsk");
        slutsk.setId(1L);
        slutsk.setIndex(223604);
        Point berezino = new Point();
        berezino.setCity("berezino");
        berezino.setId(21L);
        berezino.setIndex(223311);
        Point borisov = new Point();
        borisov.setCity("borisov");
        borisov.setId(28L);
        borisov.setIndex(222511);
        Point myadel = new Point();
        myadel.setCity("myadel");
        myadel.setId(32L);
        myadel.setIndex(222397);
        return new Object[][]{
                {minsk}, {myadel}, {slutsk}, {borisov}, {berezino}
        };
    }

    @DataProvider(name = "pointParameters")
    public static Object[][] providePointParameters() {
        return new Object[][]{
                {"Brest", 224033, 0},
                {"Krugloye", 213188, 0}
        };
    }

    @DataProvider(name = "dbPropertiesFilePath")
    public static Object[][] provideDbPropertiesFilePath() {
        return new Object[][]{
                {"src/main/resources/database/db.properties"}
        };
    }

    @DataProvider(name = "existingPointsIds")
    public static Object[][] provideExistingPointsIds() {
        return new Object[][]{{33L}, {34L}};
    }

    @DataProvider(name = "provideStartDestinationPointsId")
    public static Object[][] provideRouteAndStartDestinationPointsId() {
        return new Object[][]{
                {32L, 21L},
                {19L, 28L},
                {19L, 29L},
                {1L, 14L},
                {3L, 19L}
        };
    }
}
