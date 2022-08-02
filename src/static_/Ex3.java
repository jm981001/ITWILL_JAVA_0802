package static_;

public class Ex3 {

	public static void main(String[] args) {
/*
 * < 자바 프로그램 실행 과정 >
 * 1. 소스 코드 작성 및 컴파일(번역) 후 클래스 실행 (Ctrl + F11)
 * 2. 클래스 로딩 - 클래스(정적) 멤버변수 및 메서드가 메모리에 로딩
 * 3. main() 메서드 호출(실행)
 * 4. 인스턴스 생성 - 인스턴스 멤버변수 및 메서드가 메모리에 로딩
 * 5. 메서드 호출(실행) - 메서드 내의 로컬 변수가 메모리에 로딩
 * 6. 결과 출력
 * 
 * < static 키워드 >
 * - 정적(고정된)이라는 의미를 갖는 키워드
 * - 클래스, 메서드, 변수의 지정자로 사용가능
 * - 멤버 메서드 또는 변수에 static 키워드를 사용할 경우
 *   인스턴스 생성과 관계없이 클래스가 로딩되는 시점에 함께 메모리에 로딩됨
 *   => 인스턴스 생성 전에 메모리에 로딩됨
 *      따라서, 인스턴스 생성 없이도 접근 가능(클래스명만으로 접근 가능)
 *      
 * < static 멤버변수 >
 * - 멤버변수 선언부 데이터타입 앞에 static 키워드를 사용하여 선언함
 * - 인스턴스 생성전, 클래스가 메모리에 로딩될 때 static 변수도 함께 로딩됨
 *   => Heap 공간이 아닌 Method Area (static 영역) 에 변수가 생성됨 (공유 영역)
 * - 모든 인스턴스가 하나의 변수(메모리)를 공유함
 *   (= 클래스 당 하나의 변수만 생성되며, 해당 변수를 모든 인스턴스가 공유)
 * - 참조변수 없이 클래스명만으로 해당 멤버에 접근 가능         
 * 
 * < static 메소드 >
 * - static 멤버변수와 마찬가지로 클래스 로딩 시 함께 메모리에 로딩되므로
 *   클래스명만으로 호출 가능한 메서드
 * */
//		System.out.println(s1.a); //에러! 참조변수선언 전 접근 불가능!
		
		//static멤버(클래스멤버) 변수는 클래스명만으로 인스턴스 생성과 상관없이 접근 가능
		System.out.println("StaticMember.a" + StaticMember.a);
		
		//static멤버(클래스멤버) 로 선언되지 않은 인스턴스 변수 b 는 클래스명만으로 접근 불가
//		System.out.println("StaticMember.b" + StaticMember.b); //에러뜸
		
		StaticMember s1 = new StaticMember();
		StaticMember s2 = new StaticMember();
		System.out.println("s1.a = " + s1.a + ", s2.a = " + s2.a);
		System.out.println("s1.b = " + s1.b + ", s2.b = " + s2.b);
		
	
//		s1.a = 99;//가능은 하지만 클래스명.멤버변수 로 하는게 좋음
		StaticMember.a = 99;
		System.out.println("s1.a" + s1.a + ", s2.a = " + s2.a);
		// => s1 인스턴스 멤버 변수의 a의 값만 변경하더라도 static변수이므로 모든 인스턴스가 해당 변수값을 공유하게되어
		// s2인스턴스 멤버변수 a도 99가 되었다
		// s1과 s2가 서로 다른 멤버 변수가 아닌 하나의 멤버변수를 공유하고있음
		s1.b = 999;
		System.out.println("s1.b" + s1.b + ", s2.b = " + s2.b);
		// =>s1과 s2는 서로 다른 인스턴스 변수 b를 갖게되므로
		// s2인스턴스의 변수 b의 값을 변경하더라도 s1인스턴스의 b는 영향을 받지 않는다 
		
		System.out.println("===================================");
		
		//일반메서드와 static 메서드 호출
		s1.nomalMethod(); //일반메서드 호출 방법(참조변수를 통해서 접근)
		s1.staticMethod();
		
//		StaticMember.nomalMethod(); //에러! 일반 메서드는 클래스명만으로 호출 불가
		StaticMember.staticMethod(); //static메서드는 클래스명만으로 호출 가능
	}

}
class StaticMember {
	static int a = 10; //클래스(static) 멤버변수(클래스 로딩 시 단 한번 메모리 할당 받음)
	int b = 20; //인스턴스 멤버 변수 (인스턴스 생성할 때마다 메모리 할당 받음)
	
	public void nomalMethod() {
		System.out.println("일반메서드!");
	}
	public static void staticMethod() {
		System.out.println("static 메소드!");
	}
}