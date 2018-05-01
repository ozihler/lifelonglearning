package com.zuehlke.app.lifelonglearning.dataaccess;

import com.zuehlke.app.lifelonglearning.domain.Account;
import com.zuehlke.app.lifelonglearning.domain.Module;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface ModuleRepository extends JpaRepository<Module, Long> {
    Collection<Module> findByAccountsUsername(String username);

}
