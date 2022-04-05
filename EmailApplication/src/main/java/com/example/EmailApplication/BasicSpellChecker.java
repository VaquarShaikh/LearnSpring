package com.example.EmailApplication;

public class BasicSpellChecker {
    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            System.out.println("Checking spelling using BasicSpellChecker...");
            System.out.println("Spell Checking Completed!!");
        } else {
            throw new RuntimeException("An exception occurred " +
                    "while checking Spelling");
        }
    }

}
