package chapter02_oberserver;

import java.util.ArrayList;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public class WeatherData implements Subject {

    private ArrayList<Oberserver> oberservers = new ArrayList<Oberserver>();

    float temp;
    float humidity;
    float pressure;

    void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    void measurementsChanged() {
        notifyObservers();
    }

    public void registerObserver(Oberserver o) {
        oberservers.add(o);
    }

    public void remverObserver(Oberserver o) {
        final int i = oberservers.indexOf(o);
        if (i >= 0) {
            oberservers.remove(i);
        }
    }

    public void notifyObservers() {
        for (Oberserver oberserver : oberservers) {
            oberserver.update(temp, humidity, pressure);
        }
    }
}
