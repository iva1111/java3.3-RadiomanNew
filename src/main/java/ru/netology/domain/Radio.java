package ru.netology.domain;

public class Radio {

    private int minStation = 0;
    private int maxStation = 9;
    private int station;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int volume;


    // текущая станция
    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station > maxStation) {
            return;
        }
        if (station < minStation) {
            return;
        }
        this.station = station;
    }

    //  следующая станция
    public void nextStation() {
        if (station < maxStation) {
            station++;
        } else {
            station = minStation;
        }
    }

    // предыдущая станция
    public void prevStation() {
        if (station > 0) {
            station--;
        } else {
            station = maxStation;
        }
    }



    // текущий звук
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    // увеличение звука
    public void plusVolume() {
        if (volume < maxVolume) {
            volume++;
        }
    }

    // уменьшение звука
    public void minusVolume() {
        if (volume > minVolume) {
            volume--;
        }
    }
}



