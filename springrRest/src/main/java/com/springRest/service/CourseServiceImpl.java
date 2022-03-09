package com.springRest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springRest.entity.Course;
@Service
public class CourseServiceImpl implements CourseService {
	List<Course> list;
	
	 public CourseServiceImpl() {
		 list= new ArrayList<>();
		 list.add(new Course(101,"Java Core course","This course is basic java"));
		 list.add(new Course(102,"spring","Creating spring boot project"));
		 
	 }
	
	
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}



	@Override
	public Course getCourse(long courseId) {
	Course c=null;
	for(Course course:list) {
		if(course .getId()==courseId) {
			c=course;
			break;
					
		}
	}
		return c;
	}

}
