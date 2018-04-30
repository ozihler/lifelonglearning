package com.zuehlke.app.lifelonglearning.presentation;

import com.zuehlke.app.lifelonglearning.domain.Course;
import com.zuehlke.app.lifelonglearning.domain.Courses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController {
    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public Courses courses() {

        return Courses.create("courses 1", "courses 2");
    }

    @RequestMapping(value = "/courses", method = RequestMethod.POST)
    public void addCourse(Course course) {
        System.out.printf("Received course: %s", course.getName());

    }
}
