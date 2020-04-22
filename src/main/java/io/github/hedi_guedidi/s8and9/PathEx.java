package io.github.hedi_guedidi.s8and9;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class PathEx {
	public static Path helloBye(Path path) throws IOException {
		final Path infile = path.resolve("Hello.txt");
		final Path subfolderPath = path.resolve("subfolder/");
		final Path byePath = subfolderPath.resolve("bye.txt");
		Files.createFile(infile);
		Files.createDirectory(subfolderPath);
		try (BufferedWriter writer = Files.newBufferedWriter(infile)) {
			writer.append("Hello,world!");
		}
		try (BufferedWriter writer = Files.newBufferedWriter(byePath)) {
			writer.append("Bye bye!");
		}
		return infile;
	}

	public static void main(String[] args) throws IOException {
		//helloBye(Path.of("test1/"));
		//helloBye(Path.of("test2/asubfolder/"));
		Map<String, String> env = new HashMap<>(); 
		Path path=Path.of("myfolder/zipfstest15948.zip");
		env.put("create", "true");

        URI uritemp=path.toUri();
        URI uri = URI.create("jar:"+uritemp.toString());
        
       try (FileSystem fs = FileSystems.newFileSystem(uri, env)) {
    	   Path path1 =fs.getPath(".");
    	   helloBye(path1);            
        } 
       
    }
	}

