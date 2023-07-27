public class Radio {
    public int currentRadio;

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        currentRadio = newCurrentRadio;
    }

    public int nextRadio() {
        if (currentRadio <= 9) {
            currentRadio = currentRadio + 1;
        }
        if (currentRadio > 9) {
            currentRadio = 0;
        }
        return currentRadio;
    }


    public int prevRadio() {
        if (currentRadio < 1) {
            currentRadio = 9;
        }
        if (currentRadio < 9) {
            currentRadio = currentRadio - 1;
        }
        return currentRadio;
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume +1;
        }
        if (currentVolume >= 100) {
            currentVolume = 100;
        }
        return currentVolume;
    }

    public int reductionVolume() {
        if (currentVolume <=100) {
            currentVolume = currentVolume -1;
        }
        if (currentVolume < 1) {
            currentVolume = 0;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        return currentVolume;
    }
}

