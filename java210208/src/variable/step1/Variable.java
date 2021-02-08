package variable.step1;

public class Variable {
	//선언부
	
	//메소드 선언
	void methodA(int x) {
		
	}
	double methodB(int x) {//x는 지번 밖에서는 사용불가
		System.out.println(x);//1
		return 3.14;
	}
	//메인메소드 - exe파일로 만들 수 있어요.
	/**************************************************************************************************
	 * 문제해결능력 키움
	 * @return void이다. - 비어있다. - 돌려 받을 수 있는 값이 없다. - 이것떄문에 에러가 발생할 수도 있다.
	 * @param args
	 **************************************************************************************************/
      public static void main(String[] args) {
		//System: 너의 컴터 out속성: 출력장치(하드웨어-모니더,프린터...),print(),print(int i),print(double.pi),printd("안녕"),print(),
		System.out.print(5);//줄바끔 안됨  , 메소드를 호출할 수 있니? 너는 ??? 주소번지.methodA();
		//메소드 선언할 댸는 최종괄호 우중괄호 를 사용하고..
		//메소드 호출떄는;
		//API,xx,jar, 이 안에(클래스[소스사 만들어졌으니까 구체적이다]안에 객체[결정되지 않았다. sonata.java, class Sonata()] 있는 것을 꺼내쓴다.
		//print메소드는 여라개이다. 같은 이르의 메소드를 여러개 만들 있다.
		//SELECT 이름 FROM 회원 집합
		//WHERE 아이디='test'
		//AND 비번 = '123'
		//객체는 추상적이다.
		//System.out.print();//줄바꿈 안됨 - 반화낪이 없으니 에러인거야 출력결과 물 
		Variable v = new Variable();
		System.out.print(v.methodB(1));// 줄바꿈 됨 
		System.out.print(1+" "+1);//줄바꿈 추가된 메소드 
		System.out.print(10+10);//줄바꿈 안됨 
		System.out.print(10+"10");//줄바꿈 ㄴㄴ
		System.out.print(10+""+10);//줄바꿈 ㄴㄴ 
		System.out.print("    ");//줄바꿈 ㄴㄴ
		System.out.println();//줄바꿈 추가된 메소드
	}

}
