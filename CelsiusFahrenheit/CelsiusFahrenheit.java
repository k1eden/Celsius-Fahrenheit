package CelsiusFahrenheit;

import java.util.Scanner;

public class CelsiusFahrenheit {
    double celsiusTemp;

   public CelsiusFahrenheit (double temp) {
       this.celsiusTemp = temp;

   }

   public double converter () {
       return celsiusTemp * 1.8 + 32;
   }

    public static void main(String[] args) {
        double temp = 0;
        boolean is_ok = false;
        while (!is_ok) {
        try {
            Scanner console = new Scanner(System.in);
            temp = console.nextDouble();
            is_ok = true;
        } catch (java.util.InputMismatchException e) {
            System.out.println("Incorrect input. Please use digits and comma");
            }
        }
        CelsiusFahrenheit test = new CelsiusFahrenheit(temp);
        System.out.print(test.converter());
    }
 }
