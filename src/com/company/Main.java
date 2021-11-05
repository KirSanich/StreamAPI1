package com.company;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        Worker worker = new Worker("Kirill", 21, "Russia", 8000, "Developer");
        Worker worker1 = new Worker("Olga", 17, "Russia", 80000, "Farmer");
        Worker worker2 = new Worker("Mike", 40, "USA", 70000, "Guardian");
        Worker worker3 = new Worker("Ive", 61, "Canada", 15000, "Medic");
        Worker worker4 = new Worker("Rex", 31, "German", 30000, "Military");
        Worker worker5 = new Worker("Tacker", 32, "Italy", 5000, "Developer");
        Worker worker6 = new Worker("Nick", 57, "Russia", 10000, "Developer");
        Worker worker7 = new Worker("Sasha", 18, "Russia", 100000, "Racer");
        Worker worker8 = new Worker("Tom", 47, "Japan", 90000, "Seller");
        Worker worker9 = new Worker("Ben", 17, "Mexico", 75000, "Builder");

        List<Worker> workerList = new ArrayList<>();
        workerList.add(worker);
        workerList.add(worker1);
        workerList.add(worker2);
        workerList.add(worker3);
        workerList.add(worker4);
        workerList.add(worker5);
        workerList.add(worker6);
        workerList.add(worker7);
        workerList.add(worker8);
        workerList.add(worker9);

        Stream<Worker> workerStream = workerList.stream();
        var count = workerStream.filter((Worker w) -> w.getSalary() > 50000).count();
        System.out.println(count);
        Stream<Worker> workerStream1 = workerList.stream();
        workerStream1.flatMap(x->Stream.of("Зп плюс 1000",x.getSalary()+1000,"Зп минус 1000", x.getSalary()-1000)).forEach(System.out::println);



        Stream<Integer> stream = Stream.of(2, 5, 7, 8, 9, 0, 1, 3);
        Stream<Integer> stream1 = Stream.of(0,0);
        Stream.concat(stream,stream1).forEach(x-> System.out.print(x+" "));

        Stream<String> stringStream = Stream.of("Kirill","Mach","Kirill","Kirill","JJJUR","F","POJFAJWFP[JP[AF");
        var result = stringStream.distinct().sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(result);

        Stream<Integer> stream2 = Stream.of(6,9,0,1,4,6,7,8);
        var result2 = stream2.mapToInt(s->s).summaryStatistics();
        System.out.println(result2);




        Map<Integer, String> hash = new HashMap<>();
        hash.put(0, "Key");
        hash.put(1, "Kol");
        hash.put(8, "May");
        hash.put(3, "Trey");



    }
}
