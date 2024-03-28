package com.firstprojectsb.course.controller;

import com.firstprojectsb.course.bean.Course;
import com.firstprojectsb.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
    @GetMapping("/courses/{id}")
    public Course getOneCourseDetails(@PathVariable long id) {
        Optional<Course> course = courseRepository.findById(id);
        if(course.isEmpty()){
            throw new RuntimeException("Course not found with id " + id);
        }
        return course.get();
        //return new Course(1, "ADS", "Ranga");
    }
}
