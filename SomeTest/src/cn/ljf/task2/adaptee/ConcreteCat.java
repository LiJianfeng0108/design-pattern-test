package cn.ljf.task2.adaptee;

public class ConcreteCat implements Cat {
	public void catchMouse() {
		System.out.println("A mouse was dead.");
	}

	public void mew() {
		System.out.println("\"miao~\"");
	}
}
