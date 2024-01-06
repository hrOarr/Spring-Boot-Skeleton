package com.teamdemo.springbootskeleton.context;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingContext {

    private static final ThreadLocal<String> context = new ThreadLocal<>();

    public static void set(String value) {
        log.debug("Setting Logging context: {}", value);
        context.set(value);
    }

    public static String get() {
        return context.get();
    }

    public static void clear() {
        log.debug("Removing Logging context: {}", context.get());
        context.remove();
    }
}
