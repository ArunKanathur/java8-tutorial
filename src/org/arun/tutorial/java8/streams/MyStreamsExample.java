package org.arun.tutorial.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Arun on 18-Nov-16.
 */
public class MyStreamsExample {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("ddd2", "aaa2", "bbb1", "aaa1", "bbb3", "ccc", "bbb2", "ddd1");

        filter(strings);
        filterAndSorted(strings);
        filterAndSortedUsingComparator(strings);
        map(strings);
        match(strings);
        count(strings);
        reduce(strings);
        collect(strings);

        System.out.println("\n\nOriginal list below:::");
        strings.stream().forEach(System.out::println);
    }

    private static void filter(List<String> strings){
    	System.out.println("MyStreamsExample.filter()");
        strings.stream().filter(s-> s.startsWith("a")).forEach(System.out::println);
        System.out.println("\n\n\n");
    }

    private static void filterAndSorted(List<String> strings){
    	System.out.println("MyStreamsExample.filterAndSorted()");
        strings.stream().filter(s-> s.contains("ddd")).sorted().forEach(System.out::println);
        System.out.println("\n\n\n");
    }

    private static void filterAndSortedUsingComparator(List<String> strings){
    	System.out.println("MyStreamsExample.filterAndSortedUsingComparator()");
        strings.stream().filter(s-> s.contains("ddd")).sorted((s1,s2)-> s2.compareTo(s1)).forEach(System.out::println);
        System.out.println("\n\n\n");
    }

    private static void map(List<String> strings){
    	System.out.println("MyStreamsExample.map()");
        strings.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("\n\n\n");
    }

    private static void match(List<String> strings){
    	System.out.println("MyStreamsExample.match()");
        System.out.println("Any element contains 'a'="+strings.stream().anyMatch(s-> s.contains("a")));
        System.out.println("All elements contain 'a'="+strings.stream().allMatch(s-> s.contains("a")));
        System.out.println("No elements contain 'z'="+strings.stream().noneMatch(s-> s.contains("z")));
        System.out.println("\n\n\n");
    }

    private static void count(List<String> strings){
    	System.out.println("MyStreamsExample.count()");
        System.out.println(strings.stream().filter(s-> s.contains("a")).count());
        System.out.println("\n\n\n");
    }

    private static void reduce(List<String> strings){
    	System.out.println("MyStreamsExample.reduce()");
        strings.stream().reduce((s1,s2) -> (s1+"#"+s2).toUpperCase()).ifPresent(System.out::println);
        System.out.println("\n\n\n");
    }
    
    private static void collect(List<String> strings){
    	System.out.println("MyStreamsExample.collect()");
         List<String> fliteredList = strings.stream().filter((s) -> s.contains("1")).collect(Collectors.toList());
         fliteredList.stream().forEach(System.out::println);
         System.out.println("\n\n\n");
    }
}
