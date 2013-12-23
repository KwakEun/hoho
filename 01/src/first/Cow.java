package first;

public class Cow {

	private float weight;
	
	public Cow(){} //Default Constructor
	
	public Cow(float weight){
		this.weight = weight;
	}
	
	public void setWeight(float f) {
		// TODO Auto-generated method stub
		this.weight = f;
	}

	public float getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}
	
	//자기 자신을 return
	public Cow getThis(){
		return this;
	}

}
