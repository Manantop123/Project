package interfaces;
interface Drawable
{
	void draw();
}
class rectangle implements Drawable
{
	@Override
	public void draw() {
	System.out.println("rectangle");	
	}
}
class square implements Drawable
{
	@Override
	public void draw() {
		System.out.println("square");
	}
}
public class prog2 {
	public static void main(String[] args) {
		Drawable d1 = new rectangle();
		d1.draw();
	}
}
