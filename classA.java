package overriding;

class A { 
	void display() {
		System.out.println("class a contains");
	}
}
class B extends A {
	void display()
	{
		System.out.println("class b contains");
	}
}
	

