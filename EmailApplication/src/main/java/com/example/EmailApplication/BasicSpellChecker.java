package com.example.EmailApplication;


import org.springframework.stereotype.Component;

@Component
public class BasicSpellChecker implements SpellChecker{

    public void init(){
        System.out.println("init inside basic spell checker");
    }

    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            System.out.println("Checking spelling using BasicSpellChecker...");
            System.out.println("Spell Checking Completed!!");
        } else {
            throw new RuntimeException("An exception occurred " +
                    "while checking Spelling");
        }
    }

    public void destroy(){
        System.out.println("destroy inside basic spell checker");
    }
}
