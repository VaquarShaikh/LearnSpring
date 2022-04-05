package com.example.EmailApplication;

public class EmailClient {
    private BasicSpellChecker basicSpellChecker;

    EmailClient(){
        this.basicSpellChecker = new BasicSpellChecker();
    }

    public void sendEmail(String emailMessage) {
        basicSpellChecker.checkSpelling(emailMessage);
    }
}
