
public class FahrenheitCelsius {
    double fahrenheitTemp;
    Rounder round = new Rounder();

    public FahrenheitCelsius (double temp) {
        this.fahrenheitTemp = temp;

    }

    public double converter () {
        return round.roundOff((fahrenheitTemp - 32) / 1.8, 2);
    }

}
