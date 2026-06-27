package com.vikram.designpatterns.singleton;

public final class AppConfig {
    private final String environment = "dev";

    private AppConfig() {
    }

    public static AppConfig getInstance() {
        return Holder.INSTANCE;
    }

    public String getEnvironment() {
        return environment;
    }

    private static final class Holder {
        private static final AppConfig INSTANCE = new AppConfig();
    }
}
