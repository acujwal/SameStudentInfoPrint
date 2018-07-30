package com.company;

import java.util.HashMap;

public class Main {

    public  static void main(String[] args){

        // hash map to put student list
        HashMap<Integer, String> st = new HashMap<>();

        //create new student
        Student student = new Student();

        student.setId(1);
        student.setName("Ujwal");

        String name = student.getName();
        int id = student.getId();

        //adding into hashmap each time student is created
        st.put( id,name);

        //create another new student
        student = new Student();

        student.setId(2);
        student.setName("Pratik");

        //adding into hashmap each time student is created
        st.put(student.getId(),student.getName());

        //create another new student
        student = new Student();
        student.setId(3);
        student.setName("Pratik");
        //adding into hashmap each time student is created
        st.put(student.getId(),student.getName());

        //create another new student
        student = new Student();
        student.setId(4);
        student.setName("Kabin");
        //adding into hashmap each time student is created
        st.put(student.getId(),student.getName());

        //create another new student
        student = new Student();
        student.setId(5);
        student.setName("Ankit");
        //adding into hashmap each time student is created
        st.put(student.getId(),student.getName());

        //setting the value of the hashmap to the toString method of Student class to print
        String print = student.methodForReturingStudent(st);

        //printing all the list of students for the hashmap
        System.out.println(print);

        // practic of some method

        int x = 500;
        int y = 400;

        int addition = student.sum(x,y);
        System.out.println("Addition : "  + addition);

        int mul = student.mul(x,y);
        System.out.println("Multiplication : "+ mul);

        double avg = student.avg(x,y);
        System.out.println("Average : " + avg);





    }
}