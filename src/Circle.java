
public class Circle extends Shape{
	double radius;
	
	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle 클레스의 생성자 호출");
		this.radius = radius;
	}
	double area() {
		return radius * radius * 3.14;
	}
	public String toString() {
		return "원 색상은 " + super.getColor() + 
				" 그리고 면적은 " + area();
	}

}
