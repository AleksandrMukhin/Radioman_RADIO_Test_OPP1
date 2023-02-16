package ru.netology.radio.test;

public class Radio {

    private int maxStation;
    private int minStation = 0;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volumeSound;

    public Radio(int quantityStation) {
        this.maxStation = quantityStation - 1;
    }

    public Radio() {
        maxStation = 9;
    }

    public int getNumberCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setNumberCurrentRadioStation(int radioStation) {
        if (radioStation < minStation) {
            return;
        }
        if (radioStation > maxStation) {
            return;
        }
        currentRadioStation = radioStation;
    }

    public void next() {
        if (currentRadioStation >= maxStation) {
            setNumberCurrentRadioStation(minStation);
        } else {
            setNumberCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void prev() {
        if (currentRadioStation <= minStation) {
            setNumberCurrentRadioStation(maxStation);
        } else {
            setNumberCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public int getVolumeSound() {
        return volumeSound;
    }


    public void setVolumeSound(int radioVolume) {
        if (radioVolume < minVolume) {
            return;
        }
        if (radioVolume > maxVolume) {
            return;
        }
        volumeSound = radioVolume;
    }

    public void volumeUp() {
        setVolumeSound(volumeSound + 1);
    }

    public void volumeDown() {
        setVolumeSound(volumeSound - 1);
    }
}

