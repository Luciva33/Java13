
public class Main {

	public static void main(String[] args) {
		//カプセル化
		Hero h = new Hero();
//		h.hp = -100;
		
		//hpを代入したいとき
		h.setName("勇者");
		h.setHp(-100);
		
		//hpを呼び出したいとき
		
		System.out.println(h.getName() +"のHP : "+ h.getHp());
		
		
		
		
	}

}
