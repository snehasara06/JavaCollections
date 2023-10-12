package CollectionPractice;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> cricket = new HashMap<Integer, String>();
        cricket.put(7, "M.S Dhoni");
        cricket.put(18, "Virat Kohli");
        cricket.put(45, "Rohit Sharma");
        cricket.put(8, "Ravindra Jadeja");
        cricket.put(41, "Shreyas Iyer");

        // System.out.println(cricket);
       
        cricket.putIfAbsent(99, "Ravichandran Ashwin");
        cricket.putIfAbsent(41, "Shreyas Iyer");


        System.out.println("JERSEY_NO" + "\t NAME");
            // for (Map.Entry<Integer, String> players : cricket.entrySet()) {
            //     System.out.println(players.getKey() + "\t\t" + players.getValue());
            // }
        HashMap<Integer,String> ipl=new HashMap<Integer,String>();
        ipl.put(48,	"Suresh Raina");
        ipl.putAll(cricket);

        System.out.println("\nJERSEY_NO" + "\t NAME");
        // for (Map.Entry<Integer, String> iplPlayers : ipl.entrySet()) {
        //     System.out.println(iplPlayers.getKey() + "\t\t" + iplPlayers.getValue());
        // }
        ipl.put(32,"Ishan Kishan");
        System.out.println("Adding element");
        for (Map.Entry<Integer, String> iplPlayers : ipl.entrySet()) {
            System.out.println(iplPlayers.getKey() + "\t\t" + iplPlayers.getValue());
        }
        // ipl.remove(32, "Ishan Kishan");
               

        ipl.remove(32);
        System.out.println("Removing element");
         for (Map.Entry<Integer, String> iplPlayers : ipl.entrySet()) {
            System.out.println(iplPlayers.getKey() + "\t\t" + iplPlayers.getValue());
        }
        System.out.println("\nPUT HARDIK");
        ipl.put(54,"Hardik");
          for (Map.Entry<Integer, String> iplPlayers : ipl.entrySet()) {
            System.out.println(iplPlayers.getKey() + "\t\t" + iplPlayers.getValue());
        }
        ipl.replace(54,"Shardul Thakur");
            // ipl.replace(54, "Hardik", "Shardul Thakur");

       
        System.out.println("\n REPLACE HARDIK");
          for (Map.Entry<Integer, String> iplPlayers : ipl.entrySet()) {
            System.out.println(iplPlayers.getKey() + "\t\t" + iplPlayers.getValue());
        }
    // replaceAll()
        // ipl.replaceAll((K,V)->"Thala Dhoni");
        //  System.out.println("\n REPLACE ALL");
        //   for (Map.Entry<Integer, String> iplPlayers : ipl.entrySet()) {
        //     System.out.println(iplPlayers.getKey() + "\t\t" + iplPlayers.getValue());
        // }
      System.out.println("ENTRY SET: "+ipl.entrySet());
      System.out.println("KEY SET : "+ipl.keySet());
      System.out.println("VALUES : "+ipl.values());
    }
}
// clone()
// isEmpty()
// clear()-remove all mappings