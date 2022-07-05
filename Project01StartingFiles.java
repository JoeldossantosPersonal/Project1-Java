/*
 * Class: 44-241 Computer Programming II
 * Authors: Joel Dos santos & Elijah Booher
 * Due: 03/03/2022
 */
package project01startingfiles;

import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class Project01StartingFiles {

    public static void main(String[] args) throws FileNotFoundException {
         //variables and arrays
        String[] minParts = new String[7];
        String[] maxParts = new String[7];
        String[] lineClose = new String[7];
        String[] lineParts = new String[7];
        double min = 100;
        double max = 0;
        long total = 0;
        long count = 0;
        long minCount = 0;
        long maxCount = 0;
        
        //file reader and scanner
        JFileChooser myChooser = new JFileChooser();
        myChooser.showOpenDialog(null);
        File file = myChooser.getSelectedFile();
        Scanner input = new Scanner(file);
        Scanner scan = new Scanner(file);
        PrintWriter output = new PrintWriter("SP500output.txt");

        //main program
        //min Calculations
        while(input.hasNext()){
            String line = input.nextLine();
            lineClose = line.split(",");
            double close = Double.parseDouble(lineClose[5]);
            if (close < min) {
                min = close;
                minParts = lineClose.clone();
                //saveCount = count;
            }
            //max Calculations
            if (close > max) {
                max = close;
                maxParts = lineClose.clone();
                //saveCount = count;
            }
            count++;
            total += Integer.parseInt(lineClose[6]);
        }
        while(scan.hasNext()){
            String line = scan.nextLine();
            lineParts = line.split(",");
            if(minParts[1].equals(lineParts[1])){
                minCount++;
            }
            if(maxParts[1].equals(lineParts[1])){
                maxCount++;
            }
        }
        
        //printing results
        System.out.println("Standard and Poor's Data");
        System.out.println(" ");
        printMinToScreen(minParts, minCount);
        System.out.println(" ");
        printMaxToScreen(maxParts, maxCount);
        System.out.println(" ");
        findAndPrintAverage(count, total);
        printMinToFile(minParts, output);
        printMaxToFile(maxParts, output);
        findAndPrintAverageToFile(count, total, output);
        
    output.close();
    }
    
    //Method to print min data
    public static void printMinToScreen(String[] minParts, long count) throws FileNotFoundException{
        System.out.println("Minimum Closing Stock Information");
        System.out.println("Date: " + minParts[0]);
        System.out.println("Ticker: " + minParts[1]);
        System.out.println("Open price: " + minParts[2]);
        System.out.println("High price: " + minParts[3]);
        System.out.println("Low price: " + minParts[4]);
        System.out.println("Closing price: " + minParts[5]);
        System.out.println("Volume: "+ minParts[6]);
        System.out.println("CHK stock transactions: "+ count); 
    }
    
    //Method to print max data to screen
    public static void printMaxToScreen(String[] maxParts, long count)throws FileNotFoundException{

        System.out.println("Maximum Closing Stock Information");
        System.out.println("Date: " + maxParts[0]);
        System.out.println("Ticker: " + maxParts[1]);
        System.out.println("Open price: " + maxParts[2]);
        System.out.println("High price: " + maxParts[3]);
        System.out.println("Low price: " + maxParts[4]);
        System.out.println("Closing price: " + maxParts[5]);
        System.out.println("Volume: "+ maxParts[6]);
        System.out.println("PCLN stock transactions: "+ count); 

    }
    
    //Method to find and print average volumes
    public static void findAndPrintAverage(long count, long total){
        long average = total / count;
        System.out.println("Number of Stocks: " + count);
        System.out.println("Stock volume totals: " + total);
        System.out.println("Average volumes: " + average);
        
    }
    
    //Method to print min data to file, excluding the total transactions (Ticker count)
    public static void printMinToFile(String[] minParts, PrintWriter file){
        file.println("Minimum Closing Stock Information");
        file.println("Date: " + minParts[0]);
        file.println("Ticker: " + minParts[1]);
        file.println("Open price: " + minParts[2]);
        file.println("High price: " + minParts[3]);
        file.println("Low price: " + minParts[4]);
        file.println("Closing price: " + minParts[5]);
        file.println("Volume: "+ minParts[6]);
        file.println(" ");
    }
    
    //Method to print max data to file, excluding the total transactions (Ticker count)
    public static void printMaxToFile(String[] maxParts, PrintWriter file){
        file.println("Maximum Closing Stock Information");
        file.println("Date: " + maxParts[0]);
        file.println("Ticker: " + maxParts[1]);
        file.println("Open price: " + maxParts[2]);
        file.println("High price: " + maxParts[3]);
        file.println("Low price: " + maxParts[4]);
        file.println("Closing price: " + maxParts[5]);
        file.println("Volume: "+ maxParts[6]);
        file.println(" ");
    }
    
    //method to print average data to file
    public static void findAndPrintAverageToFile(long count, long total, PrintWriter file){
        long average = total / count;
        file.println("Number of Stocks: " + count);
        file.println("Stock volume totals: " + total);
        file.println("Average volumes: " + average);
    }
}
