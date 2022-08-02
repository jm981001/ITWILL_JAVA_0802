package static_;

class VariableEx{
	//멤버변수 선언
	String instanceMember = "인스턴스 멤버 변수";
	String instanceMember2; //초기화 하지 않을 경우 기본값(null)로 자동 초기화 됨
	static String classMember = "클래스 멤버 변수 ";
	
	//멤버 메서드 정의
	public void instanceMethod(String parameterVariable) {
		String localVariable = "로컬변수" ;
		
		//각 변수에 접근
		System.out.println(instanceMember);
		System.out.println(classMember);
		
		System.out.println(parameterVariable);
		System.out.println(localVariable);
	}
	public void instanceMethod2() {
		System.out.println(instanceMember); //가능
		System.out.println(classMember); //가능
		
//		System.out.println(parameterVariable); //불가능 에러뜸
//		System.out.println(localVariable); //불가능 에러뜸
	}
}


public class Ex2 {

	public static void main(String[] args) {
		VariableEx ve = new VariableEx();
		System.out.println(ve.instanceMember);
		
		//클래스 변수도 동일한 방법으로 접근 가능
		System.out.println(ve.classMember); //가능은 하지만 클래스명으로 접근하는게 좀더 좋다 (아래)
		System.out.println(VariableEx.classMember);//이렇게 사용하기
	}

}
