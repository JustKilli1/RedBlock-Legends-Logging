package net.marscraft.base;

import net.marscraft.shared.logging.type.FileLogger;
import net.marscraft.shared.logging.ILogger;
import net.marscraft.shared.logging.LogCategory;
import net.marscraft.shared.logging.LogLevel;

public class MainLogger extends FileLogger implements ILogger {

    private String name;

    public MainLogger(String name) {
        super(LogCategory.SYSTEM, name + ".txt");
        this.name = name;
    }

    @Override
    public void log(LogLevel logLevel, String message, Exception ex) {
        logToFile(formatMessage(logLevel, name, message, ex));
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        log(logLevel, message, null);
    }

    @Override
    public void log(LogLevel logLevel, Exception ex) {
        log(logLevel, null, ex);
    }

    @Override
    public String getName() {
        return name;
    }
}
