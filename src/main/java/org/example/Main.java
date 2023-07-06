package org.example;


import abstractfactory.*;
import builder.*;
import command.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ComponentFactory factory = new LinuxFactory();

        Button button = factory.createButton("버튼");
        CheckBox box = factory.createCheckBox(false);
        TextEditer text = factory.createTextEditor("Design Pattern");

        button.render();
        box.render();
        text.render();

        button.clickEvent();
        box.setbChecked(true);
        text.setValue("GoF's Pattern");
    }
}