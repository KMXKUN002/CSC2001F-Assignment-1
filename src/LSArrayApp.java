//	LSArrayApp
//	25	Feb 2020
//	Chris	Kim

import java.io.*;

public class LSArrayApp {
	public static void main	( String	[]	args ){
      try {
      
		   File file =	new File	("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
		   FileReader fr = new FileReader (file);
         BufferedReader br = new BufferedReader (fr);
         StringBuffer sb = new StringBuffer();
         String line;
            
         LoadSheddingUnit lsArray[] = new LoadSheddingUnit[3000];
         int length = 0;

         while ((line = br.readLine()) != null) {
            lsArray[length] = new LoadSheddingUnit (line);
            length ++;
         }
         
         if (args.length == 0) {
            printAllAreas (lsArray, length);
         }
         else {
            String parameters = args[0] + "_" + args[1] + "_" + args[2];
            printAreas (lsArray, length, parameters);
         }
      }
      catch (IOException e) {
         e.printStackTrace();
      }
	}
   
   public static void printAllAreas (LoadSheddingUnit[] array, int length) {
      for (int i = 0; i < length; i ++) {
         System.out.println (array[i]);
      }
   }
   
   public static void printAreas (LoadSheddingUnit[] array, int length, String parameters) {
      boolean foundFlag = false;
      for (int i = 0; i < length; i++) {
         if (array[i].matches (parameters)) {
            System.out.println ("Areas " + array[i].getAreas());
            foundFlag = true;
            break;
         }
      }
      
      if (!foundFlag) {
         System.out.println ("Areas not found");
      }
   }
}