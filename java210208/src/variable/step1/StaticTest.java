package variable.step1;

public class StaticTest {
/*
 * non-static타입은static영역에서 접근 불가 , 호출안돼 , 사용 못해
 */
	static void avg() {//사용자 정의 메소드 입니다.
		System.out.println("avg호출 성공");
	}
	public static void main(String[] args) {
		//if(args==null | args.length>0) { 
		if(args.length==0) { 
			//아래 문장은 실행에 따라 한번도 실행 할수 없다.  why : return
			System.out.println("야 입력해줘 !!!!");
			return;//main메소드 탈출하기
		}
		System.out.println(args[0]+10);
		int imsi = Integer.parseInt(args[0]);
		System.out.println(imsi+10);
		System.out.println("=======> "+imsi+10);
		//20출력이되독럭 코드를수정하시오, 1010말고 20출력되는 것을 보고싶다면 ?
		//주소번지는 없어도 호출할 수 있는  메소드가 있다 , 메소드 이름앞에  static이 있다면 .. 
		//main메소드는 자바가 제공하는 메소드 입니다. o|x
		//사용자 정의 메소드로 가능하다.
		//네가 필요한 메소드는 문자열을 집어(파라미터로) 넣으면 int타입으로 변환하여서 반환(리턴해서돌려주는 대입얀산자로 받을 수 있는)해주는 메소드가 필요해
		//parseInt()입니다.
		//네이나 구글링을  해서 위  요구사항을 만족하는 코드를 작성해 보시오.
		StaticTest.avg();
	}	
	
	
}
		
	

