class Ex10{
	public static void main(String[] args) {
		// 제어문
		// 1. 조건문
		// 1.2 switch문
		// switch(값) {
		//    case 값: 실행문;break;
		//    case 값: 실행문;break;
		//    ...
		//    default: 실행문;
		// }
		int n = 0;
		switch(n) {
			case 2: System.out.print("이"); [break;]
			case 1: System.out.print("일"); [break;]
			case 0: System.out.print("영"); [break;]
			case -1: System.out.print("마일"); [break;]
			default: System.out.print("몰라");
		}
		System.out.println("입니다");
		// 주의사항 두가지
		// jdk 1.5 이전에는 switch 사용 권장
		// 성능이 더 좋대요
		// 어느 순간 쑥 사라짐.
		// 정말로 성능이 더 좋은게 아니라서 없어진건지 아니면 그냥 상관없이 누락시켯는ㄴㄴ지는 모르겠지만, 
		// 우리가 다루는  pc는 if문 switch로 바꿨다고 해서 성능이 확 개선될 만큼의 성능이 미약하지 가 않음. 티가 안난다
		// 그래서 그냥 그 말을 누락시켯는지는 확실하지 않지만.. 
		// 좀 더 로우레벨 성질이라서 사실 성능이 좀 더 좋을 수밖에 없음. 수행 방식이. 
		// 근데 근래에는 그 얘기가 사라졌으니까. 
		// 암거나 상관없지만, 나중을 위해서 switch 쓰려는 노력 해보기 . 잘 사용하면 편하고, 사용이 좀 많아진다고(?) 함
		// 자바 switch 특성 두가지
		// 1. 타 언어에 비해 유연하지가 않음
		// - 반드시 값 자료형 일치해야 함: n은 int인데 case에 1.0 이면 자료형이 달라서 컴파일 오류
		// 2. 값은 반드시 값으로 들어와야 함. 
		// - case su>3 뭐 이런식으로 조건문, 식, 연산 등이 들어오면 안 된다는 것. 
		// 주의점 
		// 만일 break를 case에서 빼먹으면? 
		// 일치하는 케이스로 가서 실행을 하는데, break가 없으면 빠져나가지못하고 계속 실행된다
		// 여러개 값에 동일한 실행 주고 싶으면 문제가 아니지만, break 여부에 따라 원하는 동작이 나오지 않을 수도.
		// 즉, break는 선택 (옵션의 경우 대괄호로 표기)
		
	}
}