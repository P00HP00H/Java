public class page202-1 {			// 원래 이렇게 클래스 이름에 특수문자를 넣을 수 없지만 구별을 위해서 넣은 것이니 밑의 코드만 봐주세요!

	public static void main(String[] args) {

		Triangle tri = new Triangle(2, 5);
		System.out.println("밑변 : "+tri.base+" 높이 : "+tri.height);
		System.out.println("결과 : "+tri.wide());
		
		tri.baseChange(10);
		tri.heightChange(15);
		System.out.println("밑변 : "+tri.base+" 높이 : "+tri.height);
		System.out.println("결과 : "+tri.wide());
	}

}


class Triangle{

	int base;
	int height;
	
	public Triangle(int base, int height){
		this.base = base;
		this.height = height;
	}
	
	public void baseChange(int base) {
		this.base = base;
	}
	
	public void heightChange(int height) {
		this.height = height;
	}
	
	public double wide() {
		return base * height / 2;
	}

}