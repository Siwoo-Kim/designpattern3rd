package observer;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private Weather weather;
    private float lastPressure = Float.MIN_VALUE;
    private Observable weatherData;

    public ForecastDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void update(Observable o, Object args) {
        if (args instanceof Weather) {
            if (this.weather != null)
                lastPressure = weather.getPressure();
            this.weather = (Weather) args;
            display();
        }
    }

    public void display() {
        System.out.print("Forecast: ");
        float currentPressure = weather.getPressure();
        if (lastPressure == Float.MIN_VALUE)
            System.out.println("Waiting for more data to forecast...");
        else if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}

