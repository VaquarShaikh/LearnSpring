package com.example.EmailApplication;

public class EmailClient {
    private SpellChecker spellChecker;

//    private BasicSpellChecker basicSpellChecker

    EmailClient(SpellChecker spellChecker){
//        this.basicspellchecker = new BasicSpellChecker()
        this.spellChecker = spellChecker;
    }

    public void sendEmail(String emailMessage) {
        spellChecker.checkSpelling(emailMessage);
    }
}
