package com.university.management;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course>enrolledCourses;
	public Student(String name) {
		this.name=name;
		this.enrolledCourses=new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getEnrolledCourses() {
		return enrolledCourses;
	}
	public void setEnrolledCourses(List<Course> enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}
	@Override
	public String toString() {
		return name;
	}
	public void enrollInCourse(Course course) {
		// TODO Auto-generated method stub
		
	}

}
