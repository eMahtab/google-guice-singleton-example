package net.mahtabalam.module;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

import net.mahtabalam.service.HelloGuiceServiceProvider;
 
public class HelloGuiceModule extends AbstractModule {
	 
	protected void configure() {
		bind(String.class).toProvider(HelloGuiceServiceProvider.class).in(Singleton.class);
 
	}
}