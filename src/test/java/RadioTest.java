import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.test.Radio;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetNumberStationBelowMin() {
        radio.setNumberCurrentRadioStation(-5);
        Assertions.assertEquals(0, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetNumberStationNegative() {
        radio.setNumberCurrentRadioStation(-1);
        Assertions.assertEquals(0, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetNumberStationMin() {
        radio.setNumberCurrentRadioStation(0);
        Assertions.assertEquals(0, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetNumberStationLowerBound() {
        radio.setNumberCurrentRadioStation(1);
        Assertions.assertEquals(1, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetNumberStation() {
        radio.setNumberCurrentRadioStation(5);
        Assertions.assertEquals(5, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetNumberStationUpperBound() {
        radio.setNumberCurrentRadioStation(8);
        Assertions.assertEquals(8, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetNumberStationAboveBorder() {
        radio.setNumberCurrentRadioStation(10);
        Assertions.assertEquals(0, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldNoSetStationAboveMax() {
        radio.setNumberCurrentRadioStation(16);
        Assertions.assertEquals(0, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetNextStation() {
        radio.setNumberCurrentRadioStation(4);
        radio.next();
        Assertions.assertEquals(5, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetAfterMaxStation() {
        radio.setNumberCurrentRadioStation(9);
        radio.next();
        Assertions.assertEquals(0, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldQuantityStation() {
        Radio radio = new Radio(10);
    }

    @Test
    public void shouldSetPrevStation() {
        radio.setNumberCurrentRadioStation(5);
        radio.prev();
        Assertions.assertEquals(4, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetAfterPrevStation() {
        radio.setNumberCurrentRadioStation(0);
        radio.prev();
        Assertions.assertEquals(9, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetToMinVolumeSound() {
        radio.getVolumeSound();
        Assertions.assertEquals(0, radio.getVolumeSound());
    }

    @Test
    public void shouldSetVolumeSoundUp() {
        radio.setVolumeSound(8);
        radio.volumeUp();
        Assertions.assertEquals(9, radio.getVolumeSound());
    }

    @Test
    public void shouldSetAfterMaxVolume() {
        radio.setVolumeSound(100);
        radio.volumeUp();
        Assertions.assertEquals(100, radio.getVolumeSound());
    }

    @Test
    public void shouldSetVolumeSoundDown() {
        radio.setVolumeSound(3);
        radio.volumeDown();
        Assertions.assertEquals(2, radio.getVolumeSound());
    }

    @Test
    public void shouldSetAfterMinVolume() {
        radio.setVolumeSound(0);
        radio.volumeDown();
        Assertions.assertEquals(0, radio.getVolumeSound());
    }
}
