package com.chuadev.projectmanagementapp.repositories;

import com.chuadev.projectmanagementapp.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Iterator;

@Repository // CrudRepository take Entity + ID
public interface ProjectRepository extends CrudRepository<Project, Long> {
    @Override
    Iterable<Project> findAllById(Iterable<Long> iterable);
}
