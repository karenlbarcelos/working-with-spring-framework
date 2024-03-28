package com.firstprojectsb.course.controller;

import com.firstprojectsb.course.bean.Course;
import com.firstprojectsb.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    //http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
//        return Arrays.asList(new Course(1, "ADS", "Ranga"),
//                                new Course(2, "SI", "Karen"));
    }

    //http://localhost:8080/courses/1
    @GetMapping("/courses/1")
    public Course getOneCourseDetails() {
        return new Course(1, "ADS", "Ranga");
    }
}
