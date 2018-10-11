package com.yapikredi.dp.creational.objectpooling;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ObjectPool<T> {
	private static final int POOL_SIZE = 100;
	
	private BlockingQueue<Holder<T>> pool = new ArrayBlockingQueue<>(POOL_SIZE);
	private Set<Holder<T>> holders = new HashSet<>();
	
	public ObjectPool(List<T> tList) {
		for (T t : tList) {
			Holder<T> holder = new Holder<>(this);
			holder.setValue(t);
			pool.add(holder);
		}
	}
	
	public Holder<T> get() {
		Holder<T> take = null;
		try {
			take = pool.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (take == null) {
			return null;
		}
		holders.add(take);
		take.setReleaseDate(System.currentTimeMillis());
		return take;
	}
	
	public void returnBack(Holder<T> t) {
		
		pool.add(t);
	}
	
}
