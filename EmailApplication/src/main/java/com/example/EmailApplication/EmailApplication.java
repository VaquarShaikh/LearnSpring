package com.example.EmailApplication;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class EmailApplication {

	public static void main(String[] args) {

//		SpringApplication.run(EmailApplication.class, args);
		EmailClient emailClient = new EmailClient();

		emailClient.sendEmail("Hey, " + "This is the first email message :)");

		emailClient.sendEmail("Hey, " + "This is the second email message :)");


	}

}
