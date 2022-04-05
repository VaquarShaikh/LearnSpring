package com.example.EmailApplication;

public class EmailClient {
    private SpellChecker spellChecker;

    EmailClient(SpellChecker spellChecker){
        this.spellChecker = spellChecker;
    }

    public void sendEmail(String emailMessage) {
        spellChecker.checkSpelling(emailMessage);
    }
}
