package com.company;

public class Main {

    public static void main(String[] args) {

        One o = new One(2,3,4);
        Two t = new Two(2,3);
        Two t2 = new Two(2);
        Three th = new Three(2,3,4);

        System.out.println(o.perimeter());
        System.out.println(t.perimeter());




    }
}
