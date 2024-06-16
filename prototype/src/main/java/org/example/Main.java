package org.example;

public class Main {
    public static void main(String[] args) {
       var factory = new HeroFactory(
               new ElfBeast("protecting")
       );

        var beast = factory.createBeast();

        System.out.println(beast);
    }

}