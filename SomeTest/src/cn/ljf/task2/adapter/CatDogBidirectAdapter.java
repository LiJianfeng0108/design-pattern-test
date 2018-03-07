package cn.ljf.task2.adapter;

import cn.ljf.task2.adaptee.Cat;
import cn.ljf.task2.adaptee.Dog;

public class CatDogBidirectAdapter implements Cat, Dog {//˫��������
	private Cat cat;
	private Dog dog;
	
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public void bark() {
		dog.bark();
	}
	public void catchMouse() {
		cat.catchMouse();
	}
	public void catchSomething() {//��ץ����
		cat.catchMouse();
	}
	public void mew() {//èѧ����
		dog.bark();
	}	
}
