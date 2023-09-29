package io.github.efenglu.serviceLoader.example;

import java.util.ServiceLoader;

public class ServiceLoaderExample {

    public static void main(String [] args) {
        final ServiceLoader<SimpleService> services = ServiceLoader.load(SimpleService.class);
        for (SimpleService service : services) {
            System.out.println("Echo: " + service.echo(args[0]));
        }
    }
}