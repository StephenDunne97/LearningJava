/*
Author: Stephen Dunne
Date: 17/11/2020
Desc: Program to implement Euclids algorithm to find the greatest common denominator (GCD) of two numbers.
*/

public class Euclids_Simple {

    public static void main(String[] args) {
        int a = 800;
        int b = 88;

        while(b != 0){
            if (a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        System.out.println("GCD is: " + a);
    }
    
}
