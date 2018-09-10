package chapter02_oberserver;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public class CurrentConditionsDisplay implements Oberserver, DisplayElement {

    float temp;
    float humidity;
    Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temp + " degrees" + humidity);
    }
}
