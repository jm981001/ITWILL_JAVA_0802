package static_;

public class Ex5 {

	int b = check(2);
	
	static int a = check(1);
	
	public static int check(int i) {
		System.out.println("call : " + i);
		return i;
	}
	public static void main(String[] args) {
		System.out.println("main() 메서드");
		Ex5 ex = new Ex5() ;
	}
	static int c = check(3);
	

}
// 초기화부터 다 하고 main메서드 호출됨