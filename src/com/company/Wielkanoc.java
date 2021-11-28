package com.company;

public class Wielkanoc {
    private int wartoscA = 15;
    private int wartoscB = 6;
    private int rok;
    private String miesiac;
    private int dzien;

    public Wielkanoc(int rok) {
        this.rok = rok;
        if( rok<=1582) {
            wartoscA = 15;
            wartoscB = 6;
        }
        else if (rok >=1583 && rok<=1699) {
            wartoscA = 22;
            wartoscB = 2;
        }
        else if (rok >=1700 && rok<=1799) {
            wartoscA = 23;
            wartoscB = 3;
        }
        else if (rok >=1800 && rok<=1899) {
            wartoscA = 23;
            wartoscB = 4;
        }
        else if (rok >=1900 && rok<=2099) {
            wartoscA = 24;
            wartoscB = 5;
        }
        else if (rok >=2100 && rok<=2199) {
            wartoscA = 24;
            wartoscB = 6;
        }
        else if (rok >=2200 && rok<=2299) {
            wartoscA = 25;
            wartoscB = 0;
        }
        else if (rok >=2300 && rok<=2399) {
            wartoscA = 26;
            wartoscB = 1;
        }
        else if (rok >=2400 && rok<=2499) {
            wartoscA = 25;
            wartoscB = 1;
        }
    }

    public void obliczWielkanoc(){
        int a = rok % 19;
        int b = rok % 4;
        int c = rok % 7;
        int d = (a * 19 + wartoscA) % 30;
        int e = (2*b + 4*c + 6*d + wartoscB) % 7;

        //wielkanoc = 22 marzec + d + e
        dzien = 22 + d + e;
        if(d==29 && e==6){
            dzien = 19;
            miesiac = "kwietnia";
        }
        else if(d==28 && e==6){
            dzien = 18;
            miesiac = "kwietnia";
        }
        else if(dzien > 31 ) {
            dzien = dzien - 31;
            miesiac = "kwietnia";
        }else{
            miesiac = "marca";
        }
    }

    public int getRok() {
        return rok;
    }

    public String getMiesiac() {
        return miesiac;
    }

    public int getDzien() {
        return dzien;
    }
}
