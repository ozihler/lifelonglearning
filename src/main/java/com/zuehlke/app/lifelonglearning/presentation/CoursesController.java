package com.zuehlke.app.lifelonglearning.presentation;

import com.zuehlke.app.lifelonglearning.domain.Course;
import com.zuehlke.app.lifelonglearning.domain.Module;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController {
    @RequestMapping(value = "/modules", method = RequestMethod.GET)
    public void modules() {

    }

}
