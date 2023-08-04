public class Radio {
    private int currentRadio;
    private int currentVolume;
    private int maxRadio;

    public Radio() {
        this.maxRadio = 9;
    }

    public Radio(int radioCount) {
        this.maxRadio = radioCount - 1;
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio < 0) {
            return;
        }
        if (currentRadio > maxRadio) {
            return;
        }

        this.currentRadio = currentRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextRadio() {

        if (currentRadio != maxRadio) {
            currentRadio = currentRadio + 1;
        } else {
            currentRadio = 0;
        }
    }

    public void prevRadio() {
        if (currentRadio != 0) {
            currentRadio = currentRadio - 1;
        } else {
            currentRadio = maxRadio;
        }
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void reductionVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}
