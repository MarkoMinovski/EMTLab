package com.emt.springbackendapi.service;

import com.emt.springbackendapi.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    List<Country> findAll();

    Optional<Country> findById(Long id);

    Optional<Country> create(String name, String continent);

    Optional<Country> update(Long id, String name, String continent);

    void delete(Long id);
}
