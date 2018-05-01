package com.zuehlke.app.lifelonglearning.presentation;

import com.zuehlke.app.lifelonglearning.dataaccess.AccountRepository;
import com.zuehlke.app.lifelonglearning.dataaccess.exceptions.AccountNotFoundException;

public class AccountValidator {
    private AccountRepository accountRepository;

    public AccountValidator(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void exists(String username) {
        this.accountRepository.findByUsername(username)
                .orElseThrow(() -> new AccountNotFoundException(username));
    }
}
