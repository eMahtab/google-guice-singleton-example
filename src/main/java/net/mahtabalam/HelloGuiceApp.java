package net.mahtabalam;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;

import net.mahtabalam.module.HelloGuiceModule;
import net.mahtabalam.service.HelloGuiceService;

public class HelloGuiceApp {
	 
	 @Inject
	    HelloGuiceService helloGuiceService;
	 
	    public static void main(String[] args) {
	        
	    	HelloGuiceApp helloGuiceApp = new HelloGuiceApp();
	 
	        Module module = new HelloGuiceModule();
	        Injector injector = Guice.createInjector(module);
	        injector.injectMembers(helloGuiceApp);
	 
	        helloGuiceApp.providerTest();
	    }
	 
	    private void providerTest() {
	        String testStr = helloGuiceService.serviceMethod("Hello World!");
	        System.out.println(testStr);
	    }
}