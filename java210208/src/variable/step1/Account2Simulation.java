package variable.step1;
/*
 * 선생님 근데 처음부터 전역변수는 kor,math,eng의  0대신 점수는 안되나요 
 * 어떤 문제가 궁금합니까
 * 된다
 * 대신 이 값은 한번에 라나만 기억된다
 * C언어는 초기화를 생략하면 쓰레기값으로 출력된다
 * 자바언어는 각 타입
 * 
 * public> protected >friendly> private
 */
public class Account2Simulation {
	
	//public 공공 
	public static void main(String[] args) {
		Account2 a = new Account2();
		System.out.println("영어  :"  +a .eng);//0
		System.out.println("수학  :"  +a .math);//0
		System.out.println("국어  :"  +a .kor);//0
		System.out.println("==============================");
		
		
		System.out.println("영어  :"  +a .eng1);//0
		System.out.println("수학  :"  +a .math1);//0
		System.out.println("국어  :"  +a .kor1);//0
		System.out.println("===============================");
		
		
		System.out.println("영어  :"  +a .eng2);//90
		System.out.println("수학  :"  +a .math2);//80
		System.out.println("국어  :"  +a .kor2);//70
		
		Account2 a2 = new Account2();
		a2.eng2 = 95; 
		a2.math2 = 85; 
		a2.kor2 = 75;
		System.out.println("영어  :"  +a2 .eng2);//95
		System.out.println("수학  :"  +a2 .math2);//85
		System.out.println("국어  :"  +a2 .kor2);//75
			
			
			
		
	}

}
