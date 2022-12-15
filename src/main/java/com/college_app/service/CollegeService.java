package com.college_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college_app.model.College;
import com.college_app.repository.CollegeRepository;

@Service
public class CollegeService {
@Autowired
private CollegeRepository collegeRepo;
	public College insertCollegeDataDB(College college) {
		return collegeRepo.save(college);
	}
	
	public College getCollegeByCollegeId(Long collegeId) {
		return collegeRepo.findByCollegeId(collegeId);
	}

}
