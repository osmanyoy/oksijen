package com.yapikredi.dp.creational.objectpooling;

import java.io.Closeable;
import java.io.IOException;

public class Holder<T> implements Closeable{
	
	private ObjectPool<T> objectPool;

	public Holder(ObjectPool<T> objectPool) {
		this.objectPool = objectPool;
	}
	
	private T value;
	private long releaseDate;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public long getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(long releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public void close() throws IOException {
		objectPool.returnBack(this);
	}

}
