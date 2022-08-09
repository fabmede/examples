package com.ftm.springgcp.person;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PersonRepository extends PagingAndSortingRepository<Person, String> {

    public List<Person> findAll();
}
