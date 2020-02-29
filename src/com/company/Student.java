package com.company;

public class Student implements Comparable<Student> {
    private String name;
    private int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Student o) {
        return this.mark - o.getMark();
    }

    @Override
    public String toString() {
        return getMark() + " " + getName();
    }
}
