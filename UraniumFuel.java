
//Name - your name here
//Date - Sept 2017
//Class -
//Lab  - Data Analysis - Uranium Fuel

import static java.lang.System.*;
import java.util.Scanner;
import java.io.File;
import java.lang.Exception;
import java.io.PrintWriter;

public class UraniumFuel
{
    // create fields for your data structures
    
    // use the following fields to record your answers
    double globalAVG;  // for answer a
    double globalMIN;  // for answer b
    int minMonth;
    int minYear;
    double globalMAX;  // for answer c
    int maxMonth;
    int maxYear;
    double[] decadeAVG = new double[6];  // for answer d
                          // 50s 60s 70s 80s 90s 00s
                          
    double[] monthAVG = new double[4];  // for answer e
                          // jan apr jul oct
    
    
    public void main() throws Exception
    {
        String fileName = "";
        String extension = "";
        File inputFile = new File(fileName+extension);
        Scanner inputObject = new Scanner(inputFile);
        inputObject.useDelimiter(",");
        out.println("delim is:"+inputObject.delimiter());
        
        // process the entire file, with a loop
        // populate your data structures

        inputObject.close();
        
        // perform your analytics in helper methods
        // located below main()
        
        // each helper method should return the correct
        // answer and place it in an answer field above
        
        // helper method example
        // double globalAVG = calcGA();
        
        // make calls to each helper method here
        calcGA();
        calcMIN();
        calcMAX();
        calcTREND();
        calcMONTHS();
        

        // now lets write to a file using PrintWriter
        //
        // step 1 make a output file name by inserting
        // the phrase ".output" in between the 
        // filename and extension
        
        
        // step 2 make a Printerwriter object using that String
        
        
        // step 3 now you can use the print method to generate and
        // write individual lines to your new file
        

        // step 4 close the output file object
        
        
        // step 5 use Finder and examine your handiwork
    }
    
    // helper methods
    public void calcGA()
    {
    }
    
    public void calcMIN()
    {
        // update 3 answer fields here
    }
    
    public void calcMAX()
    {
        // update 3 answer fields here
    }
    
    public void calcTREND()
    {
        // update your decageAVG array
    }
    
    public void calcMONTHS()
    {
        // update your monthAVG array
    }
}