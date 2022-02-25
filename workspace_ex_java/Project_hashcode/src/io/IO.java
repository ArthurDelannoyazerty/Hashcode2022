package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class IO {
	
	int nbLines;
	String path;
	String[][] array;
	
	
	public IO(String path) throws IOException{
		this.path = path;
		this.nbLines = countLinesNew(path)+1;
		this.array = new String[countLinesNew(this.path)+1][6];
	}
	
	public String[][] getArray(){
		return this.array;
	}
	
	public void init() throws IOException{
		// load data from file
        BufferedReader bf = new BufferedReader(new FileReader(this.path));
       
        // read entire line as string
        String line = bf.readLine();
       
        // checking for end of file
    	int i = 0;
        while (line != null) {
        	String[] words = line.split(" ");
            for(int j=0; j<words.length; j++) {
            	this.array[i][j] = words[j];
            }
            line = bf.readLine();
            i++;
        }
       
        bf.close();
       
	}
	
	public static int countLinesNew(String filename) throws IOException {
	    InputStream is = new BufferedInputStream(new FileInputStream(filename));
	    try {
	        byte[] c = new byte[1024];

	        int readChars = is.read(c);
	        if (readChars == -1) {
	            // bail out if nothing to read
	            return 0;
	        }

	        // make it easy for the optimizer to tune this loop
	        int count = 0;
	        while (readChars == 1024) {
	            for (int i=0; i<1024;) {
	                if (c[i++] == '\n') {
	                    ++count;
	                }
	            }
	            readChars = is.read(c);
	        }

	        // count remaining characters
	        while (readChars != -1) {
	            //System.out.println(readChars);
	            for (int i=0; i<readChars; ++i) {
	                if (c[i] == '\n') {
	                    ++count;
	                }
	            }
	            readChars = is.read(c);
	        }

	        return count == 0 ? 1 : count;
	    } finally {
	        is.close();
	    }
	}
	
	public void printArrayInput(){
		for (int i=0; i<this.array.length; i++) {
			System.out.println(Arrays.toString(this.array[i]));
		}
	}
	
	
}
