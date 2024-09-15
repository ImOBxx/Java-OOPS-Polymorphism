
class Shapes
{
	public double calcarea()
	{
		return 0;
	}
}

class Circle extends Shapes
{
	int r;
	
	Circle(int r)
	{
		this.r = r;
	}
	
	@Override
	public double calcarea()
	{
		return 3.14 * r * r;
	}
}

class Rectangle extends Shapes
{
	int l;
	int b;
	
	
	Rectangle(int l, int b)
	{
		this.l = l;
		this.b = b;
	}
	
	@Override
	public double calcarea()
	{
		return l * b;
	}

}

class Triangle extends Shapes
{
	int b;
	int h;
	
	
	Triangle (int b, int h)
	{
		this.b = b;
		this.h = h;
	}
	
	@Override
	public double calcarea()
	{
		return 0.5 * b * h;
	}
}

public class Shapes6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(4);
        System.out.println("Area of Circle: " + circle.calcarea());

        Rectangle rectangle = new Rectangle(12, 34);
        System.out.println("\nArea of Rectangle: " + rectangle.calcarea());

        Triangle triangle = new Triangle(5, 9);
        System.out.println("\nArea of Triangle: " + triangle.calcarea());
		
	}

	}

