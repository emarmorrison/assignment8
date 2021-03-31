package a8;

public class Temperature {
    private double [] windSpeed;
    private String [] day;
    private double [] temp;
    private double [] feel;

    public double[] getFeel() {
        return feel;
    }

    public void setFeel(double[] feel) {
        this.feel = feel;
    }

    public Temperature() {
    }

    public Temperature(double[] windSpeed, String[] day, double[] temp) {
        this.windSpeed = windSpeed;
        this.day = day;
        this.temp = temp;
    }

    public double[] getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double[] windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String[] getDay() {
        return day;
    }

    public void setDay(String[] day) {
        this.day = day;
    }

    public double[] getTemp() {
        return temp;
    }

    public void setTemp(double[] temp) {
        this.temp = temp;
    }

    public void calculateFeel(){
        double [] feel;
        double []temp;
        temp = getTemp();
        feel = getFeel();
        for ( int x=0; x < getTemp().length; x++)
        {
            feel[x] = getTemp()[x] * getWindSpeed()[x];
            setFeel(feel);
        }
    }
}
