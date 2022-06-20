package ru.netology.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    //Тесты Блока 1. Радиостанции
    // Изменение радиостанции вручную
    @Test
    public void shouldSetRadioStation() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(8);

        int expected = 8;
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
    public void shouldSetNextRadioStation(int currentRadioStation, int expected) {
        Radio radioStation = new Radio();

        radioStation.nextRadioStation();

        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }
// Переключение. Prev. Граничные значения
//    @ParameterizedTest
//    @CsvSource({
//            "8, 7",
//            "9, 8",
//            "0, 9",
//            "1, 0"
//    })
//    public void shouldSetPrevRadioStation (int currentRadioStation, int expected) {
//        Radio prev = new Radio();
//
//        prev.prevRadioStation();
//
//        int actual = prev.currentRadioStation;
//
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test // проверка присвоения громкости
//    public void shouldSetVolume() {
//        Radio volume = new Radio();
//
//        volume.currentVolume = 15;
//
//        int expected = 15;
//        int actual = volume.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test //проверка присвоения меньше минимума
//    public void shouldNotSetVolumeBelowMin() {
//        Radio volume = new Radio();
//
//        volume.getCurrentVolume(-1);
//
//        int expected = 0; // как здесь приравнять к текущей температуре, а не к 0
//        int actual = volume.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }


}
