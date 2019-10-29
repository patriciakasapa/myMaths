package com.company;

public class Numbers {


    private static boolean True;
    private static boolean False;
    private int a;
    private int b;


    public Numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
    public static int sum(int b, int a) {
        int total;
        total = a + b;

        return total;
    }

    public static boolean positive(int num){
        if (num > 0){
            return (True);
        }
        else return (False);
    }
}
