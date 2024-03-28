package com.firstprojectsb.course.repository;

import com.firstprojectsb.course.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

//interface que controla o BD
public interface CourseRepository extends JpaRepository<Course, Long> {
                                            //Course - qual entity deve ser gerenciada e tipo do  ID


}
