public class page202-1 {			// ���� �̷��� Ŭ���� �̸��� Ư�����ڸ� ���� �� ������ ������ ���ؼ� ���� ���̴� ���� �ڵ常 ���ּ���!

	public static void main(String[] args) {

		Triangle tri = new Triangle(2, 5);
		System.out.println("�غ� : "+tri.base+" ���� : "+tri.height);
		System.out.println("��� : "+tri.wide());
		
		tri.baseChange(10);
		tri.heightChange(15);
		System.out.println("�غ� : "+tri.base+" ���� : "+tri.height);
		System.out.println("��� : "+tri.wide());
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