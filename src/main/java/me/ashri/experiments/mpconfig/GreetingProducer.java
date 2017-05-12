package me.ashri.experiments.mpconfig;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

public class GreetingProducer {

    @Inject
    @ConfigProperty(name = "greeting.word")
    String word;

    @Produces
    @Named("greeting")
    public String greeting() {
        return word;
    }

}
