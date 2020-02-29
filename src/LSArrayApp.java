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
            for (int i = 0; i < length; i ++) {
               System.out.println (lsArray[i]);
            }
         }
         else {
            
         }
      }
      catch (IOException e) {
         e.printStackTrace();
      }
	}
}