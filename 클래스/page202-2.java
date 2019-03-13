public class page202-2 {		// 원래 이렇게 클래스 이름에 특수문자를 넣을 수 없지만 구별을 위해서 넣은 것이니 밑의 코드만 봐주세요!
	
	public static void main(String[] args) {
		
		Marble mar1 = new Marble("어린이1", 15);
		Marble mar2 = new Marble("어린이2", 9);

		System.out.println("게임 시작 전");
		System.out.println(mar1.name+"의 구슬의 수: "+mar1.nowassets());
		System.out.println(mar2.name+"의 구슬의 수: "+mar2.nowassets());
		
		/* mar1이 mar2를 상대로 구슬 2개를 획득 */
		mar1.play(mar2, 2);
		System.out.println("\n"+"1차 게임 시작");
		System.out.println(mar1.name+"의 구슬의 수: "+mar1.nowassets());
		System.out.println(mar2.name+"의 구슬의 수: "+mar2.nowassets());
		
		/* mar2이 mar1를 상대로 구슬 7개를 획득 */
		mar2.play(mar1, 7);
		System.out.println("\n"+"2차 게임 시작");
		System.out.println(mar1.name+"의 구슬의 수: "+mar1.nowassets());
		System.out.println(mar2.name+"의 구슬의 수: "+mar2.nowassets());
		
	}
}

class Marble{
	
	String name;
	int num;
	
	/* 생성자로 객체 변수 초기화 */
	public Marble(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	/* 매개변수에 상대방 객체와 내가 획득한 갯수가 들어감 */
	public void play(Marble opponent, int obtain) {
		this.num += obtain;
		opponent.num -= obtain;
	}
	
	/* 현재 자산 */
	public int nowassets() {
		return num;
	}
	
}