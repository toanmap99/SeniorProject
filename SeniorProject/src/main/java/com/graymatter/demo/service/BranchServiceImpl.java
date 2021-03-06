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

import com.graymatter.demo.model.Branch;

import com.graymatter.demo.repo.BranchRepository;

@Service
public class BranchServiceImpl implements BranchService {
	
	@Autowired
	private BranchRepository branchRepository;

	// Get all branch method
	@Override
	public List<Branch> getAllBranches() {
		return branchRepository.findAll();
	}

	// Save branch method
	@Override
	public void saveBranch(Branch branch) {
		this.branchRepository.save(branch);
	}

	// Get Branch by ID
	@Override
	public Branch getBranchById(int id) {
		Optional<Branch> optional = branchRepository.findById(id);
		Branch branch = null;
		if(optional.isPresent()) {
			branch = optional.get();
		}else {
			throw new RuntimeException("Branch not found for id :: " + id);
		}
		return branch;
	}
	
	// Delete branch method
	@Override
	public void deleteBranchById(int id) {
		this.branchRepository.deleteById(id);
		
	}

}
