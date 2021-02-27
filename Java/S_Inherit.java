class Parent{
	int a = 10;
	void display(){
		System.out.println(" Parent Class");
	}
}

class Child extends Parent{
	int b = 20;
	void show(){
		System.out.println(" Chlid Class");
	}
}

class S_Inherit{
	public static void main(String args[]){
		Child c = new Child();
		c.display();
		System.out.println(" Value of a :  "+c.a);
		c.show();
		System.out.println(" Value of b :  "+c.b);
	}
}