package ru.netology.homework;

public class Radio {
    private int quantityRadioStation = 10;
    private int maxCurrentRadioStation = 9;
    private int minCurrentRadioStation = 0;
    private int currentRadioStation = minCurrentRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;


    //геттеры
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public Radio() {

    }

    // Блок 1. Переключение радиостаций. Сеттер
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minCurrentRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxCurrentRadioStation) {
            return;
        }

        currentRadioStation = newCurrentRadioStation;
    }

    //метод next
    public void nextRadioStation() {
        if (currentRadioStation < maxCurrentRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    // метод prev
    public void prevRadioStation() {
        if (currentRadioStation > minCurrentRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxCurrentRadioStation;
        }
    }

    // Блок 2. Громкость
    public int getCurrentVolume() {
        return currentVolume;
    }

    // Сеттер
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }

        currentVolume = newCurrentVolume;
    }

    //Увеличение громкости
    public void upCurrentVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    //Уменьшение громкости
    public void downCurrentVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}
