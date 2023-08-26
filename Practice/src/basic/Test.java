package basic;

public class Test {
public static void main(String[] args) {
	
	P p = new P();
	p.m1();
	p.m2();
	
	C c = new C();
	c.m1();
	c.m2();
	
	P p1 = new C ();
	
	p1.m1();
	
	
	// parent class object reference can call only parent specific methods 
 
	
	// with child calss object referece we can call child specific methods and parent class specific methods 
	
	 
	//if parent calss holds child class object with parent class Reference we can call parent specific methods 
	//  and overridden child class methods but not child specific methods
}

}
