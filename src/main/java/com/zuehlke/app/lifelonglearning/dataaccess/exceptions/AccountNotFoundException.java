package com.zuehlke.app.lifelonglearning.dataaccess.exceptions;

public class AccountNotFoundException extends RuntimeException {

    public AccountNotFoundException(String username) {
        super(String.format("Could not find account with username %s", username));
    }
}
