
public class RunLengthEncoding {
public static void main(String[] args) {
String str = "aaabbccddd";
String encoded = "";
int count = 1;
for (int i = 0; i < str.length() - 1; i++) {
if (str.charAt(i) == str.charAt(i + 1)) {
count++;
} else {
encoded += str.charAt(i) + String.valueOf(count);
count = 1; 
}
}
encoded += str.charAt(str.length() - 1) + String.valueOf(count);
System.out.println("Original String: " + str);
System.out.println("Run-Length Encoded: " + encoded);
}
}