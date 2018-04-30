package com.zuehlke.app.lifelonglearning.presentation;

import com.zuehlke.app.lifelonglearning.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController {

    @Autowired
    private Course course;

    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public String course() {
        course.setName("new course");

        return course.toString();
    }
}
