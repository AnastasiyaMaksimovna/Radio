package org.example;

public class Radio {
    private int radioStationNumber;
    private int Volume = 0;


    public void next() {
        if (radioStationNumber < 9) {
            radioStationNumber = radioStationNumber + 1;
        } else {
            radioStationNumber = 0;
        }
    }

    public void prev() {
        if (radioStationNumber > 0) {
            radioStationNumber = radioStationNumber - 1;
        } else {
            radioStationNumber = 9;
        }
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber <= 9) {
            if (newRadioStationNumber >= 0) {
                radioStationNumber = newRadioStationNumber;
            }
        }
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getVolume() {
        return Volume;
    }

    public void increaseVolume() {
        if (Volume < 10) {
            Volume = Volume + 1;
        }
    }

    public void decreaseVolum() {
        if (Volume > 0) {
            Volume = Volume - 1;
        }
    }
}