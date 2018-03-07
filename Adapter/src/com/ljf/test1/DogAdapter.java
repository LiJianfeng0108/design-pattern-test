package com.ljf.test1;

public class DogAdapter extends Dog implements Robot {//Adapter
	@Override
	public void talk() {
		super.bark();
	}
	@Override
	public void move() {
		super.run();
	}

}
