package com.ljf.test2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.ljf.test1.DogAdapter;
import com.ljf.test1.Robot;

public class AdapterTest {
	@Test
	public void test() {
		List<String> al = new ArrayList<>();
		al.add("Dog");
		al.add("Cat");
		al.add("Rabbit");
		Iterator<String> iterator = al.iterator();//使用迭代器
		System.out.println("迭代器输出：");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		Enumeration<String> enumeration 
			= new IteratorAdapter<>(al.iterator());//使用适配器，迭代器转换成枚举器
		System.out.println("\n枚举器输出：");
		while(enumeration.hasMoreElements()){
			System.out.println(enumeration.nextElement());
		}
	}

}

class Adaptee {//被适配者
    public void specificRequest() {  
        System.out.println("This is adaptee!");  
    }  
}  
interface Target {//目标接口
    public void request();  
}  
class ConcreteTarget implements Target {//具体目标类  
    public void request() {  
        System.out.println("This is concrete target!");  
    }  
}

/*
 * 类适配器模式
 */
class Adapter1 extends Adaptee implements Target{//适配器，继承了被适配类，同时实现目标接口  
    public void request() {  
        super.specificRequest();  
    }  
}  
/*
 * 对象适配器模式
 */
class Adapter2 implements Target{//适配器，实现目标接口，并关联被适配类
	private Adaptee adaptee;//关联被适配者
	public Adapter2(Adaptee adaptee){
		this.adaptee = adaptee;
	}
    public void request() {  
    	this.adaptee.specificRequest();  
    }  
}  

  
