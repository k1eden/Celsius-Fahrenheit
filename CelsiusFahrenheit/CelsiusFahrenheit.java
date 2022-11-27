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
        double temp;
        Scanner console = new Scanner(System.in);
        temp = console.nextDouble();
        CelsiusFahrenheit test = new CelsiusFahrenheit(temp);
        System.out.print(test.converter());
    }
 }
