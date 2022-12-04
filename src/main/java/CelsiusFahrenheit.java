
public class CelsiusFahrenheit {
    double celsiusTemp;

    public CelsiusFahrenheit (double temp) {
        this.celsiusTemp = temp;

    }

    public double converter () {
        return celsiusTemp * 1.8 + 32;
    }

}
