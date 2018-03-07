package cn.ljf.task2.main;

import cn.ljf.task2.adaptee.Cat;
import cn.ljf.task2.adaptee.ConcreteCat;
import cn.ljf.task2.adaptee.ConcreteDog;
import cn.ljf.task2.adaptee.Dog;
import cn.ljf.task2.adapter.CatDogBidirectAdapter;

public class Client {
	public static void main(String[] args) {
		Cat cat = new ConcreteCat();
		Dog dog = new ConcreteDog();
		CatDogBidirectAdapter adapter = new CatDogBidirectAdapter();
		adapter.setDog(dog);
		Cat catNew = adapter;//使用适配器狗转换成猫
		System.out.println("猫学狗叫:");
		catNew.mew();//猫学狗叫
		
		adapter.setCat(cat);
		Dog dogNew = adapter;//使用适配器猫转换成狗
		System.out.println("\n狗抓老鼠:");
		dogNew.catchSomething();//狗抓老鼠
	}
}
