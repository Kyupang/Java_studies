package org.opentutorials.javatutorials.Inheritance;

class MultiplicationableCalculator extends Calculator {
	public void multiplication() {
		System.out.println(this.left*this.right);
	}
}

class DivisionableCalculator extends MultiplicationableCalculator{
	public void division() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		
		MultiplicationableCalculator c1 = new MultiplicationableCalculator();
		c1.setoperands(10, 20);
		c1.multiplication();
	
		DivisionableCalculator d1 = new DivisionableCalculator();
		d1.setoperands(20, 10);
		d1.division();
		d1.multiplication();
	}

	
	// 상속 코드중복제거, 부모가 만든 코드 자식이 사용 재활용성
	// 부모의 코드를 개선했다! 하면 상속된 모든 클래스에서 적용가능
	// 그 클래스에서의 역할 빼곤 다 부모에서 정의되어있기에 가독성 증가
	
}
