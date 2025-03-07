class Ex12 {
	public static void main(String args[]) {
		// while문
		// while(조건){실행문;}
		System.out.println("before..");
		int n = 5;
		while(n>0){
			System.out.println("n = " + n--);
		}
		System.out.println("after..");
		// do~while 반복문
		// do {실행문;} while(조건); 
		// 최초 한 번의 실행은 보장
		do{
			System.out.println("n = " + n);
		}while(n>0);
	}
}