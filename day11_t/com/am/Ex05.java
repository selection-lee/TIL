package com.am;

interface Parent{
	void func02();
}
class Lec05{
	static Parent par1=new Parent(){
		public void func02() {
			System.out.println("����Ŭ������ ��ɼ���");
		}
	};
	Parent par2=new Parent(){
		public void func02() {
			System.out.println("����Ŭ������ ��ɼ���");
		}
	};
	
	
// Ŭ����
	static Parent func01() {
//		local.func02();
		// �͸�Ŭ����
		Parent local=new Parent(){
			public void func02() {
				System.out.println("����Ŭ������ ��ɼ���");
			}
		};
		
		Parent local2=()->System.out.println("���ٽ�");
		
		return local2;
	}
}

public class Ex05 {

	public static void main(String[] args) {
		// �͸�Ŭ����
		Parent local=Lec05.func01();
		local.func02();
		
//		Lec05.par1.func02();
	}

}
