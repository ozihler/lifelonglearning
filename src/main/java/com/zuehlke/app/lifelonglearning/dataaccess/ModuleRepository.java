package com.zuehlke.app.lifelonglearning.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zuehlke.app.lifelonglearning.domain.Module;
import java.util.Collection;

public interface ModuleRepository extends JpaRepository<Module, Long> {
    Collection<Module> findByUsername(String username);
}
