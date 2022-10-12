package com.solvd.navigator;

import com.solvd.navigator.dao.impl.SegmentDaoImpl;
import com.solvd.navigator.domain.Point;
import com.solvd.navigator.domain.Segment;
import com.solvd.navigator.service.impl.PointServiceImpl;
import com.solvd.navigator.service.impl.RouteServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        PointServiceImpl pointService = new PointServiceImpl();
//        List<Point> pointList = pointService.getAll();
//        System.out.println(pointList);
//        SegmentDaoImpl segmentDao = new SegmentDaoImpl();
//        System.out.println(segmentDao.findAll());
        RouteServiceImpl routeService = new RouteServiceImpl();
        routeService.findShortestRoute();

    }
}
