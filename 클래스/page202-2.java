public class page202-2 {		// ���� �̷��� Ŭ���� �̸��� Ư�����ڸ� ���� �� ������ ������ ���ؼ� ���� ���̴� ���� �ڵ常 ���ּ���!
	
	public static void main(String[] args) {
		
		Marble mar1 = new Marble("���1", 15);
		Marble mar2 = new Marble("���2", 9);

		System.out.println("���� ���� ��");
		System.out.println(mar1.name+"�� ������ ��: "+mar1.nowassets());
		System.out.println(mar2.name+"�� ������ ��: "+mar2.nowassets());
		
		/* mar1�� mar2�� ���� ���� 2���� ȹ�� */
		mar1.play(mar2, 2);
		System.out.println("\n"+"1�� ���� ����");
		System.out.println(mar1.name+"�� ������ ��: "+mar1.nowassets());
		System.out.println(mar2.name+"�� ������ ��: "+mar2.nowassets());
		
		/* mar2�� mar1�� ���� ���� 7���� ȹ�� */
		mar2.play(mar1, 7);
		System.out.println("\n"+"2�� ���� ����");
		System.out.println(mar1.name+"�� ������ ��: "+mar1.nowassets());
		System.out.println(mar2.name+"�� ������ ��: "+mar2.nowassets());
		
	}
}

class Marble{
	
	String name;
	int num;
	
	/* �����ڷ� ��ü ���� �ʱ�ȭ */
	public Marble(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	/* �Ű������� ���� ��ü�� ���� ȹ���� ������ �� */
	public void play(Marble opponent, int obtain) {
		this.num += obtain;
		opponent.num -= obtain;
	}
	
	/* ���� �ڻ� */
	public int nowassets() {
		return num;
	}
	
}