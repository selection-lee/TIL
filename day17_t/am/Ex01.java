package com.am;

import java.io.File;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// Input & Output
		java.io.File file;
		// �����
//		file=new File("dir01");
//		file=new File("target.txt");
		file=new File("..\\day17");
		// ������
//		file=new File("D:\\javaWorkspace\\day17\\target.txt");
		// ���� - ���丮&����
		System.out.println("�����ϴ°�?"+file.exists());
		System.out.println("���丮�ΰ�?"+file.isDirectory());
		System.out.println("�����ΰ�?"+file.isFile());
		System.out.println("���?"+file.getParent());
		System.out.println("���ϸ�?"+file.getName());
		System.out.println("path?"+file.getPath());
		System.out.println("������1?"+file.getAbsolutePath());
		System.out.println("������2?"+file.getCanonicalPath());
		System.out.println("r?"+file.canRead());
		System.out.println("w?"+file.canWrite());
		System.out.println("x?"+file.canExecute());
		long time1=file.lastModified();
		System.out.println(new java.util.Date(time1));
		String[] list=file.list();
		System.out.println(java.util.Arrays.toString(list));
		
	}

}












