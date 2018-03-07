package cn.ljf.task2.adaptee;

public class ConcreteDog implements Dog {
	public void bark() {
		System.out.println("\"Wang! Wang!\"");
	}

	public void catchSomething() {
		System.out.println("Something was caught!");
	}
}
