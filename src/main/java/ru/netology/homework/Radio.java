package ru.netology.homework;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    // Блок 1. Переключение радиостаций. Сеттер
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }

        currentRadioStation = newCurrentRadioStation;
    }

    //метод next
    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else
            currentRadioStation = 0;
    }

    // метод prev
    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else
            currentRadioStation = 9;
    }

    // Блок 2. Громкость
    public int getCurrentVolume() {
        return currentVolume;
    }

    // Сеттер
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }

        currentVolume = newCurrentVolume;
    }

    //Увеличение громкости
    public void upCurrentVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else
            currentVolume = 10;
    }

    //Уменьшение громкости
    public void downCurrentVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else
            currentVolume = 0;
    }
}
