package net.mahtabalam.service;

import com.google.inject.Provider;

public class HelloGuiceServiceProvider implements Provider<HelloGuiceService>{
	
	@Override
	public HelloGuiceService get() {
		HelloGuiceService helloGuiceService = new HelloGuiceServiceImpl();
        return helloGuiceService;
	}
	
}