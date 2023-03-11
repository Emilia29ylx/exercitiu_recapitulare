package com.recapitulare.exercitiu1;
import java.util.Scanner;
public class Tema {
    public static void main(String[] args) {

        System.out.println("Apasa y daca vrei sa introduci x si y sau n daca vrei sa introduci z.");
        Scanner scanner=new Scanner (System.in);
        String line = scanner.nextLine();
        if(line.equals("y")){
            System.out.println("Introdu x si y:");
            int x=1;
            int y=1;
            try{
                x= scanner.nextInt();
                y= scanner.nextInt();
            } catch (Exception e){
                System.out.println("Nu e numar");
            }
            int z = calculZ(x, y);
            System.out.println("Z = "+z);
        } else {
            System.out.println("Introdu z:");
            int z = 1;
            int x = calculX(z);
            int y = calculY(z,x);
            try{
                z= scanner.nextInt();
            } catch (Exception e){
                System.out.println("Nu e numar");
            }
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
        }
    }
    private static int calculZ(int x, int y){
        int z = ((int) Math.pow(2,x)*((2*y)+1))-1;
        return z;
    }
    private static int calculX(int z){
        int i = 0;
        while((z+1)%2==0){
                z=((z+1)/2)-1;
                i=i+1;
        }
        int x = i;
        return x;
    }
    private static int calculY(int z, int x){
        int y = ((int) ((z+1)/Math.pow(2,x))-1)/2;
        return y;
    }
}