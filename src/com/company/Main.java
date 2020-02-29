package com.company;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	    TreeSet<Student> students = new TreeSet<>();
	    students.add(new Student("Ivanov",50));
        students.add(new Student("Petrov",3));
        students.add(new Student("Sidorov",11));
        students.add(new Student("AAAAAA",70));
        students.add(new Student("NNNNNN",17));
        students.add(new Student("NNNNNN",17));


        for(Student i: students) {
            System.out.println(i.getMark() + " " + i.getName());
        }

        /* SortedSet<Student> result =
                students.tailSet(new Student("",11));
        */

        students.subSet(new Student("",11),
                       new Student("",50));
       // System.out.println(result);
    }
}
