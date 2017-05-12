package me.ashri.experiments.mpconfig;

import org.eclipse.microprofile.config.spi.ConfigSource;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class CustomConfigSource implements ConfigSource {

    private final static Logger LOG = Logger.getLogger(CustomConfigSource.class.getName());

    private final Map<String, String> properties;

    public CustomConfigSource() {
        properties = new HashMap<>();
        properties.put("greeting.word", "Aloha");
    }

    @Override
    public Map<String, String> getProperties() {
        LOG.info("Returning all properties");
        return properties;
    }

    @Override
    public String getValue(String s) {
        LOG.info("Returning property for " + s);
        return properties.get(s);
    }

    @Override
    public String getName() {
        return "customConfigSource";
    }
}
