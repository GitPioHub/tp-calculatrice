package com.pdjb.tptest;

import java.util.Scanner;

public class Addition {
  public static double addition() {
    double a;

    Scanner scan = new Scanner(System.in); 
    System.out.println("Entrez un nombre");
    a = scan.nextDouble(); 
    System.out.println("Entrez un 2eme nombre");
    double b;
    b = scan.nextDouble(); 
    double res = add(a, b);    
    return res;
  }
  
  public static double add(double a, double b) { 
    double res = a + b;
    return res;
  }
}
