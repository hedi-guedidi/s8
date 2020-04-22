package io.github.hedi_guedidi.s8and9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class concordance {

	public static void main(String[] args) throws IOException {
		LinkedHashMap<String,LinkedHashSet<Integer>> res = new LinkedHashMap<>();
		final Path infile = Path.of("concord.txt");
		Charset charset = Charset.forName("UTF-8");
		String in;
		try(BufferedReader rd= Files.newBufferedReader(infile,charset)){
			Integer i=1;
			LinkedHashSet<Integer> temp1;
			while ((in=rd.readLine()) != null){
				String [] temp=in.split(" ");
				for(String item:temp) {
					if(!res.containsKey(item)) {
						temp1 =new LinkedHashSet<>();
						temp1.add(i);
						res.put(item, temp1);
					}
					else {
						 res.get(item).add(i);
					}
				}
				i++;
			}
			System.out.println(res);
		}
		final Path infile1 = Path.of("output.txt");
		if(Files.exists(infile1)) {
			Files.delete(infile1);
		}
		Files.createFile(infile1);
		try (BufferedWriter writer = Files.newBufferedWriter(infile1)) {
			
			for(String key : res.keySet()) {
				writer.append(key+" "+ res.get(key).toString());
				writer.newLine();
			}
		}
		

	}

}
