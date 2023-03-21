package observer.withapi;

import observer.withapi.displays.ForecastDisplay;
import observer.withapi.displays.StatisticsDisplay;
import observer.withapi.displays.CurrentConditionsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(20,65,30.4f);
        weatherData.setMeasurements(17,70,29.2f);
        weatherData.setMeasurements(15,85, 31.5f);
    }
}
