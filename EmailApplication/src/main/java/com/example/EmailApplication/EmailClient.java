package com.example.EmailApplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class EmailClient {

//    For field injection
    @Autowired
    @Qualifier("basicSpellChecker")

    private SpellChecker spellChecker;

//    private BasicSpellChecker basicSpellChecker
//Constructor injection
//    EmailClient(SpellChecker spellChecker){
////        this.basicspellchecker = new BasicSpellChecker()
//        this.spellChecker = spellChecker;
//    }

//    Using setter injection
//    EmailClient(){
//
//    }
//
//    public SpellChecker getSpellChecker() {
//        return spellChecker;
//    }
//
//    @Autowired
//    public void setSpellChecker(@Qualifier("basicSpellChecker") SpellChecker spellChecker) {
//        this.spellChecker = spellChecker;
//    }

//    Field Injection

    public void sendEmail(String emailMessage) {
        spellChecker.checkSpelling(emailMessage);
    }
}
