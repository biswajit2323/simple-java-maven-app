package com.mycompany.app;

import java.io.Console;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
    	Properties prop = new Properties(); 
    	try {
			prop.load(new FileInputStream("config.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
    	String password = prop.getProperty("password");
    	System.out.println(password);
    	
    	try {
    		throw new Exception();
    	}
    	catch(Exception e) {
    		System.console().writer().println(e);
    	}
        return message;
    }

}
