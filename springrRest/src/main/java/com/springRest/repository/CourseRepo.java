package com.springRest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springRest.entity.Course;

public interface CourseRepo extends MongoRepository<Course,Long> {
	
	
	

}
