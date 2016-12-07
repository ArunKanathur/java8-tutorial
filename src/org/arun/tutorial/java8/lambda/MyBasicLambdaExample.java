package org.arun.tutorial.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Arun on 17-Nov-16.
 */
@SuppressWarnings("unused")
public class MyBasicLambdaExample {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("shankar", "arun", "santhosh");

        System.out.println("Before calling sort");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println();

        //priorJava8(strings);
        //usingJava8(strings);
        //usingJava8RemoveBracesAndReturnKeyword(strings);
        usingJava8RemoveBracesAndReturnKeywordAndDataType(strings);

        System.out.println("After calling sort");
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println("\nValue returned from multiStatementLambda="+multipleStatementsInLambda());

    }

	private static void priorJava8(List<String> strings) {
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
    }

    private static void usingJava8(List<String> strings) {
        Collections.sort(strings, (String s1, String s2) -> {
            return s2.compareTo(s1);
        });
    }

    /**
     * For single statement, return and braces can be eliminated
     *
     * @param strings
     */
    private static void usingJava8RemoveBracesAndReturnKeyword(List<String> strings) {
        Collections.sort(strings, (String s1, String s2) ->
                s2.compareTo(s1)
        );
    }

    /**
     * For single statement, even the data-type can be eliminated
     *
     * @param strings
     */
    private static void usingJava8RemoveBracesAndReturnKeywordAndDataType(List<String> strings) {
        Collections.sort(strings, (s1, s2) ->
                s2.compareTo(s1)
        );
    }

    public static int multipleStatementsInLambda(){
        final int x = 20;
        Comparator<String> comparator = (a, b)-> {
            int y = (a.compareTo(b) + x);
            int z = y + x;
            return z;
        };
        return comparator.compare("a", "a");
    }
}
