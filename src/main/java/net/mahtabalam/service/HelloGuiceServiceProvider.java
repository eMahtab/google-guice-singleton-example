package net.mahtabalam.service;

import com.google.inject.Provider;

public class HelloGuiceServiceProvider implements Provider<String>{
	
	public String get() {
		System.out.println("HelloGuiceServiceProvider.get() being called");
        return "Singleton scope test";
	}
}