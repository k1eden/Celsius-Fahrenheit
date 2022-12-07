public class Rounder {
     double roundOff(double x, int position)
    {
        double a = x;
        double temp = Math.pow(10.0, position);
        a *= temp;
        a = Math.round(a);
        return (a / temp);
    }
}
