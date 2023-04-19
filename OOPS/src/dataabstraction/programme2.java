package dataabstraction;

abstract class GeometricShapes{
	String nameOfShape;
	
	//abstract method
	abstract double calculateArea();
	
	public abstract String toString();
	
	//constructor
	public GeometricShapes(String nameOfShape)
	{
		System.out.println("geometric constructor inside class");
		this.nameOfShape = nameOfShape;
	}
	
	//non-abstract method
	public String getNameOfShape()
	{
		return nameOfShape;
	}
}

class circle extends GeometricShapes
{
	double radius;
	
	//constructor
	public circle(String nameOfShape, double radius)
	{
		super(nameOfShape);
		System.out.println("inside the constructor of circle class");
	}
	
	//parent abstrct method implement in child class
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}
	
	
	//@override
	public String toString()
	{
		return "name of shap"
				+ "e is" + super.nameOfShape + "and its area is:" + calculateArea();
	}

	

}
public class programme2 {
	public static void main(String[] args) {
		GeometricShapes g1 = new circle("circle", 65);	
		System.out.println(g1.toString());
		}
}
