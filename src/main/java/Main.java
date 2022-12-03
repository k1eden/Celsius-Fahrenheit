import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double temp = 0;
        boolean is_ok = false;

        System.out.println("Type 1 for C -> F converting or 2 for F->C");
        Scanner console1 = new Scanner(System.in);
        temp = console1.nextInt();

        if (temp == 1) {
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
            System.out.format("%.2f", test.converter());
        } else if (temp ==  2) {
            temp = 0;
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
            System.out.format("%.2f", test.converter());

        }
    }

}