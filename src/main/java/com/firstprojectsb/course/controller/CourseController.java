package com.firstprojectsb.course.controller;

import com.firstprojectsb.course.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    //http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(new Course(1, "ADS", "Ranga"),
                                new Course(2, "SI", "Karen"),
                                new Course(3, "Math", "Luiz"));
    }

    //http://localhost:8080/courses/1
    @GetMapping("/courses/1")
    public Course getOneCourseDetails() {
        return new Course(1, "ADS", "Ranga");
    }
}
