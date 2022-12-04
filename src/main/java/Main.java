

public class Main {
    public static void main(String[] args) {
        if (args.length == 2) {
          if (!args[1].matches("^(- ?)?[0-9]+(.[0-9]+)?$")) {
            System.out.println("Please, enter correct digit. You can use only digits, dot and '-' sign");

        }  else {
            switch (args[0]) {
                case ("-fh") -> {
                    FahrenheitCelsius fc = new FahrenheitCelsius(Double.parseDouble(args[1]));
                    System.out.format("%.2f", fc.converter());
                }
                case ("-cl") -> {
                    CelsiusFahrenheit cf = new CelsiusFahrenheit(Double.parseDouble(args[1]));
                    System.out.format("%.2f", cf.converter());
                }
                default -> System.out.println("Please, enter correct mode. (-cl - From Celsius, -fh - from Farenheit)");
            }
          }
        }
        else System.out.println("Use arguments! The first is direction of converting (-cl - From Celsius, -fh - from Farenheit)" +
                " and the second is temperature");
    }
}


