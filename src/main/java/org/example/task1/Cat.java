package org.example.task1;

import java.util.Random;

public class Cat {
    private void sleep() {
        System.out.println("Sleep");
    }

    private String meow() {
      return "Meow";
    }

    private String eat() {
      return "Eat";
    }

    public void status() {
       int random = new Random().nextInt(3);
       switch (random) {
           case 0:
               sleep();
               break;
           case 1:
               meow();
               break;
           case 2: eat();
           break;
           default:
               System.out.println("None");
               break;
       }
    }
}
