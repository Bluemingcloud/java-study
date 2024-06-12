package day09.super_;

public class Parent {
	
	String father;
	String mother;
	
	Parent(String father, String mother) {
		this.father = father;
		this.mother = mother;
	}
	
	String info() {
		return "부 : " + father + ", 모 : " + mother;
	}
}
