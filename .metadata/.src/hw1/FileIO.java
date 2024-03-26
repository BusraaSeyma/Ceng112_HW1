package ceng112;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
	public static void readFile(Text<Word> text, Dictionary<Word> dictionary) {
		String fileName = "text"; 

        try {
       
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println("SELAM");

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                	//remove punctuation
                	word = word.replaceAll("[^a-zA-Z]", "");
                	if (!word.isEmpty()) {
                		text.add(new Word(word));
                		dictionary.add(new Word(word));
                	}
                }
            }
            bufferedReader.close();
        } 
        catch (IOException e) {
            //System.err.println(e.getMessage());
            e.printStackTrace();
        }
	}
}
