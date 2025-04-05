package patterns.observer.custom;

public class Main {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurement(22.0f,89.0f,778.0f);
        weatherData.setMeasurement(22.5f,89.6f,778.3f);
        weatherData.setMeasurement(22.1f,89.7f,778.2f);
    }
}
