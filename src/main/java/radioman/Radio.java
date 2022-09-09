package radioman;

public class Radio {
    protected int currentVolume;
    protected int currentStation;
    protected int minStation = 0;
    protected int maxStation = 9;


    public int getCurrentVolume() {
        return currentVolume;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation < 9) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prev() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);

        } else {
            setCurrentStation(currentStation - 1);
        }


    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}


