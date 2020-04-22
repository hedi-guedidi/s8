package io.github.hedi_guedidi.s8and9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

public class EasyMapImpl implements EasyMap {

	LinkedHashMap<String,Person> map=new LinkedHashMap<>();
	
	public static EasyMapImpl newInstance() {
		return new EasyMapImpl();
	}

	@Override
	public void put(String lastName, Person person) {
		map.put(lastName, person);
	}

	@Override
	public Optional<Person> valueOf(String lastname) {
		if(map.containsKey(lastname)) {
		return Optional.of(map.get(lastname));}
		return  Optional.empty();
		
	}

	@Override
	public List<Person> getOrderedValue() {
		List<Person> res =new ArrayList<>();
		res.addAll(map.values());
		Collections.sort(res, new MyComparator());
		return res;
	}
	

}
