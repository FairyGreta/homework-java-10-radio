package ru.netology.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    //Тесты Блока 1. Радиостанции
    // Изменение радиостанции вручную
    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            "-9, 0",
            "0, 0",
            "1, 1",
            "9, 9",
            "10, 0"
    })
    public void shouldSetRadioStation(int currentRadioStation, int expected) {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(currentRadioStation);

        int actual = radioStation.currentRadioStation;

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
    public void shouldSetNextRadioStationAll(int currentRadioStation, int expected) {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(currentRadioStation);
        radioStation.nextRadioStation();

        int actual = radioStation.getCurrentRadioStation();

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
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(currentRadioStation);
        radioStation.prevRadioStation();

        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //Тесты блока 2. Громкость звука
    // Присвоение громкости
    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            "0, 0",
            "10, 10",
            "11, 0"
    })
    public void shouldSetVolume(int currentVolume, int expected) {
        Radio volume = new Radio();

        volume.setCurrentVolume(currentVolume);

        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Увеличение громкости до предела 10
    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 2",
            "9, 10",
            "10, 10"
    })
    public void shouldUpCurrentVolume(int currentVolume, int expected) {
        Radio volume = new Radio();

        volume.setCurrentVolume(currentVolume);
        volume.upCurrentVolume();

        int actual = volume.getCurrentVolume();

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
        Radio volume = new Radio();

        volume.setCurrentVolume(currentVolume);
        volume.downCurrentVolume();

        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
