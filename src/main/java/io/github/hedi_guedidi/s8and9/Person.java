package io.github.hedi_guedidi.s8and9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Person {
	String firstname;
	String lastname;
	public Person(String first,String last) {
		firstname=first;
		lastname=last;	
	}
	public String getFirstName() {
		return firstname;
	}
	public String getLastName() {
		return lastname;
	}
	@Override
	public String toString(){
		return firstname+"\n"+lastname;
	}
	 public static List<Person> readPersons(Reader reader) throws IOException{
		 BufferedReader rd =new BufferedReader(reader);
		 List<Person> res = new ArrayList<>();
		 String firstnametemp;
		 String lastnametemp;
		 
				while ((firstnametemp=rd.readLine()) != null){
					lastnametemp=rd.readLine();
					res.add(new Person(firstnametemp,lastnametemp));
				}
				return res; 
	}
}
