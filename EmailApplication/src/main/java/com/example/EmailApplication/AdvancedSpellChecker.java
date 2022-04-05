package com.example.EmailApplication;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Scope("prototype")
public class AdvancedSpellChecker implements SpellChecker{
    public void checkSpelling(String emailMessage){
        if (emailMessage != null) {
            System.out.println("Checking spelling using Advanced Spell Checker...");
            System.out.println("Spell Checking Completed!!");
        } else {
            throw new RuntimeException("An exception occurred " +
                    "while checking Spelling");
        }
    }

}
