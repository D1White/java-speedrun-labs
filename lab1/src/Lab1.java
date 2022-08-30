// Task 5
import java.util.ArrayList;
import java.util.HashSet;

public class Lab1 {
	public static String getResult(String str) {
		ArrayList<String> result = new ArrayList<String>();
		
		str = str.replaceAll("[^a-zA-Z0-9]"," ");
		str = str.replaceAll("\\s{2,}"," ");
		String[] words = str.split(" ");	
		
		for (String word : words) {
            HashSet<String> letters = new HashSet<String>();
            Boolean hasDuplicate = false;
            
            String[] allLetters = word.split("");
            
            for (String letter : allLetters) {
            	String lowerLetter = letter.toLowerCase();
            	
            	if (letters.contains(lowerLetter)) {
            		hasDuplicate = true;
            		break;
            	} else {
            		letters.add(lowerLetter);
            	}
            }
            
            if (hasDuplicate == false) {
            	result.add(word);
            }
        }
		
		return String.join(" ", result);
	}
	
	
	public static void main(String[] args) {
		String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		
		String result = getResult(str);
		
		System.out.println(result);
	}
}
