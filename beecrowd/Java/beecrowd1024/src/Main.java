import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
 
        int count = sc.nextInt();
        
        sc.nextLine();
                
        String[] list = new String[count];
        
        for (int i = 0; i < count; i++) {
        	
        	String input = sc.nextLine();
            StringBuilder output = new StringBuilder();
            
        	for (int j = 0; j < input.length(); j++) {
        		char c0 = input.charAt(j);
        		if ((c0 >= 'a' && c0 <= 'z') || (c0 >= 'A' && c0 <= 'Z')) {
        			output.append((char) (c0 + 3));
        		} else {
        			output.append(input.charAt(j));
        		}
        	}
        	        	
        	output.reverse();
        	
        	for (int k = input.length() / 2; k < input.length(); k++) {
        		char c1 = output.charAt(k);
        		output.setCharAt(k, (char) (c1 - 1));
        	}
        	list[i] = output.toString();
        }
        
        for (String obj : list) {
        	System.out.println(obj);
        }
                
        sc.close();
    }
 
}