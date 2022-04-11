/*
 * Toan Nguyen
 * Senior Project
 * Professor Jevon Jackson
 * 04/10/2022
 */

package com.graymatter.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graymatter.demo.model.Department;
//Repo Interface connection between model and service
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
