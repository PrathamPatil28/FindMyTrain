package Find_My_Train;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {

    private Map<String, Station> stations = new HashMap<>();
    private Map<String, Train> trains = new HashMap<>();
    private List<Schedule> sheduels = new ArrayList<>();


    public void addStation(Station station){
        stations.put(station.getStationId(), station);
    }

    public void addTrains (Train train){
        trains.put(train.getTrainId(), train);
    }

   public void addShedule(Schedule shedule){
        sheduels.add(shedule);
   }

   public List<Schedule> findMyTrains (String startStationId, String endStationId)
   {
        List<Schedule> res= new ArrayList<>();

        for (Schedule shedule :sheduels){
            if (shedule.getStation().getStationName().equals(startStationId) ||
                    shedule.getStation().getStationName().equals(endStationId))
            {
                res.add(shedule);
            }
        }
        return res;
   }

    
}