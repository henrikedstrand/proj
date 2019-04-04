//Test

public class Circle {

	private int radius;
	private String text;
	public Ciricle(){
		radius=10;
	}

	public void setSize(int newSize){
		radius=newSize;
	}

	public int getSize(){
		return radius;
	}

	public int getArea(){
		return Math.PI*Math.pow(radius,2)
	}

	public void setText(String text){
		this.text=text;
	}
}
