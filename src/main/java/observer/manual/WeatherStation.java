package observer.manual;

import observer.manual.displays.CurrentConditionsDisplay;
import observer.manual.displays.ForecastDisplay;
import observer.manual.displays.StatisticsDisplay;
import observer.manual.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(20,65,30.4f);
        weatherData.setMeasurements(17,70,29.2f);
        weatherData.setMeasurements(15,85, 31.5f);
    }
}
