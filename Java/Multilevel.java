// derived class is derived from another derived class

class A{
	int a = 20;
	void display(){
		System.out.println(" Class A");
	}
}

class B extends A{
	int b = 40;
	void show(){
		System.out.println(" Class B");
	}
}

class C extends B{
	int c = 60;
	void dis(){
		System.out.println(" Class C");
	} 
}

class Multilevel{
	public static void main(String args[]){
		C obj = new C();
		obj.display();
		System.out.println(" Value of a : "+obj.a);
		obj.show();
		System.out.println(" Value of b : "+obj.b);
		obj.dis();
		System.out.println(" Value of c : "+obj.c);
	}
}