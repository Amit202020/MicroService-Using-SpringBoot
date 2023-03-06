package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="rest")
public class RestServiceConfig{
	
	   private String message;
        private String buildversion;
        private String mail;
        private String subject;
        
        
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getBuildversion() {
			return buildversion;
		}
		public void setBuildversion(String buildversion) {
			this.buildversion = buildversion;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		@Override
		public String toString() {
			return "AccountServiceConfig [message=" + message + ", buildversion=" + buildversion + ", mail=" + mail
					+ ", subject=" + subject + "]";
		}
           
}