package com.company.advancedCoding.temp;

public class TemperatureConverter {
    private static final float ABSOLUTE_ZERO_CELSIUS = -273f;

    public static double convertToCelsius(float fahrenheit) throws IllegalArgumentException {
        float celsius = performConversion(fahrenheit, (fah) -> (fah - 32) / 1.8f);

        if (celsius < ABSOLUTE_ZERO_CELSIUS) {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero.");
        }
        return celsius;
    }

    public static double convertToFahrenheit(float celsius) throws IllegalArgumentException {
        if (celsius < ABSOLUTE_ZERO_CELSIUS) {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero.");
        }

        return performConversion(celsius, (cel) ->  (cel * 1.8f) + 32);

    }

    private static float performConversion(float temp, ConvertTemperature conversion) {
        return conversion.convert(temp);
    }
}
