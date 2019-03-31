//Test

public class Circle {

	private int radius;
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
}