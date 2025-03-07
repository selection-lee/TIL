class Ex09{
	public static void main(String args[]) {
		// 제어문
		// 1. 조건문
		//1-1. if문
		//	if (조건) {실행문들};
		// 만약 조건이 참이라면 실행문 실행
		//아니면 무시
		System.out.println("before");
		int n = 5;
		if (n>3) {
			System.out.println("실행1");
			System.out.println("실행2");
		}
		System.out.println("after");
		// else
		// 단독 사용 불가
		// 중복 사용 불가
		// 실행을 보장
		// if (조건) {실행문;} else {실행문;}
		System.out.println("------");
		if (n<0) System.out.println("음수");
		else System.out.println("양수");
		// else if
	}
}