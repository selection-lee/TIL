class Ex12 {
	public static void main(String args[]) {
		// while��
		// while(����){���๮;}
		System.out.println("before..");
		int n = 5;
		while(n>0){
			System.out.println("n = " + n--);
		}
		System.out.println("after..");
		// do~while �ݺ���
		// do {���๮;} while(����); 
		// ���� �� ���� ������ ����
		do{
			System.out.println("n = " + n);
		}while(n>0);
	}
}