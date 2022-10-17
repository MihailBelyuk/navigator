package com.solvd.navigator.service.impl;

import com.solvd.navigator.dao.impl.SegmentDaoImpl;
import com.solvd.navigator.domain.Segment;
import com.solvd.navigator.exception.ResourceNotFoundException;
import com.solvd.navigator.service.ISegmentService;

import java.util.List;

public class SegmentServiceImpl implements ISegmentService {

    private final SegmentDaoImpl segmentDao;

    public SegmentServiceImpl() {
        segmentDao = new SegmentDaoImpl();
    }


    @Override
    public void create(Segment segment) {
        segmentDao.insert(segment);
    }

    @Override
    public Segment getById(Long id) {
        return segmentDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Failed to retrieve segment with id " + id));
    }

    @Override
    public void update(Segment segment) {
        segmentDao.update(segment);
    }

    @Override
    public void delete(Segment segment) {
        segmentDao.delete(segment);
    }

    @Override
    public List<Segment> getAll() {
        return segmentDao.findAll();
    }
}
