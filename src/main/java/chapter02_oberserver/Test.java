package chapter02_oberserver;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);

    }

}
