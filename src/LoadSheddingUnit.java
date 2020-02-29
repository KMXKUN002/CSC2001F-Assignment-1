//	LSArrayApp
//	25	Feb 2020
//	Chris	Kim

public class LoadSheddingUnit {
   protected int day;
   protected String raw;
   
   public LoadSheddingUnit() {
   }
   
   public LoadSheddingUnit(String r) {
      raw = r;
      day = Integer.parseInt (r.substring (2, r.indexOf('_', 2)));
   }
   
   public int compareTo (LoadSheddingUnit unit) {
      if (raw == unit.getRaw()) {
         return 0;
      }
      
      if (day >= unit.getDay()) {
         return 1;
      }
      
      return -1;
   }
   
   public int getDay () {
      return day;
   }
      
   public String getRaw () {
      return raw;
   }
   
   public String toString () {
      String[] reader = raw.split ("_");
      return "Stage " + reader[0] + " - Day " + String.format ("%2d", day) + " - Start Hour " + reader[2].substring(0, 2) + " - Areas " + reader[2].substring(3);
   }
}