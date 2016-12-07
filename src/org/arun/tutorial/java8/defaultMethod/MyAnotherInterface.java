package org.arun.tutorial.java8.defaultMethod;

/**
 * Created by Arun on 16-Nov-16.
 */
public interface MyAnotherInterface {

    String returnString(String string);

    default int returnInt() {
        return 106;
    }
}
