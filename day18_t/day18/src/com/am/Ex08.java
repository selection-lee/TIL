package com.am;

public class Ex08 extends Thread{
	
	public Ex08() {
//		super("������1");
//		setName("�̸�1");
	}

	public static void main(String[] args) {
		Ex08 me=new Ex08();
		Ex08 me2=new Ex08();
		Ex08 me3=new Ex08();

		//������ ������ �ǹ̰�����
		// ��������� ũ�� �۳�
		me.setPriority(Thread.NORM_PRIORITY);
		me2.setPriority(Thread.MIN_PRIORITY);
		me3.setPriority(Thread.MAX_PRIORITY);
		
		me.start();
		me2.start();
		me3.start();
	}

	@Override
	public void run() {
		System.out.println(this.getName());
		Thread thr=Thread.currentThread();
		System.out.println(thr.getId());
		System.out.println(thr.getState());
		System.out.println(thr.getName()+":"+thr.getPriority());//�켱����
	}
}



















