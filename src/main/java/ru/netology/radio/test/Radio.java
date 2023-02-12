package ru.netology.radio.test;

public class Radio {

    private int numberCurrentRadioStation;
    private int volumeSound;

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setToMaxNumber() {
        numberCurrentRadioStation = 9;
    }

    public void next() {
        if (numberCurrentRadioStation < 9) {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
        }
    }

    public void prev(int newPrev) {
        if (newPrev > 1) {
            numberCurrentRadioStation = newPrev - 1;
        }
    }

    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation < 0) {
            return;
        }
        if (newNumberCurrentRadioStation > 9) {
            return;
        }
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }

    public int getVolumeSound() {
        return volumeSound;
    }

    public void setToMaxVolume() {
        volumeSound = 10;
    }

    public void volumeUp() {
        if (volumeSound < 10) {
            volumeSound = volumeSound + 1;
        }
    }

    public void volumeDown(int newVolumeDown) {
        if (newVolumeDown > 0) {
            volumeSound = newVolumeDown - 1;
        }
    }
}
