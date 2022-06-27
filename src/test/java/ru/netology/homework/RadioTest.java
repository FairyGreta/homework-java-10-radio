package ru.netology.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    //Радиостанции
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
        Radio radio = new Radio();
        radio.setCurrentRadioStation(currentRadioStation);

        assertEquals(expected, radio.getCurrentRadioStation());
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
        Radio radio = new Radio();
        radio.setCurrentRadioStation(currentRadioStation);
        radio.next();

        assertEquals(expected, radio.getCurrentRadioStation());
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
        Radio radio = new Radio();
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prev();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    //Установить радиостанций 20 и вызвать текущей 15
    @ParameterizedTest
    @CsvSource({
            "20, 15, 15",
            "30, 10, 10",
            "40, 5, 5",
            "50, 28, 28"
    })
    public void shouldSetRadioStation20(int quantityRadioStation, int currentRadioStation, int expected) {
        Radio radio = new Radio(quantityRadioStation);
        radio.setCurrentRadioStation(currentRadioStation);

        assertEquals(expected, radio.getCurrentRadioStation());

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
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        assertEquals(expected, radio.getCurrentVolume());
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
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();

        assertEquals(expected, radio.getCurrentVolume());
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
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }
}
