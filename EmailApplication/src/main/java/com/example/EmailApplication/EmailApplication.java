package com.example.EmailApplication;

import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class EmailApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);

//		ApplicationContext applicationContext =
//				new ClassPathXmlApplicationContext("beans.xml");
		EmailClient emailClient = applicationContext.getBean("emailClient", EmailClient.class);
		emailClient.sendEmail("Hey, " +
				"This is my first email message.");
		emailClient.sendEmail("Hey, " +
				"This is my second email message.");


		AdvancedSpellChecker advancedSpellChecker = applicationContext.getBean("advancedSpellChecker" , AdvancedSpellChecker.class);
		System.out.println(advancedSpellChecker);
		AdvancedSpellChecker advancedSpellChecker1 = applicationContext.getBean("advancedSpellChecker" , AdvancedSpellChecker.class);
		System.out.println(advancedSpellChecker1);


	}

}















