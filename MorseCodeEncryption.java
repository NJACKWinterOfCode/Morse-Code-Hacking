import java.io.*;
import java.util.*;
import java.lang.*;
 public class Main{
  public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter text: ");
    String address=sc.next();
    int length=address.length();
    
    String n[]={"._","_...","_._.","_..",".",".._.","__.","....","..",".___","_._","._..","__","_.","___",".__.","__._","._.","...","_",".._","..._",".__","_.._","_.__","__..","_____",".____", "..___","...__","...._",".....","_....","__...","___..","____."};
    char b[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
    String encoded="";
    for(int i=0;i<length;i++)
    {
        for(int j=0;j<36;j++)
        {
            char z=address.charAt(i);
            if(z==b[j])
        {
            encoded =encoded+n[j];
            
        }
            
        }
    }
    
    System.out.println("Encoded String: " + encoded);
    

}}
