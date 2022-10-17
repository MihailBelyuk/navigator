package com.solvd.navigator.terminal;

import com.solvd.navigator.domain.TravelType;

import java.util.Scanner;

public class InputUtils {

    public ScannerData inputData(Scanner scanner) {
        ScannerData currentData = new ScannerData();
        String startCity = getStartPointInput(scanner).toUpperCase();
        currentData.setStartPointInput(startCity);
        String endCity = getFinishPointInput(scanner).toUpperCase();
        currentData.setEndPointInput(endCity);
        currentData.setTravelType(getTravelTypeInput(scanner));
        return currentData;
    }

    public String getStartPointInput(Scanner scanner) {
        System.out.print("Enter start point: ");
        return scanner.nextLine();
    }

    public String getFinishPointInput(Scanner scanner) {
        System.out.print("Enter destination point: ");
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
            default:
                break;
        }
        return travelType;
    }
}

