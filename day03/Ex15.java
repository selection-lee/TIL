/*
1. A~Z 출력
2. A(a), ...Z(z)\
3. 1 2 3 \n 4 5 6 \n 7 8 9
4. 1 2 3 \n 2 3 4 \n 3 4 5
5. A B C \N D E F \N G H I
*/

class Ex15 {
	public static void main(String args[]) {
		System.out.print("1번: ");
		q1();
		System.out.println();
		System.out.print("\n2번: ");
		q2();
		System.out.println();
		System.out.println("\n3번: ");
		q3();
		System.out.println("\n4번: ");
		q4();
		System.out.println("\n5번: ");
		q5();
	}
	public static String q1() {
		for (int i = 65; i < 91; i++){
			System.out.print((char)i + " ");
		}
		return "";
	}
	
	public static String q2() {
		//System.out.print((char)65 + "(" + (char)97 + ")");
		for (int i = 65; i < 91; i++) {
			System.out.print((char)i + "(" + (char)(i + 32) + ") " );
		}
		return "";
	}
	
	public static int q3() {
		for(int i = 1; i < 8; i += 3) {
			System.out.println(i + " " + (i+1) + " " + (i+2) + " " );
		}
		System.out.println("while문으로는?");
		int num = 1;
		while (num + 2 < 10) {
			System.out.println(num + " " + (num+1) + " " + (num+2) + " " );
			num += 3;
		}
		return 0;
	}
	
	public static void q4(){
		for(int i = 1; i < 4; i ++) {
			System.out.println(i + " " + (i+1) + " " + (i+2) + " " );
		}
		System.out.println("while문으로는?");
		int num = 1;
		while (num < 4){
			System.out.println(num + " " + (num+1) + " " + (num+2) + " " );
			num++;
		}
	}
	
	public static void q5() {
		for (int i = 65; i < 74; i+=3) {
			System.out.println((char)i + " " + (char)(i+1) + " " + (char)(i+2) + " " );
		}
		System.out.println("while문으로는?");
		int num = 65;
		while (num + 2 < 76) {
			System.out.println((char)num + " " + (char)(num+1) + " " + (char)(num+2) + " " );
			num += 3;
		}		
	}
}