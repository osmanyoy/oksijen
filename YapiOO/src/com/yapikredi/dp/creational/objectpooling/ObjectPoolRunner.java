package com.yapikredi.dp.creational.objectpooling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ObjectPoolRunner {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			strList.add("STR " + i);
		}
		ObjectPool<String> strPool = new ObjectPool<>(strList);

		try(Holder<String> holder = strPool.get()){
			String value = holder.getValue();
			System.out.println("tete : " + value);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
