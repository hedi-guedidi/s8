package io.github.hedi_guedidi.s8and9;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.io.StringReader;
import java.util.List;
public class PersonTest {
	@Test
	void readPersonsTest() throws IOException {
		String expected="firstname\nlastname";
		StringReader reader=new StringReader("firstname\nlastname");
		List<Person> res=Person.readPersons(reader);
		Assertions.assertEquals(res.get(0).toString(),expected);
	}
}
