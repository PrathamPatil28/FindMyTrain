package Find_My_Train;
import java.util.ArrayList;
import java.util.List;

public class Station {
    private String stationId;
    private  String stationName;

    List<Platforms> platformsList;

    public Station(String stationId, String stationName) {
        this.stationId = stationId;
        this.stationName = stationName;
        this.platformsList = new ArrayList<>();
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public List<Platforms> getPlatformsList() {
        return platformsList;
    }

    public void setPlatformsList(List<Platforms> platformsList) {
        this.platformsList = platformsList;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationId='" + stationId + '\'' +
                ", stationName='" + stationName + '\'' +
                ", platformsList=" + platformsList +
                '}';
    }


}
