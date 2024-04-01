package com.firstprojectsb.course.controller;

import com.firstprojectsb.course.bean.Course;
import com.firstprojectsb.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;
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

    //POST - Create a new resource
    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course){
        courseRepository.save(course);
    }

    //PUT - Update a specific course
    @PutMapping("/courses/{id}")
    public void updateCourses(@RequestBody Course course, @PathVariable long id){
        courseRepository.save(course);
    }

    //DELETE - Delete a specific course
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id) {
        if (courseRepository.findById(id).isEmpty()) {
            throw new RuntimeException("Course not found with id " + id);
        } else {
            courseRepository.deleteById(id);
        }

    }

}
