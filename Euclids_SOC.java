/*
Author: Stephen Dunne
Date: 17/11/2020
Desc: Program to implement Euclids algorithm to find the greatest common denominator (GCD) of two numbers that adopts a Seperation of Concerns (SOC) approach by using classes.
*/

public class Euclids_SOC {

    public static void main(String[] args) {
        Euclid x = new Euclid();
        int y; 
        y = x.GCD(800, 88);
        System.out.println("GCD is: " + y);
    }
    
}

class Euclid{
    public int GCD(int a, int b){
        while(b != 0){
            if (a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        return a;
    }
}
