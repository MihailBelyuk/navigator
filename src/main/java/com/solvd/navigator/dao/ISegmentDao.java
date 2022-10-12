package com.solvd.navigator.dao;

import com.solvd.navigator.domain.Segment;

import java.util.List;
import java.util.Optional;

public interface ISegmentDao {

    void insert(Segment segment);

    Optional<Segment> findById(Long id);

    void update(Segment segment);

    void delete(Segment segment);

    List<Segment> findAll();

}
