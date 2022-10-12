package com.solvd.navigator.terminal;

import com.solvd.navigator.domain.TravelType;

import java.util.Scanner;

public class InputUtils {

    public ScannerData inputData() {
        ScannerData currentData = new ScannerData();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Type in start point: ");
            String startCity = getStringInput(scanner).toUpperCase();
            currentData.setStartPointInput(startCity);
            System.out.print("Type in destination point: ");
            String endCity = getStringInput(scanner).toUpperCase();
            currentData.setEndPointInput(endCity);
            currentData.setTravelType(getTravelTypeInput(scanner));
            return currentData;
        }
    }

    public String getStringInput(Scanner scanner) {
        return scanner.nextLine();
    }

    public TravelType getTravelTypeInput(Scanner scanner) {
        System.out.println("How do you want to travel: ");
        System.out.println("1. CAR");
        System.out.println("2. BUS");
        System.out.println("3. ON FOOT");
        TravelType travelType = null;
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                travelType = TravelType.CAR;
                break;
            case 2:
                travelType = TravelType.BUS;
                break;
            case 3:
                travelType = TravelType.ON_FOOT;
                break;
            default:
                break;
        }
        return travelType;
    }
}

