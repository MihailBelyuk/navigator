package com.solvd.navigator;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class DbConnectivityTest {

    @Test(testName = "Check if db properties file exist", dataProvider = "dbPropertiesFilePath",
            dataProviderClass = DataProviderClass.class)
    public void checkIfDbPropertiesFileExist(String filePath) {
        File file = new File(filePath);
        boolean exists = file.exists();
        Assert.assertTrue(exists, "Provided filepath exists.");
    }
}
