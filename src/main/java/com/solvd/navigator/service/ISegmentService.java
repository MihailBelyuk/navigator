package com.solvd.navigator.service;

import com.solvd.navigator.domain.Segment;

import java.util.List;

public interface ISegmentService {

    void create(Segment segment);

    Segment getById(Long id);

    void update(Segment segment);

    void delete(Segment segment);

    List<Segment> getAll();

}
