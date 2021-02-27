//if there is one base class for more than one sub classes -------> Hierarchical Inheritance

class A{
	int a = 40;
	void display(){
		System.out.println(" Class A");
		System.out.println(" Value of a : "+a);
	} 
}

class B extends A{
	int b = 80;
	void show(){
		System.out.println(" Class B");
		System.out.println(" Value of b : "+b);
	} 
}

class C extends A{
	int c = 160;
	void dis(){
		System.out.println(" Class C");
		System.out.println(" Value of c : "+c);
	} 
}

class Hierarchical{
	public static void main(String args[]){
		C obj1 = new C();
		obj1.dis();
		obj1.display();
		B obj2 = new B();
		obj2.show();
		obj2.display();
	}
}