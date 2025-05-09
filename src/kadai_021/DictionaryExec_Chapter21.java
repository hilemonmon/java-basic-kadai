package kadai_021;

import java.util.ArrayList;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("apple");
		words.add("banana");
		words.add("grape");
		words.add("orange");
		
		Dictionary_Chapter21 dict = new Dictionary_Chapter21();
		
		for(int i = 0; i < words.size(); i++) {
	         dict.wordSearch(words.get(i));
	      }		
	}
}
