package projectsidea.devdojo.maratonajava.java.core.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumStreamLongIterate(num);
        sumParallelStreamLongIterate(num);

    }

    private static void sumStreamLongIterate(Long num){
        System.out.println("Sum STREAM LONG");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L,num).reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");

    }

    private static void sumStreamIterate(Long num){
        System.out.println("Sum STREAM ITERATE");

        long init = System.currentTimeMillis();
        long result = Stream.iterate(1l, i -> i + 1).limit(num).parallel().reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");

    }

    private static void sumFor(Long num){
        System.out.println("Sum FOR");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");

    }

    private static void sumParallelStreamLongIterate(Long num){
        System.out.println("Sum sumParallelLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L,num).parallel().reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");

    }

}
