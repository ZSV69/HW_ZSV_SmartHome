import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setCurrentRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(2);

        int expected = 2;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioBelowMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(8);

        int expected = 8;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(10);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(-1);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(5);
        radio.setCurrentRadio(0);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(1);

        int expected = 1;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(15);

        int expected = 15;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeBelowMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeAboveMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeBelowMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(3);
        radio.nextRadio();

        int expected = 4;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioBelowMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(8);
        radio.nextRadio();

        int expected = 9;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);
        radio.nextRadio();

        int expected = 0;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);
        radio.nextRadio();

        int expected = 1;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(1);
        radio.nextRadio();

        int expected = 2;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(5);
        radio.prevRadio();

        int expected = 4;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);
        radio.prevRadio();

        int expected = 9;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(1);
        radio.prevRadio();

        int expected = 0;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioBelowMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(8);
        radio.prevRadio();

        int expected = 7;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);
        radio.prevRadio();

        int expected = 8;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(20);
        volume.increaseVolume();

        int expected = 21;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.increaseVolume();

        int expected = 2;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeBelowMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void reductionVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        volume.reductionVolume();

        int expected = 49;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.reductionVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeAboveMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.reductionVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeBelowMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        volume.reductionVolume();

        int expected = 98;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.reductionVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

