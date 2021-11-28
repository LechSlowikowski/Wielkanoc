package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner daneWejsciowe = new Scanner(System.in);
        System.out.print("Podaj rok, dla którego wyznaczymy Wielkanoc: ");
        int rok = daneWejsciowe.nextInt();

        Wielkanoc wielkanoc = new Wielkanoc(rok);
        wielkanoc.obliczWielkanoc();
        System.out.print("Wielkanoc w roku: " + wielkanoc.getRok());
        System.out.print(" wypada "+ wielkanoc.getDzien() + " " + wielkanoc.getMiesiac());
    }
}
