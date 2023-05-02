package com.sparta.lmd;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(chooseOperation(4, 6, 4));
    }

    public static String chooseOperation(int operation,int x, int y){
        int result=0;
        switch (operation){
            case 1:
                result = add(x,y);
                break;
            case 2:
                result = subtract(x,y);
                break;
            case 3:
                result = multiply(x,y);
                break;
            case 4:
                result = divide(x,y);
                break;
            default:
                return "Error! Invalid Input";

        }
        return "The result is: "+result;
    }
    public static int add(int x, int y){
        return x+y;
    }
    public static int subtract(int x, int y){
        return x-y;
    }
    public static int multiply(int x, int y){
        return x*y;
    }
    public static int divide(int x, int y){
        return x/y;
    }


}
