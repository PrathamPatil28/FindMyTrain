package Find_My_Train;
public class Platforms {
    private int platformId;
    private Train train;

    public Platforms(int platformId) {
        this.platformId = platformId;
    }

    public int getPlatformId() {
        return platformId;
    }

    public void setPlatformId(int platformId) {
        this.platformId = platformId;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Platforms{" +
                "platformId=" + platformId +
                ", train=" + train +
                '}';
    }
}


