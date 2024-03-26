package ceng112;

public class Text<T extends Word> extends Bag<T>{
	public void separate(Dictionary<T> dictionary, 
			RareWordsDictionary<T> rareWordsDictionary, 
			FrequentWordsDictionary<T> frequentWordsDictionary, 
			MostFrequentWordsDictionary<T> mostFrequentWordsDictionary) {
		for (int i = 0; i < getCurrentSize(); i++) {
			T word = removeByIndex(i);
			dictionary.add(word);
			int frequency = dictionary.getFrequencyOf(word);
			if (frequency < 5) {
				rareWordsDictionary.add(word);
			}
			else if (frequency >= 5 && frequency <= 8) {
				frequentWordsDictionary.add(word);
			}
			else {
				mostFrequentWordsDictionary.add(word);
			}
		}
	}
}
