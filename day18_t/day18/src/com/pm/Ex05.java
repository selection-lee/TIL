package com.pm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Ex05 {

	public static void main(String[] args) {
		File file=new File("data05.txt");
		OutputStream os=null;
		OutputStream os2=null;
		// outputStream
		PrintStream ps=null;
		PrintStream ps2=null;
		try {
			file.createNewFile();
			os=new FileOutputStream(file);
			os2=new FileOutputStream(file);
			ps=new PrintStream(os);
			ps2=new PrintStream(os2);
			
			ps.write(97);
			ps2.print(1234);
			ps.print(3.14);
			ps2.println("hello world");
			ps.println("hello world");
			ps2.println("�ѱ�");
			ps.println("hello world");
			ps.println(97);
			
			ps.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}









