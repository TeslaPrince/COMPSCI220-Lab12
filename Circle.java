public class Circle extends Shape{
	double radius;
	Circle(double radius){
	super("Circle");
	this.radius = radius;
	}
  @Override
	public double getLength(){
		return radius;
	}
	@Override
	public double getWidth(){
		return radius;
	}
	public double getRadius(){
		return radius;
	}
	public double getArea(){
		return (Math.PI) * Math.pow(radius, 2);
	}
	public double getPerimeter(){
		return 2 * ( (Math.PI) * radius );
	}
	public int getSideCount(){
		return 0;
	}
}