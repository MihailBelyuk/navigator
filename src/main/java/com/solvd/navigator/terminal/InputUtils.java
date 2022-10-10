package com.solvd.navigator.terminal;

import java.util.Scanner;

public class InputUtils {

    public ScannerData inputData() {
        ScannerData currentData = new ScannerData();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Type in start point: ");
            String beginInput = scanner.nextLine();
            currentData.setStartPointInput(beginInput);
            System.out.print("Type in destination point: ");
            String endInput = scanner.nextLine();
            currentData.setEndPointInput(endInput);
            System.out.println();
            return currentData;
        }
    }
}

