package com.course.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.course.dao.CourseDao;
import com.course.entity.Course;
import com.course.entity.CourseResponse;


@Service
public class CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	public List<CourseResponse> getCourses() {
		List<Course> courses = courseDao.findAll();

		RestTemplate restTemplate = new RestTemplate();
		List<LinkedHashMap<String,String>> userList = restTemplate.getForObject("http://localhost:8080/getUsersList", List.class);

		List<CourseResponse> list = new ArrayList<>();
		for (Course course : courses) {
			for (LinkedHashMap hashMap : userList) {
				CourseResponse courseResponse = new CourseResponse();
				courseResponse.setCourseId(course.getCourseId());
				courseResponse.setCourseName(course.getCourseName());
				courseResponse.setCourseCountry(course.getCourseCountry());
				courseResponse.setEmailId(String.valueOf(hashMap.get("emailId")));
				String userCountry = String.valueOf(hashMap.get("country"));
				String courseCountry = course.getCourseCountry();
				if (userCountry.equals(courseCountry)) {
					courseResponse.setPrice(course.getDomesticPrice());
				} else {
					courseResponse.setPrice(course.getInternationalPrice());
				}
				list.add(courseResponse);
			}
		}
		return list;
	}
	
	public void addUpdateCourse(Course course) {
		courseDao.save(course);
	}
	
	public void deleteCourse(Course course) {
		courseDao.delete(course);
	}
	public Course getCourse(int courseId) {
		Optional<Course> optional= courseDao.findById(courseId);
		return optional.get();
	}

}
