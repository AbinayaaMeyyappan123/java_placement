import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class DuplicateCharacters {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();
str = str.toLowerCase();
Map<Character, Integer> charCount = new HashMap<>();
for (char c : str.toCharArray()) {
if (Character.isLetterOrDigit(c)) {
charCount.put(c, charCount.getOrDefault(c, 0) + 1);
}
}
System.out.println("Duplicate characters in the string:");
boolean hasDuplicate = false;
for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
if (entry.getValue() > 1) {
System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
hasDuplicate = true;
}
}
if (!hasDuplicate) {
System.out.println("No duplicate characters found.");
}
sc.close();
}
}