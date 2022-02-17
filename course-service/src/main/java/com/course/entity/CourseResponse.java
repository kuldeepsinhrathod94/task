package com.course.entity;

public class CourseResponse {
	private String emailId;
	private int courseId;
	private String courseName;
	private String courseCountry;
	private long price;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCountry() {
		return courseCountry;
	}

	public void setCourseCountry(String courseCountry) {
		this.courseCountry = courseCountry;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}
