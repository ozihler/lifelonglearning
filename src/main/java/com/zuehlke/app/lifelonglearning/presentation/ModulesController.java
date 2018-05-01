package com.zuehlke.app.lifelonglearning.presentation;

import com.zuehlke.app.lifelonglearning.dataaccess.AccountRepository;
import com.zuehlke.app.lifelonglearning.dataaccess.ModuleRepository;
import com.zuehlke.app.lifelonglearning.domain.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class ModulesController {
    private final ModuleRepository moduleRepository;
    private final AccountValidator accountValidator;

    @Autowired
    ModulesController(ModuleRepository moduleRepository, AccountRepository accountRepository) {
        this.moduleRepository = moduleRepository;
        accountValidator = new AccountValidator(accountRepository);
    }


    @RequestMapping(value = "/modules", method = RequestMethod.GET)
    public List<Module> getAllModules() {
        return moduleRepository.findAll();
    }

    @RequestMapping(value = "/modules/{username}", method = RequestMethod.GET)
    public Collection<Module> getModulesFor(@PathVariable String username) {
        accountValidator.exists(username);
        return moduleRepository.findByAccountsUsername(username);
    }

}
