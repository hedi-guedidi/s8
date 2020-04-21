package io.github.hedi_guedidi.s8and9;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PathEx {
	public static Path helloBye(Path path){
		return path.resolve("Hello.txt");
		
	}
	public static void main(String[] args) throws IOException {
		final Path infile = Path.of("myfolder/");
		final Path infile2=helloBye(infile);
		Files.createFile(infile2);
		try (OutputStream is = Files.newOutputStream(infile2)) {
			try(BufferedWriter writer = Files.newBufferedWriter(infile2)){
			writer.append("Hello,world!");
			}
		}
    }

}
