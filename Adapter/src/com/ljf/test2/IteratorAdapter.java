package com.ljf.test2;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Adapter, Adaptee: Iterator, Target: Enumeration
 */
public class IteratorAdapter<E> implements Enumeration<E>{
	private Iterator<?> iterator;
	public IteratorAdapter(Iterator<?> iterator){
		this.iterator = iterator;
	}
	public boolean hasMoreElements(){
		return this.iterator.hasNext();
	}
	public E nextElement(){
		return (E) this.iterator.next();
	}
}
