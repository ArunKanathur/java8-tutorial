package org.arun.tutorial.java8.defaultMethod;

/**
 * Created by Arun on 16-Nov-16.
 */
public interface MyInterface {

    String returnString(String string);

    default int returnInt() {
        return 105;
    }
}
