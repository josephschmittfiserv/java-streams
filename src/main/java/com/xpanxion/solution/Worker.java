package com.xpanxion.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.xpanxion.java.assignments.DataAccess;
import com.xpanxion.java.assignments.model.Cat;
import com.xpanxion.java.assignments.model.Department;
import com.xpanxion.java.assignments.model.Person;
import com.xpanxion.java.assignments.model.Product;
import static com.xpanxion.java.assignments.DataAccess.getProducts;
import static com.xpanxion.java.assignments.DataAccess.getWords;
import static com.xpanxion.java.assignments.DataAccess.getDepartments;
import static com.xpanxion.java.assignments.DataAccess.getPeople;

public class Worker {

    public void ex1() {
        System.out.println(getProducts().stream()
                .map(f -> new Product(f.getId(), f.getDepartmentId(),
                        getDepartments().get(f.getDepartmentId() - 1).getName(),
                        f.getName(), f.getPrice(), f.getSku()))
                .collect(Collectors.toList()));
    }

    public void ex2() {
        System.out.println(getProducts().stream()
                .map(f -> new Product(f.getId(), f.getDepartmentId(),
                        "N/A",
                        f.getName(), f.getPrice(), f.getSku()))
                .collect(Collectors.toList()));
    }

    public void ex3() {
        List<Product> prodList = DataAccess.getProducts();
        System.out.println(prodList.stream().filter(p -> p.getDepartmentId() == 1 && p.getPrice() >= 10)
                .collect(Collectors.toList()));
    }

    public void ex4() {
        List<Product> prodList = DataAccess.getProducts();

        System.out.println(prodList.stream().filter(p -> p.getDepartmentId() == 2)
                .mapToDouble(p -> p.getPrice()).sum());
    }

    public void ex5() {
        List<Person>peopleList = DataAccess.getPeople().stream()
        .map(f -> new Person(f.getId(), f.getFirstName(), f.getLastName(), f.getAge(), f.getSsn().substring(7)))
        .collect(Collectors.toList());

        System.out.println(peopleList.stream().filter(p -> p.getId() <= 3)
                .collect(Collectors.toList()));
    }

    public void ex6() {
        List<Cat>catList = DataAccess.getCats().stream()
        .map(f -> new Cat(f.getId(), f.getName(), f.getAge(), f.getColor()))
        .collect(Collectors.toList());

        catList.sort(Comparator.comparing(Cat::getName));

        System.out.println(catList.stream().collect(Collectors.toList()));
    }

    public void ex7() {
        String[] wordList = getWords().split(" ");

        HashMap<String, Integer> wordHashMap = new HashMap<>();

        for (int i = 0; i < wordList.length; i++) {
            wordHashMap.put(wordList[i], wordHashMap.getOrDefault(wordList[i], 0) + 1);
        }

        System.out.println(wordHashMap);
    }

    public void ex8() {
        System.out.println(getPeople().stream()
                .map(f -> new Person(f.getId(), f.getFirstName(),
                        "null", 0, "null"))
                .collect(Collectors.toList()));
    }

    public void ex9() {
        List<Product> prodList = DataAccess.getProducts();

        System.out.println(prodList.stream().filter(p -> p.getDepartmentId() == 1)
                .mapToDouble(p -> p.getPrice() + 2).sum());
    }

    public void ex10() {
        List<Cat>catList = DataAccess.getCats().stream()
        .map(f -> new Cat(f.getId(), f.getName(), f.getAge(), f.getColor()))
        .collect(Collectors.toList());
        List<Person>peopleList = DataAccess.getPeople().stream()
        .map(f -> new Person(f.getId(), f.getFirstName(), f.getLastName(), f.getAge(), f.getSsn().substring(7)))
        .collect(Collectors.toList());

        

        System.out.println(peopleList.stream().filter(p -> p.getId() <= 3)
                .collect(Collectors.toList()));
    }
}

