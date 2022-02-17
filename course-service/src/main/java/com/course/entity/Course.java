package com.course.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;
	private String courseName;
	private String courseCountry;
	private long internationalPrice;
	private long domesticPrice;

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

	public long getInternationalPrice() {
		return internationalPrice;
	}

	public void setInternationalPrice(long internationalPrice) {
		this.internationalPrice = internationalPrice;
	}

	public long getDomesticPrice() {
		return domesticPrice;
	}

	public void setDomesticPrice(long domesticPrice) {
		this.domesticPrice = domesticPrice;
	}

}
