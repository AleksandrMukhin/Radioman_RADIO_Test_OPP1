import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.test.Radio;

public class RadioTest {
    @Test
    public void shouldSetNumberStationBelowMin() {
        Radio stationVolume = new Radio();

        stationVolume.setNumberCurrentRadioStation(-5);

        int expected = 0;
        int actual = stationVolume.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationNegative() {
        Radio stationVolume = new Radio();

        stationVolume.setNumberCurrentRadioStation(-1);

        int expected = 0;
        int actual = stationVolume.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationMin() {
        Radio stationVolume = new Radio();

        stationVolume.setNumberCurrentRadioStation(0);

        int expected = 0;
        int actual = stationVolume.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationLowerBound() {
        Radio stationVolume = new Radio();

        stationVolume.setNumberCurrentRadioStation(1);

        int expected = 1;
        int actual = stationVolume.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStation() {
        Radio stationVolume = new Radio();

        stationVolume.setNumberCurrentRadioStation(5);

        int expected = 5;
        int actual = stationVolume.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationUpperBound() {
        Radio stationVolume = new Radio();

        stationVolume.setNumberCurrentRadioStation(8);

        int expected = 8;
        int actual = stationVolume.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxNumberStation() {
        Radio stationVolume = new Radio();

        stationVolume.setToMaxNumber();

        int expected = 9;
        int actual = stationVolume.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationAboveBorder() {
        Radio stationVolume = new Radio();

        stationVolume.setNumberCurrentRadioStation(10);

        int expected = 0;
        int actual = stationVolume.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetStationAboveMax() {
        Radio stationVolume = new Radio();

        stationVolume.setNumberCurrentRadioStation(16);

        int expected = 0;
        int actual = stationVolume.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio stationVolume = new Radio();

        stationVolume.setNumberCurrentRadioStation(4);
        stationVolume.next();

        int expected = 5;
        int actual = stationVolume.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAfterMaxStation() {
        Radio stationVolume = new Radio();

        stationVolume.setNumberCurrentRadioStation(9);
        stationVolume.next();

        int expected = 0;
        int actual = stationVolume.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevStation() {
        Radio stationVolume = new Radio();

        stationVolume.setNumberCurrentRadioStation(5);
        stationVolume.prev();

        int expected = 4;
        int actual = stationVolume.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAfterPrevStation() {
        Radio stationVolume = new Radio();

        stationVolume.setNumberCurrentRadioStation(0);
        stationVolume.prev();

        int expected = 9;
        int actual = stationVolume.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolumeSound() {
        Radio stationVolume = new Radio();

        stationVolume.setToMaxVolume();

        int expected = 10;
        int actual = stationVolume.getVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolumeSound() {
        Radio stationVolume = new Radio();

        stationVolume.getVolumeSound();

        int expected = 0;
        int actual = stationVolume.getVolumeSound();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeSoundUp() {
        Radio stationVolume = new Radio();

        stationVolume.setVolumeSound(8);
        stationVolume.volumeUp();

        int expected = 9;
        int actual = stationVolume.getVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAfterMaxVolume() {
        Radio stationVolume = new Radio();

        stationVolume.setVolumeSound(10);
        stationVolume.volumeUp();

        int expected = 10;
        int actual = stationVolume.getVolumeSound();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeSoundDown() {
        Radio stationVolume = new Radio();

        stationVolume.setVolumeSound(3);
        stationVolume.volumeDown();

        int expected = 2;
        int actual = stationVolume.getVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAfterMinVolume() {
        Radio stationVolume = new Radio();

        stationVolume.setVolumeSound(0);
        stationVolume.volumeDown();

        int expected = 0;
        int actual = stationVolume.getVolumeSound();

        Assertions.assertEquals(expected, actual);
    }
}
