/*
 * Toan Nguyen
 * Senior Project
 * Professor Jevon Jackson
 * 04/10/2022
 */

package com.graymatter.demo.service;

import java.util.List;

import com.graymatter.demo.model.Branch;

public interface BranchService {
	List<Branch> getAllBranches();
	void saveBranch(Branch branch);
	Branch getBranchById(int id);
	void deleteBranchById(int id);
}
