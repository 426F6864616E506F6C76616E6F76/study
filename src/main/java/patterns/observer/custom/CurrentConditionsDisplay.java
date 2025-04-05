package patterns.observer.custom;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("--- Current Conditionals ---");
        System.out.println("temperature: " + temperature + ";");
        System.out.println("temperature: " + humidity + ";");
        System.out.println("temperature: " + pressure + ";");
    }
}
