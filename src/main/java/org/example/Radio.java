package org.example;

public class Radio {
    private int radioStationNumber;
    private int Volume = 0;
    private int quantityStation;
    private int minStanion = 0;

    public Radio (int quantityStation){
        this.quantityStation = quantityStation;
    }
    public Radio (){
        this.quantityStation = 10;
    }

    public int getQuantityStation(){
        return quantityStation;
    }


    public void next() {
        if (radioStationNumber < quantityStation - 1) {
            radioStationNumber = radioStationNumber + 1;
        } else {
            radioStationNumber = minStanion;
        }
    }

    public void prev() {
        if (radioStationNumber > minStanion) {
            radioStationNumber = radioStationNumber - 1;
        } else {
            radioStationNumber = quantityStation - 1;
        }
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber <= quantityStation - 1) {
            if (newRadioStationNumber >= minStanion) {
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
        if (Volume < 100) {
            Volume = Volume + 1;
        }
    }

    public void decreaseVolum() {
        if (Volume > 0) {
            Volume = Volume - 1;
        }
    }
}