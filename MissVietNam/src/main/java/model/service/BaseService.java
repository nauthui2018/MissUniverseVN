package model.service;

import model.entity.Candidate;

import java.util.List;

public interface BaseService<T> {
    List<T> findAll();
    void create(T t);
    void update(T t);
    void delete(T t);
    T findByID(String id);
}
