package com.newpackage;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("printing all the days of the week");
        for (EnumDay day : EnumDay.values()) {
            System.out.println(day);

        }
    }
}
