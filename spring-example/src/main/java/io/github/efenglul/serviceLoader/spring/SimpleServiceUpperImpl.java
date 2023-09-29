package io.github.efenglul.serviceLoader.spring;

import org.springframework.stereotype.Component;

@Component
public class SimpleServiceUpperImpl implements SimpleService {
    public String echo(final String value) {
        return value.toUpperCase();
    }
}
