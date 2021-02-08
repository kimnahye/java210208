
public class Quiz1 {
	//메소드는 2가지 종루가 있다.
	// JVM에서 제공되는 메소드와 사용자 정의 메소드
	// 메소드 선언 순서는 리턴타입 메소드이름(){실헹문;} - 기초가 있다.
	//메소드 선언할 떄 리턴타임가 반환타림을 결정할 수 있다. - 기초가 아니다.
	public static void main(String[] args) {
		Quiz1 q = new Quiz1();
		System.out.println("methodA(int x)호출 성공 =======. "+q.x);
		q.methodA();//다음 문법 에러를 해결하시오
		q.methodA(5);//ekdma 문법의 에러를 해결하시오.
	}
	//methodA의 호출이 선언 앞에 오더라도 에러가 아님
	//왜냐하면 자바는 절차지향의 프로그램 언어기 아니니까
	//왜냐하면 객체지향 언어이므로 호출순서와는 상관이 없다.
	//자바에서는 같으 이름의 메소드를 중복하여 선언할 수 있다.
	//이것을 가능하게 하는 규칙은 멧드 오버로담아
	private void methodA( ) {//private으로 하면 내안에서만 사용할수있다. 외부에 클래스에서는 접근이 불가함 ,호출이 안됨 , 재사용불가하다.
	 System.out.println("methodA호출 성공");
	}
//파라미터 x에는 누가 값을 저정해주는 걸까?
//언제 결정되는 건가?
	private void methodA(int x) {
		System.out.println("methodA(int x)호출 성공=======> + "+x);
	
	}
	private void methodA(float x) {
		System.out.println("methodA(int x)호출 성공=======> + "+x);
	}
}
