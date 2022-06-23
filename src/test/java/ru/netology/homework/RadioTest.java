package ru.netology.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    Radio radioman = new Radio(10);
    Radio radio = new Radio();

    //Тесты Блока 1. Радиостанции
    // Изменение радиостанции вручную
    @ParameterizedTest
    @CsvSource({
            "-1, 0",
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

    //Prev. Граничные значения
    @ParameterizedTest
    @CsvSource({
            "8, 7",
            "9, 8",
            "0, 9",
            "1, 0"
    })
    public void shouldSetPrevRadioStation(int currentRadioStation, int expected) {
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevRadioStation();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //Тесты блока 2. Громкость звука
    // Присвоение громкости
    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            "0, 0",
            "1, 1",
            "100, 100",
            "111, 0"
    })
    public void shouldSetCurrentVolume(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Увеличение громкости до предела 10
    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 2",
            "99, 100",
            "100, 100"
    })
    public void shouldUpCurrentVolume(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        radio.upCurrentVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Уменьшение громкости до предела 0
    @ParameterizedTest
    @CsvSource({
            "1, 0",
            "2, 1",
            "10, 9",
            "0, 0"
    })
    public void shouldDownCurrentVolume(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        radio.downCurrentVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
