package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>();
        strs.add("asadas");
        strs.add("gasgfasg");
        strs.add("bbasdf");
        strs.add("tete");
        //Collections.sort(strs,(a,b)->a.compareTo(b));
        //strs.stream().forEach((s)->System.out.println(s));
//        strs.stream().forEach(Main::print);
//        FuncTest f = Main::print;
//        f.print("aaaa");
        //strs.stream().filter(s->s.startsWith("b")).forEach(Main::print);
        while(true)
        {
            System.out.println("a");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static void print(String s) {
        System.out.println("print " + s);
    }
}