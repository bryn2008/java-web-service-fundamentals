package training;


enum Temperature {
    CELSIUS, FAHRENHEIT, KELVIN
}

enum TemperatureScale {
    CELSIUS("C"), FAHRENHEIT("F"), KELVIN("K");
    public final String SCALE;
    private TemperatureScale(String scale) {
        this.SCALE = scale;
    }
    public String getScale() {
        return SCALE;
    }
}