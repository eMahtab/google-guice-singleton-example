package net.mahtabalam;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;

import net.mahtabalam.module.HelloGuiceModule;
import net.mahtabalam.service.HelloGuiceService;

public class HelloGuiceApp_V2 {
	 
    
 
    public static void main(String[] args) {
        
    	HelloGuiceApp_V2 helloGuiceApp = new HelloGuiceApp_V2();
 
        Module module = new HelloGuiceModule();
        Injector injector = Guice.createInjector(module);
        HelloGuiceService helloGuiceService = injector.getInstance(HelloGuiceService.class); 
      
        helloGuiceApp.helloWorldGuice(helloGuiceService);
    }
 
    private void helloWorldGuice(HelloGuiceService helloGuiceService) {
        String testStr = helloGuiceService.serviceMethod("Hello World!");
        System.out.println(testStr);
    }
}