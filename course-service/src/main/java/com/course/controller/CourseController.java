package com.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.course.entity.Course;
import com.course.service.CourseService;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/")
	public String getCourses(Model model) {
		model.addAttribute("courses",courseService.getCourses());
		return "index";
	}
	
	@GetMapping("/addCourseView")
	public String addCourseView(Model model) {
		model.addAttribute("course",new Course());
		return "addCourse";
	}
	
	@PostMapping("/addCourse")
	public String addUser(@ModelAttribute("course") Course course, Model model) {
		courseService.addUpdateCourse(course);
		model.addAttribute("courses",courseService.getCourses());
		return "index";
	}
	
	@GetMapping("/updateCoursePage")
	public String updateUserPage(@RequestParam("courseId") int courseId, Model model) {
		model.addAttribute("course",courseService.getCourse(courseId));
		return "updateCourse";
	}
	
	@PostMapping("/updateCourse")
	public String updateCourse(@ModelAttribute("course") Course course, Model model) {
		courseService.addUpdateCourse(course);
		model.addAttribute("courses",courseService.getCourses());
		return "index";
	}
	
	@GetMapping("/deleteCourse")
	public String deleteCourse(@ModelAttribute("course") Course course, Model model) {
		courseService.deleteCourse(course);
		model.addAttribute("courses",courseService.getCourses());
		return "index";
	}
}
