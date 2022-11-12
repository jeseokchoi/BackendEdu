package day01;

public interface Ex02 {
	public static void main(String[] args) {
		// 자료형 변환
		// 수정한 과정 어떻게 보나여???????
		double pi =  3.14F;
		int num = (int)pi;
		// Type mismatch: cannot convert from double to int (형변환이 안되서 문제가 될 수도 있다는 경고)
		// 대입 연산 시, 좌변과 우변의 자료형은 같아야 한다
		// 일시적으로 우변의 값을 원하는 자료형으로 변환한 이후 대입한다(casting)
		
		int num2 = 1234;
		double db = num2;
		// num2는 정수이지만, 변수에 옮겨담으면서 암묵정으로 형변환이 발생한다
		// 암묵적 형변환, promotion
		
		System.out.println("pi : " + pi);
		System.out.println("num : " + num);
		
		System.out.println("num2 : " + num2);
		System.out.println("db : " + db);
	}
}