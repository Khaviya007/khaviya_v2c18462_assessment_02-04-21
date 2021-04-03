package democls;
class Base{
	public void mul(int a,int b,int c) {
	System.out.println("base mul is: "+a*b*c);
	}
}
class Derived extends Base{
	public void mul(int a,int b,int c) {
		System.out.println("derived mul is: "+a*b*c);
}
}
public class Demo {
	public static void main(String[] args) {
		Derived d=new Derived();
	    d.mul(2, 4, 3);
		Base b=new Base();
		b.mul(4, 5, 6);

	}

}
