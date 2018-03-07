package com.ljf.test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdapterTest {
	@Test
	public void test() {
		Robot robot = new DogAdapter();
		testAdapter(robot);
	}
	public void testAdapter(Robot robot){
		robot.talk();
		robot.move();
	}

}
