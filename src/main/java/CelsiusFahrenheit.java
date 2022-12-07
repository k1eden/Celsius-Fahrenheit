
public class CelsiusFahrenheit {
    double celsiusTemp;
    Rounder round = new Rounder();

    public CelsiusFahrenheit (double temp) {
        this.celsiusTemp = temp;

    }

    public double converter () {
        return round.roundOff(celsiusTemp * 1.8 + 32, 2);
    }

}
