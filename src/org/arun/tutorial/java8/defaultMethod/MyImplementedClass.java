package org.arun.tutorial.java8.defaultMethod;

/**
 * Created by Arun on 17-Nov-16.
 */
public class MyImplementedClass implements MyInterface, MyAnotherInterface {

    public String returnString(String string) {
        return string;
    }

    /**
     * If we do not override this method, it gives compile issue since this method is a default method in both the interfaces
     *
     * @returns String
     */
    public int returnInt() {
        return 107;
    }

    public static void main(String[] args) {
        MyImplementedClass aClass = new MyImplementedClass();

        if (aClass.returnInt() == 107) {
            System.out.println("Default method works as expected");
        } else {
            System.err.println("Default method does not work as expected");
        }
    }
}
