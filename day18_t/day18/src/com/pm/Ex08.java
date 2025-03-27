package com.pm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Ex08 {

	public static void main(String[] args) {
		File file=new File("data08.txt");
		
		Writer fw=null;
		PrintWriter pw=null;
		try {
			file.createNewFile();
			
			fw=new FileWriter(file);
			pw=new PrintWriter(fw);
			
			pw.print(1234);
			pw.print("������");
			pw.print("������");
			pw.println();
			pw.println("������1");
			pw.println("������2");
			pw.println("������3");
			
			pw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}











