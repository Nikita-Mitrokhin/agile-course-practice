package ru.unn.agile.TemperatureConverter.model;

public class FahrenheitTemperature extends Temperature {
    @Override
    protected double getAbsoluteZero() {
        final double absoluteZero = -459.67;
        return absoluteZero;
    }

    public FahrenheitTemperature(final double value) throws IllegalArgumentException {
        super(value);
    }

    public FahrenheitTemperature(final String value) {
        super(value);
    }
}
