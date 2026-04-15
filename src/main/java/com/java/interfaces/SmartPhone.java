package com.java.interfaces;

public class SmartPhone implements Camera, MusicPlayer{

	public void takePhoto() {
		System.out.println("Capturing the photo...");
	}
	
	public void playMusic() {
		System.out.println("Play music...");
	}
	
	public void makeCall() {
		System.out.println("Make call...");
	}
	
}
