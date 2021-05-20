package com.xworkz.javamail;

import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

public class MailSender {

	public static void main(String[] args) {

		JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();
		javaMailSenderImpl.setHost("smtp.gmail.com");
		javaMailSenderImpl.setPort(587);
		javaMailSenderImpl.setUsername("rakshithar.xworkz@gmail.com");
		javaMailSenderImpl.setPassword("password");

		Properties javaMailproperties = new Properties();
		javaMailproperties.put("mail.smtp.starttls.enable", "true");
		javaMailproperties.put("mail.smtp.auth", "true");
		javaMailproperties.put("mail.transport.protocol", "smtp");
		javaMailproperties.put("mail.debug", "true");
		javaMailproperties.put("mail.smtp.ssl.trust", "*");

		javaMailSenderImpl.setJavaMailProperties(javaMailproperties);

		SimpleMailMessage mailMessage = new SimpleMailMessage();
		String[] bccs = { "preranam.xworkz@gmail.com", "varsha.xworkz@gmail.com" };
		mailMessage.setFrom("rakshithar.xworkz@gmail.com");
		mailMessage.setTo("varalakshmi.xworkz@gmail.com");
		mailMessage.setCc("rakshitharajendra99@gmail.com");
		mailMessage.setBcc(bccs);
		mailMessage.setSubject("Demo Java Mail Sender");
		mailMessage.setText("Hi \n Hello \n How are you");

		javaMailSenderImpl.send(mailMessage);

	}
}
