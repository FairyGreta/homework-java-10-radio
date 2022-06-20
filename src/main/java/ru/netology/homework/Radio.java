package ru.netology.homework;

public class Radio {

    // Блок 1. Переключение радиостаций
    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    // сеттер
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
        } else if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }

    }

    // метод prev
//        public void prevRadioStation() {
//            if (currentRadioStation > 0) {
//                currentRadioStation = currentRadioStation - 1;
//            } else if (currentRadioStation == 0) {
//                currentRadioStation = 9;
//            }
//        }

    // Блок 2. Громкость

}
