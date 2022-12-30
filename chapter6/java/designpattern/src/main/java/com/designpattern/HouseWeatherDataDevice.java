package com.designpattern;

/**
 * HouseWeatherDataDevice as concrete Observer class implement Observer interface
 * the device register WeatherData subject. It will get notified when weather condition changed
 *
 * @Author Bridget Wu
 */
public class HouseWeatherDataDevice implements Observer {

    private float temperature;

    private float humidity;

    private int wind;

    public HouseWeatherDataDevice(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    /**
     * implement Observer update method
     *
     * @param temperature
     * @param humidity
     * @param wind
     */
    @Override
    public void update(float temperature, float humidity, int wind) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind = wind;
        displayWeatherData();
    }

    /**
     * display the current weather data
     */
    public void displayWeatherData() {
        System.out.println("HouseWeatherDataDevice weather data:");
        System.out.println(" Temperature: " + temperature + "F");
        System.out.println(" Humidity: " + this.humidity + "%");
        System.out.println(" Wind: " + this.wind + "mph");
    }

}
