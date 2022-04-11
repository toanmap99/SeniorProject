/*
 * Toan Nguyen
 * Senior Project
 * Professor Jevon Jackson
 * 04/10/2022
 */

package com.graymatter.demo.service;

import java.util.List;

import com.graymatter.demo.model.Department;

public interface DepartmentService {
	List<Department> getAllDepartments();
	void saveDepartment(Department department);
	Department getDepartmentById(int id);
	void deleteDepartmentById(int id);	
}
