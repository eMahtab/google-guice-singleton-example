package net.mahtabalam.module;

import com.google.inject.AbstractModule;
import net.mahtabalam.service.HelloGuiceService;
import net.mahtabalam.service.HelloGuiceServiceImpl;
 
public class HelloGuiceModule extends AbstractModule {
 
	protected void configure() {
		// add configuration logic here
		bind(HelloGuiceService.class).to(HelloGuiceServiceImpl.class);
 
	}
}