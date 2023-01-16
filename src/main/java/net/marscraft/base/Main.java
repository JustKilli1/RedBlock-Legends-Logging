package net.marscraft.base;

import net.marscraft.shared.logging.LogLevel;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String test = "asd";
        MainLogger mainLogger = new MainLogger("MainLogger");
        try {
            Integer.parseInt(test);
        } catch (Exception ex) {
            mainLogger.log(LogLevel.ERROR, null, ex);
        }
    }

}
