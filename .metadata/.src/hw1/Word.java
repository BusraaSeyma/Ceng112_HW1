package ceng112;

public class Word {
	private String content;
	private int length;
	
	public Word(String content) {
		this.content = content;
		this.length = content.length();
	}
	public String toString() {
		return content;
		
	}
	public boolean equals(Object obj) {
		//***
		if(this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
			//***
		}
		Word other =(Word) obj;
		return content.equals(other.content);
	}
}
