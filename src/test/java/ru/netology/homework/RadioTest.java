package ru.netology.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    Radio radio = new Radio();

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "9, 9",
            "10, 0"
    })
    public void shouldSetRadioStation(int currentRadioStation, int expected) {
        radio.setCurrentRadioStation(currentRadioStation);

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Next. Граничные значения
    @ParameterizedTest
    @CsvSource({
            "8, 9",
            "9, 0",
            "0, 1",
            "1, 2"
    })
    public void shouldSetNextRadioStation(int currentRadioStation, int expected) {
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}

