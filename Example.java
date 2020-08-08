class A{
	void myMethod(){
		System.out.println("myMethod() of A");
	}
}
class B extends A{
	void myMethod(){
		System.out.println("myMethod() of B");
	}
}
class C extends B {
	void myMethod(){
		System.out.println("myMethod() of C");
	}
}
class Example{
	public static void main(String args[]){
		A a1=new A();
		a1.myMethod();	//no dispatch

		a1=new B();	
		a1.myMethod();	//dispatch 
		
		a1=new C();
		a1.myMethod();	//dispatch
		
		B b1=new B();
		b1.myMethod();	//no dispatch
		
		b1=new C();
		b1.myMethod();	//dispatch
	
		C c1=new C();
		c1.myMethod();	//no dispatch
	}
}
