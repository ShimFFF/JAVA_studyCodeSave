package Ex10_1d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//알파벳을 일정거리 만큼 오른쪽으로 이동
class SubstitutionCipher implements MessageEncoder {
	int shift;
	
	public SubstitutionCipher(int s) {shift=s;}
	
	public String encode(String plainText) {
		StringBuilder encoded = new StringBuilder();
		for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) (((c - base + shift) % 26) + base);
            }
            encoded.append(c);
        }
        return encoded.toString();
    }
	
} 


class ShuffleCipher implements MessageEncoder {
	int n;
	public ShuffleCipher(int a) {n=a;}
	
	@Override
    public String encode(String plainText) {
        char[] chars = plainText.toCharArray();
        int length = chars.length;

        // 셔플할 인덱스 생성
        int[] indices = new int[length];
        for (int i = 0; i < length; i++) {
            indices[i] = i;
        }

        // n번 셔플
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < length; j += 2) {
                if (j + 1 >= length) {
                    break;
                }
                int temp = indices[j];
                indices[j] = indices[j + 1];
                indices[j + 1] = temp;
            }
        }

        // 인덱스에 따라 문자열 생성
        char[] encodedChars = new char[length];
        for (int i = 0; i < length; i++) {
            encodedChars[indices[i]] = chars[i];
        }

        return new String(encodedChars);
    }
	
	    
}


public class Ex10_1d {
	public static void main(String[] args) {
	    MessageEncoder substitution1 = new SubstitutionCipher(1);
	    MessageEncoder substitution2 = new SubstitutionCipher(5);

	    String plainText = "abcdefghi";
	    System.out.println("Original: " + plainText);
	    System.out.println("Substitution (1) : " + substitution1.encode(plainText));
	    System.out.println("Substitution (5) : " + substitution2.encode(plainText));

	    MessageEncoder shuffle1 = new ShuffleCipher(1);
	    MessageEncoder shuffle2 = new ShuffleCipher(2);

	    System.out.println("Shuffle (1): " + shuffle1.encode(plainText));
	    System.out.println("Shuffle (2): " + shuffle2.encode(plainText));
	}


}
