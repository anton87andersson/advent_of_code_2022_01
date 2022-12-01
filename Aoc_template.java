package aoc_template;
import java.io.*;
import java.util.*;

public class Aoc_template {
    public static void main(String[] args) {
        
        List<Integer> cals = new ArrayList<>();
        List<Integer> cals_sorted = new ArrayList<>();

        try  
        {  
            File file=new File("input.txt");
            FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            StringBuffer sb=new StringBuffer();
            String line;  
            
            // Initiate total_cals
            int total_cals = 0;
            
            while((line=br.readLine())!=null)  
            {  
                // As long as there is no blank lines, fill up total_cals
                if (!"".equals(line)){
                total_cals = (Integer.parseInt(line)) + total_cals;
                }
                
                // If there is a blank line, sum it up and att to cals list!
                // Then reset the counter
                else if ("".equals(line)) {
                    cals.add(total_cals);
                    total_cals = 0;
                }
            }
            fr.close();
        }  
        catch(IOException e)  
        {  
            e.printStackTrace();
        }
        
        // Why not do it the hard way ? #lovelife
        int high_num = 0;
        
        // Lol idk why i did this.
        for (int i = 0; i<cals.size();i++) {
            if (high_num < cals.get(i)) {
                high_num = cals.get(i);
            }
        }
        
        
        // I just got an idea, when i got to second part ............
        Collections.sort(cals);
        
        // Well , it's working on my computer
        
        int top1 = high_num;
        int top2 = cals.get(cals.size() - 2);
        int top3 = cals.get(cals.size() - 3);
        int total_top3 = top1 + top2 + top3;
        
        // And the winner is
        System.out.println("Highest cal is : " + high_num);
        System.out.println("Top 3 carrying: " + total_top3);
    }  
}
