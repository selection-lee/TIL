package com.pm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex09 {

	public static void main(String[] args) {
		File file=new File("data09.txt");

		OutputStream os=null;
		java.io.OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		try {
			file.createNewFile();
			os=new FileOutputStream(file);
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);
			
//			osw.write('��');
//			osw.write('��');
			bw.write("���ڿ��� �ۼ�");
			bw.newLine();
			bw.write("������");
			
			bw.close();
			osw.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}






