//Find Itinerary from Tickets

import java.util.HashMap;

public class FindItineraryTickets {
    public static String getStart(HashMap<String, String> tickets){    //from -> to
        HashMap<String, String> revMap = new HashMap<>();              //to -> from

        for(String key:tickets.keySet()){
            revMap.put(tickets.get(key), key);
        }

        for(String key:tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;                //starting point
            }
        }
        return null;                       //if starting point doesn't exists
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        //find starting point
        String start = getStart(tickets);

        System.out.print(start);
        for(String key: tickets.keySet()){
            System.out.print(" -> "+tickets.get(start));
            start=tickets.get(start);
        }
    }
}
// Ouput :
// Mumbai -> Delhi -> Goa -> Chennai -> Bengaluru