class Shape {
	
public static void main(String[] args)
{
    {
    	System.out.println("Shapes");
    }
}
}
class Circle extends Shape
{
	  public void myMethod1()
	    { 
	    	double A=3.14*dimension*dimension;
	    	double C=2*3.14*dimension;
	    	System.out.println(" "+A+" "+C);
	    }
	   
	  double dimension;
		Circle(double dimension)
		{
			this.dimension=dimension;
		}
	public static void main(String[] args)
		{
	        System.out.println("The Area and Circumfrence is = ");
	        Circle obj1=new Circle(5);
	        obj1.myMethod1();
	    }
}

class Square extends Shape
{
	 public void myMethod2()
	    {
	    	int var2=6;
	    	double Ar=var2*var2;
	    	System.out.println(" "+Ar);
	    }
	  public static void main(String[] args)
	{
        System.out.println("The Area is = ");
        Square obj2=new Square();
        obj2.myMethod2();
	}
}

class Sphere extends Shape
{
	public void myMethod3()
    {
    	int var3=6;
    	double Vol=var3*var3*var3;
    	System.out.println(" "+Vol);
    }
	public static void main(String arg[]) 
	  { 
	  Sphere obj3=new Sphere(); 
	  obj3.myMethod3(); 
	  } 
}

class Check
{
	public static void main(String arg[]) 
	{
	Circle obja=new Circle(5);
	obja.myMethod1();
	Square objb= new Square();
	objb.myMethod2();
	Sphere objc=new Sphere();
	objc.myMethod3();
	}	
}
 