package Ex9_2b;

class Rectangle extends Shape{
	double hei;
	double wid;
	
	public Rectangle(double h, double w){
		hei=h;
		wid=w;
	}
	public double getArea() {
		return hei*wid;
	}
	public boolean equals(Object obj) {
		if(!(obj!=null && obj instanceof Rectangle))
			return false;
		Rectangle other=(Rectangle)obj;
		return (other.hei==this.hei&&other.wid==this.wid);
	}
	public String toString() {
		return ("Rectangle");
	}
	
}
class RightTriangle extends Shape{
	double hei;
	double wid;
	public RightTriangle(double h, double w) {
		hei=h;
		wid=w;
	}
	public double getArea() {
		return hei*wid/2;
	}
	public boolean equals(Object obj) {
		if(!(obj!=null && obj instanceof RightTriangle))
			return false;
		RightTriangle other=(RightTriangle)obj;
		return (other.hei==this.hei&&other.wid==this.wid);
	}
	public String toString() {
		return ("RightTriangle");
	}
	
}
class Circle extends Shape{
	double radius;
	public Circle(double r) {
		radius=r;
	}
	public double getArea() {
		return (3.14)*radius*radius;
	}
	public boolean equals(Object obj) {
		if(!(obj!=null && obj instanceof Circle))
			return false;
		Circle other=(Circle)obj;
		return (other.radius==this.radius);
	}
	public String toString() {
		return ("Circle");
	}
	
}



public class Ex9_2b {
	public static void main(String[] args) {
		Shape[] shape=new Shape[5];
		shape[0]=new Circle(6);
		shape[1]=new Circle(6);
		shape[2]=new Rectangle(4,5);
		shape[3]=new Rectangle(6,7);
		shape[4]=new RightTriangle(4,6);
		
		for(int i=0;i<5;i++) {
			System.out.println("shape1 : "+shape[i].toString()+
					", area is "+shape[i].getArea());
			if(i==0) continue;
			if(shape[i].equals(shape[i-1]))
				System.out.println("Shape"+i+", shape"+(i+1)+" are same");
			else
				System.out.println("Shape"+i+", shape"+(i+1)+" are different");
		}
	}

}
