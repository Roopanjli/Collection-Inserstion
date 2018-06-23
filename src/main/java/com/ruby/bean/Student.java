package com.ruby.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private List<Integer> marks;
	private Set<String> course;
	private Map<Integer, String> name;
	private Properties address;
	public Student() {
		super();
	}
	public Properties getAddress() {
		return address;
	}
	public Set<String> getCourse() {
		return course;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public Map<Integer, String> getName() {
		return name;
	}
	public void setAddress(Properties address) {
		this.address = address;
	}
	public void setCourse(Set<String> course) {
		this.course = course;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public void setName(Map<Integer, String> name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", course=" + course + ", name=" + name + ", address=" + address + "]";
	}
	
  
}
