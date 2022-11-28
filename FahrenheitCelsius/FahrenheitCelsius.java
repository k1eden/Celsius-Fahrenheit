package FahrenheitCelsius;

import java.util.Scanner;

public class FahrenheitCelsius {
        double fahrenheitTemp;

        public FahrenheitCelsius (double temp) {
            this.fahrenheitTemp = temp;

        }

        public double converter () {
            return (fahrenheitTemp - 32) / 1.8;
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
            FahrenheitCelsius test = new FahrenheitCelsius(temp);
            System.out.print(test.converter());
        }
    }
