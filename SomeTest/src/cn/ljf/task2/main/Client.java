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
		Cat catNew = adapter;//ʹ����������ת����è
		System.out.println("èѧ����:");
		catNew.mew();//èѧ����
		
		adapter.setCat(cat);
		Dog dogNew = adapter;//ʹ��������èת���ɹ�
		System.out.println("\n��ץ����:");
		dogNew.catchSomething();//��ץ����
	}
}
