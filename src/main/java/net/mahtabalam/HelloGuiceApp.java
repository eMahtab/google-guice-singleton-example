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
        
        /* injector.injectMembers
         * 
         * Injects dependencies into the fields and methods of instance. 
        Ignores the presence or absence of an injectable constructor.
        Whenever Guice creates an instance, it performs this injection automatically 
        (after first performing constructor injection), so 
        if you're able to let Guice create all your objects for you, you'll never need to use this method.*/
        
        injector.injectMembers(helloGuiceApp);
 
        helloGuiceApp.helloWorldGuice();
    }
 
    private void helloWorldGuice() {
        String testStr = helloGuiceService.serviceMethod("Hello World!");
        System.out.println(testStr);
    }
}