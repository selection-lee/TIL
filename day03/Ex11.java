class Ex11 {
	public static void main(String args[]) {
		// 반복문
		// 1. for문
		// 구구단 2단
		System.out.println("구구단 3단 출력");
		for (int i = 3; i < 4; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + " = " + i*j);
			}
			System.out.println("-----");
		}
	}
}