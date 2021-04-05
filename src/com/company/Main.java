package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        primersPrint(20);
    }
    public static boolean isPrimers(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
            else {
            for(int i = 2 ; i <= Math.sqrt(n) ; i++){
                if (n % i == 0){
                    return false;
                }
            }
         }
        return true;
    }

    public static void primersPrint(int n){
        int count = 0;
        int i = 2;
        while(count < n){
            if(isPrimers(i)) {
                System.out.println(i);
                count++;
            }
        i++;

        }
    }
}

