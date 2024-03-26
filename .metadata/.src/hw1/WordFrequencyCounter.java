package ceng112;
//MAİN
public class WordFrequencyCounter {
	public static void main(String[] args){
		Text<Word> text = new Text<>();
		Dictionary<Word> dictionary = new Dictionary<>();
		RareWordsDictionary<Word> rareWordsDictionary = new RareWordsDictionary<>();
		FrequentWordsDictionary<Word> frequentWordsDictionary = new FrequentWordsDictionary<>();
		MostFrequentWordsDictionary<Word> mostFrequentWordsDictionary = new MostFrequentWordsDictionary<>();
		
		
		// read file and transfer words to text and dictionary
		FileIO.readFile(text, dictionary);
		
		//separate words into dictionaries
		text.separate(dictionary, rareWordsDictionary, frequentWordsDictionary, mostFrequentWordsDictionary);
		
		//output 
		
		System.out.println("Text: " + text.getCurrentSize() + " words");
		System.out.println("Rare Words Dictionary: " + rareWordsDictionary.getCurrentSize() + " words");
		rareWordsDictionary.displayItems();
		System.out.println("Frequent Words Dictionary: " + frequentWordsDictionary.getCurrentSize() + " words");
		frequentWordsDictionary.displayItems();
		System.out.println("Most Frequent Words Dictionary: " + mostFrequentWordsDictionary.getCurrentSize() + " words");
		mostFrequentWordsDictionary.displayItems();
		
			
	    
	}

 }
