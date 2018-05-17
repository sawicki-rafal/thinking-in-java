package com.sawickirafal.chapter002;

class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }
}

public class Exercise011 {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow colorsOfTheRainbow = new AllTheColorsOfTheRainbow();
        colorsOfTheRainbow.changeTheHueOfTheColor(255);
    }
}
