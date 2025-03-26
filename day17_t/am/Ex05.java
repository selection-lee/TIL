package com.am;

import java.io.File;

public class Ex05 {

	public static void main(String[] args) {
		File file=new File(".\\dir03.abc");
		boolean result=file.mkdir();
		file=new File(".\\dir03\\dir04");
		result=file.mkdir();
		System.out.println(result);

	}

}
