package com.example.EmailApplication;

public class AdvancedSpellChecker implements SpellChecker{
    public void checkSpelling(String emailMessage){
        if(emailMessage != null){
//            Determine the language of the email message
//            Check grammatical errors in the email message
//            Check spellings in the email message
            System.out.println("spell check completed !");
        }else{
            throw  new RuntimeException("An exception occured while " + "checking spelling");
        }
    }
}
