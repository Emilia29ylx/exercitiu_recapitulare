package com.recapitulare.exercitiu1;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//Scanner scanner=new Scanner (System.in);
//String line = scanner.nextLine();
int[] vector= {1,2,3,4};


for (int i = 0; i<4; i++) {
    if (vector[i]%2==0) {
        System.out.println("Numarul " + i + " este: " + vector[i]);
    }
    else {
        System.out.println("e impar");
    }
}
    }
}