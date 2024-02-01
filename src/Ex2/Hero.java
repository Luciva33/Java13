package Ex2;

public class Hero {

	private String name;
	private int hp;

	public Hero() {
		this.name = "勇者";
		this.hp = 100;
	}

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String getName() {
		return this.name + "さん";
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {

		//三項条件演算子

		this.hp = hp < 0 ? 0 : hp;

	}

	//		if(hp < 0) {
	//			this.hp = 0;
	//		}else
	//		this.hp = hp;
	//	} 

}
