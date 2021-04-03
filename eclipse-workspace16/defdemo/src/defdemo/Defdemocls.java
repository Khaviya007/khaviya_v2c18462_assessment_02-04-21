package defdemo;
class A{
	public int mul(int a,int b,int c) {
	return a*b*c;
	}
}
public class Defdemocls {
	public static void main(String[] args) {
		A a=new A();
		int q=a.mul(3, 4, 0);
		int r=a.mul(2, 3, 4);
		System.out.println("mul is: "+q);
		System.out.println("mul is: "+r);
	}

}
