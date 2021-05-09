package com.mycompany.files;

/**
 *
 * @author Mohamed Elsaman
 */

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewClass {
    public static void main(String[] args) throws IOException {
        String[] names = new String[3];
        int namesLength=names.length;
        // read data from a file
        /////////////////////////
        // low level reader
        InputStreamReader r = new InputStreamReader(System.in);
        // high level reader
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter Your Name:"); 
        String name = "";
            
        // check if user enters "stop"
        // [ This neads linkedList but I didn't revise it yet ]
            for(int i=0; i<namesLength ; i++)
            {
                if(name.equals("stop"))
                break;
                name = br.readLine();
                System.out.println("Welcome " + name);
                // append names to array names
                names[i] = name;
                // wirte data to a file
                /////////////////////////
                // low level writer
                FileWriter writer = new FileWriter("D:\\test.txt",true);
                try ( // high level wirter
                        BufferedWriter buffer = new BufferedWriter(writer)) {
                    buffer.write(names[i]);
                    buffer.write("\n");
                }
            }
             
    }
}


