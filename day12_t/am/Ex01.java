package com.am;
/**
 * 6. 동적할당
 * 7. collection framework
 * 8. generic
 * 9. java.util
 * 10. ui
 * 11. event
 * 12. io
 * 13. thread
 * 14. java.net
 * 
 */
class Ball{
	static int cnt=0;
	final int num;
	boolean boo=false;
	
	public Ball() {
		cnt++;
		num=cnt;
		boo=false;
	}
	public void check() {
		boo=true;
	}
}


public class Ex01 {

	public static void main(String[] args) {
		Ball[] box=new Ball[45];
		int[] note=new int[6];
		for(int i=0; i<box.length; i++) {
			box[i]=new Ball();
		}
		for(int i=0; i<note.length; i++) {
			int ran=(int)(Math.random()*box.length);
			Ball ball=box[ran];
			int num=ball.num;
			if(ball.boo) {
				i--;
			}else {
				note[i]=num;
				ball.check();
			}
		}
		for(int i=0; i<note.length; i++) {
			System.out.println(note[i]);
		}
	}

}



























