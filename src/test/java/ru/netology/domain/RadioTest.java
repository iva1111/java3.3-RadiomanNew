package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test // не устанавливать станцию > max
    public void notSetStationMoreMax() {
        radio.setStation(9);
        assertEquals(radio.getStation(), 9);
    }

    @Test // если больше мах то ноль
    public void moreMaxThenZero() {
        radio.setStation(10);
        assertEquals(radio.getStation(), 0);
    }

    @Test // если меньше мin то ноль
    public void lessMinThenZero() {
        radio.setStation(-1);
        assertEquals(radio.getStation(), 0);
    }

    @Test // не устанавливать станцию > min
    public void notSetStationMoreMin() {
        radio.setStation(1);
        assertEquals(radio.getStation(), 1);
    }

    @Test  // установи станцию после 9 - 0
    public void setNextStationAfterNine() {
        radio.setStation(9);
        radio.nextStation();
        assertEquals(radio.getStation(), 0);
    }

    @Test  // установи станцию перед 0 - 9
    public void setPrevStationAfterZero() {
        radio.setStation(0);
        radio.prevStation();
        assertEquals(radio.getStation(), 9);
    }

    @Test  // установить станцию после 0 - 1
    public void setNextStationAfterZero() {
        radio.setStation(0);
        radio.nextStation();
        assertEquals(radio.getStation(), 1);
    }

    @Test  // установи станцию перед 9 - 8
    public void setRadioStationNamberNine() {
        radio.setStation(9);
        radio.prevStation();
        assertEquals(radio.getStation(), 8);
    }

    @Test // установи любой номер станции
    public void setAnyStationNamber() {
        radio.setStation(4);
        assertEquals(radio.getStation(), 4);
    }


    @Test // установи звук меньше 0
    public void setVolumeLess0() {
        radio.setVolume(0);
        radio.minusVolume();
        assertEquals(radio.getVolume(), 0);
    }

    @Test // установи звук больше 10
    public void setVolumeMore10() {
        radio.setVolume(10);
        radio.plusVolume();
        assertEquals(radio.getVolume(), 10);
    }


    @Test // увеличить звук свыше 0
    public void plusVolumeOverMax() {
        radio.setVolume(0);
        radio.plusVolume();
        assertEquals(radio.getVolume(), 1);
    }

    @Test // уменьшить звук меньше 10
    public void minusVolumeMinThenZero() {
        radio.setVolume(10);
        radio.minusVolume();
        assertEquals(radio.getVolume(), 9);
    }


}




