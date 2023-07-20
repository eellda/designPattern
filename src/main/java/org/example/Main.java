package org.example;


import abstractfactory.*;
import builder.*;
import command.*;
import interpreter.BeginExpression;
import interpreter.Context;
import interpreter.Expression;
import state.Player;
import visitor.AvgVistior;
import visitor.Item;
import visitor.ItemList;
import visitor.SumVisitor;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ItemList list1 = new ItemList();
        list1.add(new Item(10));
        list1.add(new Item(20));
        list1.add(new Item(40));

        ItemList list2 = new ItemList();
        list2.add(new Item(20));
        list2.add(new Item(30));

        list1.add(list2);
        ItemList list3 = new ItemList();
        list3.add(new Item(25));
        list2.add(list3);

        SumVisitor sum = new SumVisitor();
        list1.accept(sum);
        System.out.println(sum.getValue());

        AvgVistior avg = new AvgVistior();
        list1.accept(avg);
        System.out.println(avg.getValue());

    }
}