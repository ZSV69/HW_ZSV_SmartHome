import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void getCurrentRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(2);

        int expected = 2;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(4);

        int expected = 5;
        int actual = radio.nextRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioBelowMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(8);

        int expected = 9;
        int actual = radio.nextRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);

        int expected = 0;
        int actual = radio.nextRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(10);

        int expected = 0;
        int actual = radio.nextRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(5);

        int expected = 4;
        int actual = radio.prevRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);

        int expected = 9;
        int actual = radio.prevRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(1);

        int expected = 0;
        int actual = radio.prevRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(-1);

        int expected = 9;
        int actual = radio.prevRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(15);

        int expected = 15;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(20);

        int expected = 21;
        int actual = volume.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        int expected = 1;
        int actual = volume.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeBelowMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        int expected = 100;
        int actual = volume.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);

        int expected = 100;
        int actual = volume.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);

        int expected = 49;
        int actual = volume.reductionVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeBelowMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.reductionVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        int expected = 0;
        int actual = volume.reductionVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void reductionVolumeAboveMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        int expected = 0;
        int actual = volume.reductionVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void reductionVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        int expected = 99;
        int actual = volume.reductionVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void reductionVolumeAbuveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);

        int expected = 100;
        int actual = volume.reductionVolume();

        Assertions.assertEquals(expected, actual);
    }
}
