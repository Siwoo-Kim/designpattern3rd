package observer;

import java.util.Observable;

public class WeatherData extends Observable {
    private Weather weather;

    public WeatherData() {
    }

    public void measurementChanged() {
        setChanged();
        notifyObservers(weather);
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.weather = new Weather(temperature, humidity, pressure);
        measurementChanged();
    }

    public Weather getWeather() {
        return weather;
    }
}
