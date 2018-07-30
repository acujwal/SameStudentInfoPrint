package com.company;


import java.util.HashMap;
import java.util.Map;

public class Student {

        int id;
        String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String methodForReturingStudent( HashMap<Integer, String> student ){

        String listOfStudent="";

        for( Map.Entry<Integer,String> list : student.entrySet()){

            listOfStudent = listOfStudent + "\n" + list.getKey() + " " + list.getValue();
        }

        return listOfStudent;
    }

    //Practic of some method and example

    public int sum(int num1,int num2){

        return  num1+num2;
    }

    public int mul(int n, int n1){
        return n * n1;
    }

    public double avg(int n, int n1){
        return (n + n1) / 2;
    }
}
