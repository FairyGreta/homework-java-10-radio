package ru.netology.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int quantityRadioStation = 10;
    private int maxCurrentRadioStation = 9;
    private int minCurrentRadioStation = 0;
    private int currentRadioStation = minCurrentRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minCurrentRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxCurrentRadioStation) {
            return;
        }

        currentRadioStation = newCurrentRadioStation;
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
}
