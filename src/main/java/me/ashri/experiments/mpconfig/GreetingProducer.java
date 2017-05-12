package me.ashri.experiments.mpconfig;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class GreetingProducer {

    @Produces
    @Named("greeting")
    public String greeting() {
        return "Hello";
    }

}
