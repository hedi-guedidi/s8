package io.github.hedi_guedidi.s8and9;

import java.util.ArrayList;
import java.util.Scanner;

public class HashTable {
	private ArrayList<String> keys=new ArrayList<>();
	private ArrayList<String> values=new ArrayList<>();
	
	public String get(String key) {
		if(containsKey(key)){
			return values.get(keys.indexOf(key));
		}
		return null;
	}
	public boolean put(String key,String value) {
		if(containsKey(key)){
			return false;
		}
		keys.add(key);
		values.add(value);
		return true;
	}
	public boolean remove(String key) {
		if(containsKey(key)){
			int position=keys.indexOf(key);
			keys.remove(position);
			values.remove(position);
			
			return true;
		}
		return false;
	}
	public boolean containsKey(String key) {
		return keys.contains(key);
		
	}
	public void dump() {
		System.out.println(keys);
		System.out.println(values);
	}
	public int size() {
		return keys.size();
	}

}
