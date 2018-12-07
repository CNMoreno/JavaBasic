package com.cnmc.java8.Streams;



import java.util.stream.Stream;

public class InfiniteStreams {

   

    public static void main(String[] args) {
        doWhileOldWay();

        doWhileStreamWay();

    }

    private static void doWhileOldWay() {

        int i = 0;
        while (i < 10) {
            i++;
        }
    }

    private static void doWhileStreamWay() {
        Stream<Integer> integers = Stream.iterate(0, i -> i + 2);
        integers.limit(10).forEach(System.out::println);
    }
}
