package observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private Weather weather;
    private Observable weatherData;

    public CurrentConditionDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + weather.getTemperature() + "F degrees and " + weather.getHumidity() + "% humidity.");
    }


    public void update(Observable o, Object arg) {
        if (arg instanceof Weather) {
            this.weather = (Weather) arg;
            display();
        }
    }
}
