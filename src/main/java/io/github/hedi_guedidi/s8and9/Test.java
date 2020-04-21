package io.github.hedi_guedidi.s8and9;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {

	public static void main(String[] args) throws IOException {
		final Path infile = Path.of("in.txt");
		try (InputStream is = Files.newInputStream(infile)) {
			while (true) {
				final int read = is.read();
				if (read == -1) {
					break;
				}
				System.out.print(read + " ");
			}
		}
	}
}
