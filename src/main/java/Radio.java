public class Radio {
    private int currentRadio;

    private int currentVolume;

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio > 9) {
            return;
        }
        if (newCurrentRadio < 0) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int nextRadio() {
        if (currentRadio >= 9) {
            return currentRadio = 0;
        }
        if (currentRadio < 9) {
            currentRadio = currentRadio + 1;
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


    public int increaseVolume() {

        if (currentVolume >= 100) {
            return currentVolume = 100;
        }
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int reductionVolume() {

        if (currentVolume < 1) {
            return currentVolume = 0;
        }
        if (currentVolume <= 100) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;

    }
}

