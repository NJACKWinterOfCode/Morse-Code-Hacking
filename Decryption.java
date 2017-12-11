
import java.util.Scanner;

public class Decryption {
    public static void main ( String [] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "Please enter the Morse code received: " );
        String code = input.nextLine();
        System.out.println( convert(code));
    }

    public static String decode (String toEncode) {
        String morse = toEncode;

        if (toEncode.equalsIgnoreCase("._"))
            morse = "a";
        if (toEncode.equalsIgnoreCase("_..."))
            morse = "b";
        if (toEncode.equalsIgnoreCase("_._."))
            morse = "c";
        if (toEncode.equalsIgnoreCase("_.."))
            morse = "d";
        if (toEncode.equalsIgnoreCase("."))
            morse = "e";
        if (toEncode.equalsIgnoreCase(".._."))
            morse = "f";
        if (toEncode.equalsIgnoreCase("__."))
            morse = "g";
        if (toEncode.equalsIgnoreCase("...."))
            morse = "h";
        if (toEncode.equalsIgnoreCase(".."))
            morse = "i";
        if (toEncode.equalsIgnoreCase(".___"))
            morse = "j";
        if (toEncode.equalsIgnoreCase("_._"))
            morse = "k";
        if (toEncode.equalsIgnoreCase("._.."))
            morse = "l";
        if (toEncode.equalsIgnoreCase("__"))
            morse = "m";
        if (toEncode.equalsIgnoreCase("_."))
            morse = "n";
        if (toEncode.equalsIgnoreCase("___"))
            morse = "o";
        if (toEncode.equalsIgnoreCase(".__."))
            morse = "p";
        if (toEncode.equalsIgnoreCase("__._"))
            morse = "q";
        if (toEncode.equalsIgnoreCase("._."))
            morse = "r";
        if (toEncode.equalsIgnoreCase("..."))
            morse = "s";
        if (toEncode.equalsIgnoreCase("_"))
            morse = "t";
        if (toEncode.equalsIgnoreCase(".._"))
            morse = "u";
        if (toEncode.equalsIgnoreCase("..._"))
            morse = "v";
        if (toEncode.equalsIgnoreCase(".__"))
            morse = "w";
        if (toEncode.equalsIgnoreCase("_.._"))
            morse = "x";
        if (toEncode.equalsIgnoreCase("_.__"))
            morse = "y";
        if (toEncode.equalsIgnoreCase("__.."))
            morse = "z";
        if (toEncode.equalsIgnoreCase("_____"))
            morse = "0";
        if (toEncode.equalsIgnoreCase(".____"))
            morse = "1";
        if (toEncode.equalsIgnoreCase("..___"))
            morse = "2";
        if (toEncode.equalsIgnoreCase("...__"))
            morse = "3";
        if (toEncode.equalsIgnoreCase("...._"))
            morse = "4";
        if (toEncode.equalsIgnoreCase("....."))
            morse = "5";
        if (toEncode.equalsIgnoreCase("_...."))
            morse = "6";
        if (toEncode.equalsIgnoreCase("__..."))
            morse = "7";
        if (toEncode.equalsIgnoreCase("___.."))
            morse = "8";
        if (toEncode.equalsIgnoreCase("____."))
            morse = "9";
        if (toEncode.equalsIgnoreCase("|"))
            morse = "";

        return morse;
    }
  
    public static String convert( String text )
    {
        String eng = ""; 
        String selected,converted; 
        String[] morseChars = text.split(" ");
        for (int i = 0; i < morseChars.length; i++)
        {
           //Select the next Morse character
           selected = morseChars[i];
           boolean endsWithWordSeparator = selected.endsWith("|");
           if(endsWithWordSeparator) selected = selected.substring(0, selected.length() - 1);
           // Convert the string
           converted = decode(selected);

           eng = eng + converted;
           if (endsWithWordSeparator) 
           {
               eng = eng + " ";
           }
        }

       return eng;
    }
}
