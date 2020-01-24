package com.sv.sprprj.repository;

import com.sv.sprprj.entity.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitsRepository extends CrudRepository<Visit, Long> {
}