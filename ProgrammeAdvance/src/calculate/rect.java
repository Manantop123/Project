package calculate;

public class rect {
	
	//data mamber
	int length , breadth;
	
	
	//constructor
	rect(int lenght , int breadth)
	{
		this.length=lenght;
		this.breadth = breadth;
	}
	
	//method for rectangle
	public void area()
	{
		int AreaOfRectangle;
		
		AreaOfRectangle = this.length * this.breadth;
		
		System.out.println("areaofrectangle is "+" "+AreaOfRectangle);
		
	}
	
	//method for perimter
	public void perimeter()
	{
		int PerimeterOfRectangle;
		
		PerimeterOfRectangle = 2*(this.length*this.breadth);
		
		System.out.println("PerimeterOfrectangle is"+" "+PerimeterOfRectangle);
	}
	
}
