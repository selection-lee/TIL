/*
1. 1~20 Ȧ��
2. 1~50 5�� ���
3. 1~50 ��
4. 2 + 4 + 6 + 8+ 10
5. ������ ���, ������ �׸����
*/

class Ex14{
	public static void main(String args[]){
		System.out.println("1��: ");
		oddNum();
		System.out.println("");
		System.out.println("2��: ");
		five(50);
		System.out.println("");
		System.out.println("3��: " + sumNum(50));
		System.out.println("4��: " + q4());
		System.out.println("5��: ");
		gugudan();
	}
	
	public static int oddNum() {
		for (int i = 1; i < 21; i = i + 2) {
			System.out.print(i + " ");
		}
		return 0;
	}
	
	public static int five(int num) {
		for (int i = 5; i < num + 1; i = i + 5){
			System.out.print(i + " ");
		}
		return 0;
	}
	
	public static int sumNum(int num) {
		int ans = 0;
		for (int i = 1; i < num + 1; i++) {
			ans += i;
		}
		return ans;
	}
	
	public static int q4() {
		int ans = 0;
		for (int i = 1; i < 5; i++) {
			ans += 2*i;
		}
		return ans;
	}
	
	public static int gugudan() {
		for (int i = 2; i < 10; i++) {
			System.out.print(i + "��" + "\t");
		}
			System.out.println("");
		
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + 1 + "=" + j * i + "\t");
			} 
			System.out.println("");
		}
		return 0;
	}
}