/*
	메서드(클래스 메서드)
	public static 리턴타입 메서드명 (매개변수){실행문;[return;]}
	1. 클래스의 구성 요소이다 - 반드시 클래스 안에 존재
	2. 생성과 호출이 필요
	3. 메서드 명의 중복 불가
	4. 메서드명의 명명규칙은 네이밍 규칙과 동일 (첫글자를 소문자로)
	5. 매개변수의 의의 - 호출시 값을 전달 (단, 반드시 일치)
*/
class Ex16{
	public static void main(String args[]) {
		func1();
	}// main end
	
	public static void func1(){
		System.out.println("func1실행");
	} // func1 end
} // class end