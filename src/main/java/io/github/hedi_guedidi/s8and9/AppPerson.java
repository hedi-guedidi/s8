package io.github.hedi_guedidi.s8and9;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;



public class AppPerson {

	public static void main(String[] args) throws IOException {
		final Path infile = Path.of("names.txt");
		Charset charset = Charset.forName("UTF-8");
		try(Reader stream= Files.newBufferedReader(infile,charset)){
			Person.readPersons(stream);
		}

	}

}
