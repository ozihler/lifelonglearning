package com.zuehlke.app.lifelonglearning;

import com.zuehlke.app.lifelonglearning.dataaccess.AccountRepository;
import com.zuehlke.app.lifelonglearning.dataaccess.CourseRepository;
import com.zuehlke.app.lifelonglearning.dataaccess.ModuleRepository;
import com.zuehlke.app.lifelonglearning.domain.Account;
import com.zuehlke.app.lifelonglearning.domain.Course;
import com.zuehlke.app.lifelonglearning.domain.Module;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.HashSet;

@SpringBootApplication
public class LifelonglearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(LifelonglearningApplication.class, args);
    }

    @Bean
    CommandLineRunner init(AccountRepository accountRepository,
                           ModuleRepository moduleRepository,
                           CourseRepository courseRepository) {

        return (evt) -> {

            Account account = accountRepository.save(new Account("ozihler", "password"));
            HashSet<Account> accounts = new HashSet<>(Arrays.asList(account));

            Module module = moduleRepository.save(new Module("Clean Code", accounts));
            courseRepository.save(new Course(module, "Code Smells"));
            courseRepository.save(new Course(module, "Target Designs"));
            courseRepository.save(new Course(module, "Refactorings"));

        };
    }
}
