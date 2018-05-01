package com.zuehlke.app.lifelonglearning.dataaccess;

import com.zuehlke.app.lifelonglearning.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Collection<Course> findByModuleName(String moduleName);
}
