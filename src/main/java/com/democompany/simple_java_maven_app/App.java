package com.democompany.simple_java_maven_app;

/**
 * Hello world! code for App.java
 *
 */
public class App 
{
	 private final String message = "Hello World!";

	    public App() {}

	   public static void main(String[] args) {
	        System.out.println(new App().getMessage());
	    }

	    private final String getMessage() {
	        return message;
	    }
}
// This code is not written by Anirban but I am working on Teamcity CI/CD pipelines