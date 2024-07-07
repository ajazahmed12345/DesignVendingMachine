package org.example.customSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


       int i, j;


       for(i=5; i >= 1; i = i-1){
           int spaces = 5 - i;

           for(j=1; j <= spaces; j = j+1){
               System.out.print(" ");
           }

           for(j=1; j <= i; j = j+1){
               System.out.print("*");
           }

           System.out.println();
       }





    }
}
