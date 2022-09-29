package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// Stream API
    // паттерн builder

     Cat cat =  new Cat.Builder()
             .setAge(12)
    .setName("Tom")
    .addVaclist("v1")
    .setAge(10)
    .setName("T")
    .addVaclist("v2")
    .setAge(115)
    .setName("Jerry")
            .addVaclist("v2")
    .build();
        System.out.println(cat);
        //Stream API в java c версии 8.0
        // Объект класса Stream можно создать либо на основе массива либо на основе коллекции
        // ниже пример Stream на основе массива
      IntStream sInt= Arrays.stream(new int[]{1,2,3,4,5,6,7});
        System.out.println(sInt);
       Stream s = Stream.of ("oi","ei","ei","!");
        System.out.println(s);
        //на основе коллекции
        ArrayList<Double> list= new ArrayList<>();
        list.add(12.02);
        list.add(15.22);
        list.add(14.11);
        list.add(7.04);
        list.add(-5.07);
        Stream<Double> stream=list.stream();
        stream.filter((e)->e>0)
          .sorted(((o1, o2) -> (int)(o1-o2))).forEach(System.out::println);
        System.out.println(list);
        /*stream
                .filter((e)->e>10)
                .forEach(System.out::println);*/
        LinkedList<Double>filterList = new LinkedList<>();
        list.stream()
                .filter((e)->e>0)
                .forEach(filterList::add);
        System.out.println(filterList);
       Double d = list.stream()
                .filter((e)->e>0)
                .findFirst().get();
        System.out.println(d);
       boolean f= list.stream()
                .filter((e)->e>0)
                .allMatch((e)-> e>0 );
        System.out.println(f);
        boolean f2= list.stream()
                .filter((e)->e>0)
                .allMatch((e)-> e<12 );
        System.out.println(f2);
        Double g = list.stream()
                .max((a,b)->(int)(a-b)).get();
        System.out.println(d);
        //1,3,5,7
        //1)(1,3)->1+3
        //2)(4,5)-> 4+5
        // 3) (9,7)->9+7==16
      Double summ = list.stream().reduce( (p,c)->p+c ).get();
              System.out.println(summ);

        Double summ2 = list.stream().reduce( (p,c)->p+c ).get();

        System.out.println(summ2);
        list.parallelStream().forEach(System.out::println);
    }
}
