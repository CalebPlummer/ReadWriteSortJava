/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritesort;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 *
 * @author cplummer
 */
public class Methods {
    
    ArrayList<String> names = new ArrayList<>();
    
    /**
     * Opens, reads, stores, and sorts the file.
     */
    public void readFile()
    {
        
        try(BufferedReader br = new BufferedReader(new FileReader("BoyNames.txt")))
        {
            for(int i = 0; i < 200; i++)
            {
                names.add(br.readLine());
            }
            Collections.sort(names);
            System.out.println(names);
        }
        catch(IOException ex)
        {
            System.out.println("Error reading from the file.");
            System.exit(0);
        }
    }
    
    /**
     * Writes the ArrayList of names to a new file.
     */
    public void writeToFile()
    {
        try(FileWriter writer = new FileWriter("SortedBoyNames.txt"))
        {
            for(String str: names) 
            {
                writer.write(str + ", ");
            }
            
        }
        catch(IOException ex)
        {
            System.out.println("Error writing the file.");
            System.exit(0);
        }
    }
}
