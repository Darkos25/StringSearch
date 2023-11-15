package com.StringExample;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    File SearchFile = new File("SearchFile.txt");
        Scanner sc = new Scanner(SearchFile);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

    }
}
