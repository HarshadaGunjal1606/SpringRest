package com.springRest.service;

import java.util.List;

import com.springRest.entity.Course;

public interface CourseService {
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
}
