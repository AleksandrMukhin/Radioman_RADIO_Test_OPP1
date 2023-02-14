package ru.netology.radio.test;

public class Radio {

    private int numberCurrentRadioStation;
    private int volumeSound;


    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public int setToMaxNumber() {
        return numberCurrentRadioStation = 9;
    }

    public void setNumberCurrentRadioStation(int radioStation) {
        if (radioStation < 0) {
            return;
        }
        if (radioStation > 9) {
            return;
        }
        numberCurrentRadioStation = radioStation;
    }

    public void next() {
        if (numberCurrentRadioStation >= 9) {
            setNumberCurrentRadioStation(0);
        } else {
            setNumberCurrentRadioStation(numberCurrentRadioStation + 1);
        }
    }

    public void prev() {
        if (numberCurrentRadioStation <= 0) {
            setNumberCurrentRadioStation(9);
        } else {
            setNumberCurrentRadioStation(numberCurrentRadioStation - 1);
        }
    }


    public int getVolumeSound() {
        return volumeSound;
    }

    public int setToMaxVolume() {
        return volumeSound = 10;
    }

    public void setVolumeSound(int radioVolume) {
        if (radioVolume < 0) {
            return;
        }
        if (radioVolume > 10) {
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

