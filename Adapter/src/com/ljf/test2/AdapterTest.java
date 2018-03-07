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
		Iterator<String> iterator = al.iterator();//ʹ�õ�����
		System.out.println("�����������");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		Enumeration<String> enumeration 
			= new IteratorAdapter<>(al.iterator());//ʹ����������������ת����ö����
		System.out.println("\nö���������");
		while(enumeration.hasMoreElements()){
			System.out.println(enumeration.nextElement());
		}
	}

}

class Adaptee {//��������
    public void specificRequest() {  
        System.out.println("This is adaptee!");  
    }  
}  
interface Target {//Ŀ��ӿ�
    public void request();  
}  
class ConcreteTarget implements Target {//����Ŀ����  
    public void request() {  
        System.out.println("This is concrete target!");  
    }  
}

/*
 * ��������ģʽ
 */
class Adapter1 extends Adaptee implements Target{//���������̳��˱������࣬ͬʱʵ��Ŀ��ӿ�  
    public void request() {  
        super.specificRequest();  
    }  
}  
/*
 * ����������ģʽ
 */
class Adapter2 implements Target{//��������ʵ��Ŀ��ӿڣ���������������
	private Adaptee adaptee;//������������
	public Adapter2(Adaptee adaptee){
		this.adaptee = adaptee;
	}
    public void request() {  
    	this.adaptee.specificRequest();  
    }  
}  

  
