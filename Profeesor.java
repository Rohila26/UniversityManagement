package com.university.management;

import java.util.ArrayList;
import java.util.List;

public class Profeesor {
	private String name;
	private List<Course> assignedCourses;
	public Profeesor(String name) {
		this.name=name;
		this.assignedCourses=new ArrayList<>();
	}
	public void assignCourse(Course course) {
		if(!assignedCourses.contains(course)) {
			assignedCourses.add(course);
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getAssignedCourses() {
		return assignedCourses;
	}
	public void setAssignedCourses(List<Course> assignedCourses) {
		this.assignedCourses = assignedCourses;
	}
	@Override
	public String toString() {
		return "Profeesor [name=" + name + "]";
	}

}
