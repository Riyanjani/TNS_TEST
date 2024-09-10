package com.tcet;
public class Question1{
	@FunctionalInterface
	interface Sayable {
	    String sayable(String name);
	}
	public static void main(String[] args){
		        Sayable greet = (name) -> "Hello, " + name + "!";
		        String message = greet.sayable("Riyanjani");
		        System.out.println(message);  
             }
    }