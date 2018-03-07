package cn.ljf.task3.template;

public abstract class Account {
	public void findUser(){
		System.out.println("查询用户信息。");
	}
	public abstract void findtype();
	public abstract void calculateInterest();
	public void display(){
		System.out.println("显示利息。");
	}
	public void handle(){//模板方法
		findUser();
		findtype();
		calculateInterest();
		display();
	}
}
