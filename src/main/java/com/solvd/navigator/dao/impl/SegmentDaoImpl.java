package com.solvd.navigator.dao.impl;

import com.solvd.navigator.dao.ISegmentDao;
import com.solvd.navigator.dao.MyBatisConfig;
import com.solvd.navigator.domain.Segment;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Optional;

public class SegmentDaoImpl implements ISegmentDao {

    @Override
    public void insert(Segment segment) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            ISegmentDao segmentDao = session.getMapper(ISegmentDao.class);
            segmentDao.insert(segment);
        }
    }

    @Override
    public Optional<Segment> findById(Long id) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            ISegmentDao segmentDao = session.getMapper(ISegmentDao.class);
            return segmentDao.findById(id);
        }
    }

    @Override
    public void update(Segment segment) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            ISegmentDao segmentDao = session.getMapper(ISegmentDao.class);
            segmentDao.update(segment);
        }
    }

    @Override
    public void delete(Segment segment) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            ISegmentDao segmentDao = session.getMapper(ISegmentDao.class);
            segmentDao.delete(segment);
        }
    }

    @Override
    public List<Segment> findAll() {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            ISegmentDao segmentDao = session.getMapper(ISegmentDao.class);
            return segmentDao.findAll();
        }
    }
}
