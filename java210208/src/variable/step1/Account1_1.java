package variable.step1;


public class Account1_1 {
double kor = 0;//국어점수 담기
double math = 0;//수학점수 담기
double eng = 0; //영어점수 담기
/****************************************************************************
 * 총점을 구하는 메소드입니다.
 * @param kor2 - 학생의 국어 점수
 * @param math2- 학새의 수학 점수
 * @param eng2 - 랃생의 영어 점수
 * @return tot - 한 학생의 세 과목의 총점을 구하여 담는 변수
 *******************************************************************************/
private double hap(double kor2, double math2, double eng2) {//70 80 90
	double tot = 0;
	tot = kor2 + math2 + eng2;
	System.out.println("tot==>"+tot);//240
	return tot;
}
/*****************************************************************************
 * 평균을 구하는 메소드 구현
 * @param tot hap메소드를 호출 하여 tot를 받아온다.
 * @return
 ******************************************************************************/
private double avg(double tot) {
	System.out.println("파라미터로 넘어오 tot값 출력해 보기 ==>"+ tot);
	double avg = 0.0;
	avg= tot /3;
	return 0;
	//insert here	
}
/*나는 메소드를 선언 할 수 있다.
// 첫날에 한건 대입연산자 int i= 2;//메소드 안에 있는(,)는 열거형 연산자라고 한다.
//". dot" 연산자- 앞쪽에 주소번지(. )뒤쪽에 전역변수
//접근제한자(access modifier) - static 수정자 - 리턴타입 - 메소드이름(파라미터1,파라미터2,....)
*/
	public static void main(String[] args) {
		Account1_1 ac = new Account1_1();
		ac.kor = 70;
		ac.math = 80;
		ac.eng = 90;
		double tot =ac.hap(ac.kor,ac.math,ac.eng);//240
		//double tot =240;
		
		
		/*위에서 계산한 총점을 avg 메소드이 파라미터로 넘길려면 
		//반드시 리턴타임이 필요함
		//hap(double kordouble.math,double.eng);같다
		//double test_avg = ac.avg(tot);// 평균이 계산됨
		*/
		
		double test_avg2 = ac.avg(tot,3);// 평균이 계산됨
	
	}
	/**********************************************************
	 * 값에 의한 호출이다 .
	 * @param tot  -총합을 꼐산한 값
	 *  @param subjectNumber - 과목수
	 *  @return
	 */
	private double avg(double tot, int subjectNumber) {
		//0.0이 찍이면 배달사고가 일어난다.-단위 데스트를 통해 확인하고 진행한다.
		System.out.println("tot==> "+ tot+",subjectNumber==>"+subjectNumber);
		double imis =tot/subjectNumber;
		return imis;
	}
		
	}

	


