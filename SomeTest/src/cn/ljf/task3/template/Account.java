package cn.ljf.task3.template;

public abstract class Account {
	public void findUser(){
		System.out.println("��ѯ�û���Ϣ��");
	}
	public abstract void findtype();
	public abstract void calculateInterest();
	public void display(){
		System.out.println("��ʾ��Ϣ��");
	}
	public void handle(){//ģ�巽��
		findUser();
		findtype();
		calculateInterest();
		display();
	}
}
