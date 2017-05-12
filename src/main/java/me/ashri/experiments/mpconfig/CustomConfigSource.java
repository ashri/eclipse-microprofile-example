package me.ashri.experiments.mpconfig;

import org.eclipse.microprofile.config.spi.ConfigSource;

import java.util.HashMap;
import java.util.Map;

public class CustomConfigSource implements ConfigSource {

    private final Map<String, String> properties;

    public CustomConfigSource() {
        properties = new HashMap<>();
        properties.put("greeting.word", "Aloha");
    }

    @Override
    public Map<String, String> getProperties() {
        return properties;
    }

    @Override
    public String getValue(String s) {
        return properties.get(s);
    }

    @Override
    public String getName() {
        return "customConfigSource";
    }
}
