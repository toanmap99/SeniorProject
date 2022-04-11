/*
 * Toan Nguyen
 * Senior Project
 * Professor Jevon Jackson
 * 04/10/2022
 */

package com.graymatter.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.Department;
import com.graymatter.demo.repo.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	// Get all department method
	@Override
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	// save a department after update method
	@Override
	public void saveDepartment(Department department) {
		this.departmentRepository.save(department);
	}
		

	// get a department by ID method
	@Override
	public Department getDepartmentById(int id) {
		Optional<Department> optional = departmentRepository.findById(id);
		Department department = null;
		if(optional.isPresent()) {
			department = optional.get();
		}else {
			throw new RuntimeException("Department not found for id :: " + id);
		}
		return department;
	}

	// delete a department method
	@Override
	public void deleteDepartmentById(int id) {
		this.departmentRepository.deleteById(id);
		
	}

}
