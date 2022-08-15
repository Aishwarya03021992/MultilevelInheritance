package com.multilevelinheritance;

public class Child extends Parent{  //child class
	public void childName() {
		System.out.println("My son name is D.S.Mahadev");
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.childName();
		c.GrandParentName();
		c.parentName();

	}

}
