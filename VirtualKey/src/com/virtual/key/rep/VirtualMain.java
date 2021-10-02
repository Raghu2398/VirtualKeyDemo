package com.virtual.key.rep;

public class VirtualMain {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("Virtual_KEY", "Raghavendra DC");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}