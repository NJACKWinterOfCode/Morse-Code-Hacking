import java.util.Scanner;

public class Encrypt{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter received text.");
		String text = in.nextLine();
		System.out.print("Encoded String: ");

		System.out.println(Morse(text));
	}

	
	public static String Morse(String text)
	{
    	String s = text;
        String message = "";

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] morseAlphabet = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",  
        "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", 
        "...-", ".--", "-..-", "-.--", "--.."};

        for (char alphabetLetter : text.toCharArray())
        {
           int index = -1;
           String letter = " ";
           for (int i = 0; i < alphabet.length(); i++)
           {
           		if (alphabet.charAt(i) == alphabetLetter)
                {
                    index = i;
                }
            }
            if (index >=0)
            {
                letter = morseAlphabet[index];
            }
            message += letter + " ";
        }

    	return message;
	}

}