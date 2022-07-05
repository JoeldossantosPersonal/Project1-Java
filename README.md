# Project1-Java
Project #1 - Computer Programming II


Standard and Poor (S & P) 500 maintains an index of 500 company stocks that represent industries in the United States.  Each stock has a ticker symbol, such as AAL is the ticker symbol for AMERICAN AIRLINES GROUP and ZTS for ZOETIS.  Stocks are tracked each day for the following information:

-open price at the beginning of a particular stock market opening
-high price of a particular day
-low price of a particular day
-close price of particular day
-the trading volume for a particular day
-S & P 500 stock prices for the years 2013 and 2018 have been collected in a file entitled sp500hstFa20.txt.  We need to analyze each stock’s data and then display selected date from the file.  (Note:  This data was downloaded from the website: https://www.kaggle.com/camnugent/sandp500 (Links to an external site.) )

The data in this file is in the following format.  (Note: Data is separated by a comma.)
Date, Ticker, Open, High, Low, Close, Volume for the day

For example, one line of data may look like the data below.
20090821,A,25.6,25.61,25.22,25.55,34758

Your Task:
You need to write a program that finds and displays the following information.  Your program should analyze all data in the file and then:

-Find the stock with the smallest closing price and then display all the information about the particular stock for this day.
-Find the stock with the largest closing price and then display all the information about the particular stock for this day.
-Find and display the total number of transactions in the file
-Find and display the total of the volume transactions in the file
-Calculate and display the average volume of all transactions in the file

Your program must incorporate the following components:

Read the data from a file, but incorporate the JFileChooser class and allow the user to select a file to be used for this program.
Incorporate the six static methods listed below and call these methods to analyze the data file. The method headers have been included below.

//Method to print min data to screen
public static void printMintoScreen(String[] minParts, long count)

//Method to print max data to screen
public static void printMaxToScreen(String[] maxParts, long count)

//Method to find and print average volumes
public static void findandPrintAverage(long count, long total)

//Method to print min data to file, excluding the total transactions (Ticker count)
public static void printMinToFile(String[] minParts, PrintWriter file)

//Method to print max data to file, , excluding the total transactions (Ticker count)
public static void printMaxToFile(String[] maxParts, PrintWriter file)

//method to print average data to file
public static void findandPrintAverageToFile(long count, long total, PrintWriter file)

Use appropriate variable data types. In particular, use long data type to accommodate the size of the numbers that you will be processing.
Use the String split method in your program to extract the data one line of input and store this data in a String array.
Display the output to the console window (monitor) and appropriately format the data. 
Write the same data to a data file, excluding the count, that will be stored in a file named SP500output.txt.
Include appropriate comments to document your program.
