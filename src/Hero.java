
public class Hero {
	//	カプセル化はフィールドを守るためのもの

	private String name; 
	private int hp;

	public Hero() {
    	
    	setName(name);
    	setHp(hp);
	
	}
	
//    public Hero(String name ,int hp) {
//    	
//    	setName(name);
//    	setHp(hp);
//    }
	
	public String getName() {
		return this.name + "さん";
	}
	public void setName(String name) {
		this.name = name ;
	}

	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		//代入する前に、判定を行える
		//ダメなものを入れようとしてるときに大丈夫なものにする
		if(hp < 0) {
			this.hp = 0;
		}else {
		this.hp = hp;     //this.newname = name; のようにフィールド変更もできる
		}
	}

}
