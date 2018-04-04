package net.mahtabalam.module;

import com.google.inject.AbstractModule;

import net.mahtabalam.service.HelloGuiceService;
import net.mahtabalam.service.HelloGuiceServiceProvider;
 
public class HelloGuiceModule extends AbstractModule {
	 
	protected void configure() {
		bind(HelloGuiceService.class).toProvider(HelloGuiceServiceProvider.class);
 
	}
}