package com.company;

import java.util.Comparator;

public class StudentComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(!(o1 instanceof com.company.Student && o2 instanceof com.company.Student))
            throw new IllegalArgumentException("Объекты не являются студентами!");

        return ((com.company.Student) o1).getGPA() - ((com.company.Student) o2).getGPA();
    }
}
