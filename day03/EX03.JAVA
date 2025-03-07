class EX03 {
	public static void main(String args[]){
		System.out.println('가');
		System.out.println('\\');
		System.out.println('\uac00');
		char ch1, ch2;
		ch1 = '\uac01';
		System.out.println(ch1);
		ch2 = 65;
		System.out.println(ch2);
		System.out.println(ch1+ch2);
		System.out.println("문자열"); // 자바는 문자열과 문자 구분. char는 '' 불가, str은 "" 가능 (공집합 개념)
		System.out.println("문자"+"열");
		System.out.println("문자"+3.14); // 문자열 + 숫자 = 문자열 : 문자열과 연산 하면 문자열 됨
		System.out.println(2024+1+"년도"); // 숫자 먼저 더하고, 그다음 문자열이니까 문자열 연산해서 2025년
		System.out.println("year" + 2024+1); // 문자열year + 문자열2024 + 문자열1
	}
}