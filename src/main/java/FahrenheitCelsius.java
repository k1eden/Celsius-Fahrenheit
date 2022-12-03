
public class FahrenheitCelsius {
    double fahrenheitTemp;

    public FahrenheitCelsius (double temp) {
        this.fahrenheitTemp = temp;

    }

    public double converter () {
        return (fahrenheitTemp - 32) / 1.8;
    }

}
