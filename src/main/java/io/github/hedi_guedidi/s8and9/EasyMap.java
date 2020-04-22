package io.github.hedi_guedidi.s8and9;

import java.util.List;
import java.util.Optional;

public interface EasyMap{
	public void put(String lastName,Person person);
	public Optional<Person> valueOf(String lastname);
	public List<Person> getOrderedValue();
}
