import java.util.*;

public class itinerary{

    public static void findItinerary(Map<String, String> tickets) {
        // Write code here
          if (tickets == null || tickets.isEmpty()) {
            System.out.println("Invalid Input");
            return;
        }

        String startCity = null;
        for (String source : tickets.keySet()) {
            if (!tickets.containsValue(source)) {
                startCity = source;
                break;
            }
        }

        if (startCity == null) {
            System.out.println("Invalid Input");
            return;
        }

        String currentCity = startCity;
        while (currentCity != null && tickets.containsKey(currentCity)) {
            String nextCity = tickets.get(currentCity);
            System.out.println(currentCity + "->" + nextCity);
            currentCity = nextCity;
        }
      
 
    }

    public static void main(String[] args) {
        Map<String, String> tickets = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            tickets.put(sc.next(),sc.next());
        }
        findItinerary(tickets);
    }
}