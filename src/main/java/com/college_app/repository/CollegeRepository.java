package com.college_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college_app.model.College;

public interface CollegeRepository extends JpaRepository<College, Long> {

	College findByCollegeId(Long collegeId);

}
