public class page202 {

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