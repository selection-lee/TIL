package com.pm;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		InputStream is=System.in;
//		new Scanner(is);
		try {
			System.out.println(is.read());
			System.out.println(is.read());// \r
			System.out.println(is.read());// \n
			System.out.println(is.read());
			
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
