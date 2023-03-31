package com.company.example;

import java.lang.ref.WeakReference;
import java.util.*;

public class MainExample {

    public static void main(String[] args) throws CloneNotSupportedException {

//        Address address = new Address("Gyumri", new Date(2018,7,29));
//        User user = new User(
//                1,"poxos",
//                "poxosyan",
//                new Date(2020,9,
//                        15),address);
//
//        User userDuplicate = new User(user.getId(), user.getName(), user.getSurname(), user.getBirthday(),user.getAddress());
////        Comparator<User> comparator = Comparator.comparingInt(user.getId());
//        Set<User> userSet = new LinkedHashSet<>();
//        userSet.add(user);
//        userSet.add(userDuplicate);
//        System.out.println(userSet);

//        System.out.println("before clone "+user);
//        User clone = user.clone();
//        clone.setId(5);
//        clone.setBirthday(new Date(1999,2,20));
//        System.out.println(user);
//
//
//        WeakReference<User> userWeakReference = new WeakReference<>(user);

//        String str="a12345.00";
////        double valueOfDouble=Double.parseDouble(str);//12345.0
////        System.out.println(valueOfDouble);
//        float valueOfFloat=Float.parseFloat(str);//12345.0
//        System.out.println(valueOfFloat);
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
    }
}

