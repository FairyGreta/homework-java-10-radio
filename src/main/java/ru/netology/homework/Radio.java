package ru.netology.homework;

public class Radio {
    protected int quantityRadioStation = 10;
    protected int maxCurrentRadioStation = 9;
    protected int minCurrentRadioStation = 0;
    protected int currentRadioStation = minCurrentRadioStation;
    protected int minVolume = 0;
    protected int maxVolume = 100;
    protected int currentVolume = minVolume;

    //Радиостанции
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minCurrentRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxCurrentRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
        maxCurrentRadioStation = quantityRadioStation - 1;
    }

    public Radio() {

    }

    public void next() {
        if (currentRadioStation < maxCurrentRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > minCurrentRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxCurrentRadioStation;
        }
    }

    // Громкость
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    //Уменьшение громкости
    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}
