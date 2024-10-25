package Find_My_Train;



public class Schedule {

    private Train train;
    private Station station;
    private String ArrivalTime;
    private String DepartureTime;
    private Platforms platforms;

    public Schedule(Train train, Station station, String arrivalTime, String departureTime, Platforms platforms) {
        this.train = train;
        this.station = station;
        ArrivalTime = arrivalTime;
        DepartureTime = departureTime;
        this.platforms = platforms;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String departureTime) {
        DepartureTime = departureTime;
    }

    public Platforms getPlatforms() {
        return platforms;
    }

    public void setPlatforms(Platforms platforms) {
        this.platforms = platforms;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "train=" + train +
                ", station=" + station +
                ", ArrivalTime='" + ArrivalTime + '\'' +
                ", DepartureTime='" + DepartureTime + '\'' +
                ", platforms=" + platforms +
                '}';
    }
}
