import java.io.*;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.prefs.Preferences;
import java.util.Hashtable;

import java.awt.*;

public class MorseCodeDecryption {

	public static final Hashtable<String, String> mc = new Hashtable<String, String>(36);

	static {

		mc.put("A", "._");
		mc.put("B", "_...");
		mc.put("C", "_._.");
		mc.put("D", "_..");
		mc.put("E", ".");
		mc.put("F", ".._.");
		mc.put("G", "__.");
		mc.put("H", "....");
		mc.put("I", "..");
		mc.put("J", ".___");
		mc.put("K", "_._");
		mc.put("L", "._..");
		mc.put("M", "__");
		mc.put("N", "_.");
		mc.put("O", "___");
		mc.put("P", ".__.");
		mc.put("Q", "__._");
		mc.put("R", "._.");
		mc.put("S", "...");
		mc.put("T", "_");
		mc.put("U", ".._");
		mc.put("V", "..._");
		mc.put("W", ".__");
		mc.put("X", "_.._");
		mc.put("Y", "_.__");
		mc.put("Z", "__..");
		mc.put("1", ".____");
		mc.put("2", "..___");
		mc.put("3", "...__");
		mc.put("4", "...._");
		mc.put("5", ".....");
		mc.put("6", "_....");
		mc.put("7", "__...");
		mc.put("8", "___..");
		mc.put("9", "____.");
		mc.put("0", "_____");	
	}

	String morse_code = "", decoded = "";
	int n;

	public void code_generate() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the morse code received: ");
		morse_code = sc.nextLine();
	}

	public void code_decode() {

		String morse_code_words[] = morse_code.split(" ");
		int i;
		String ncode;
		for (i=0; i<n; i++) {

			ncode = morse_code_words[i];
			if (mc.containsValue(ncode) == true) {

				Object key = null;
				String value = ncode;
				for (Map.Entry entry:mc.entrySet()) {

					if (value.equals(entry.getValue())) {

						key = entry.getKey();
						key = key.toString();
						decoded = decoded + key;
						break;
					}
				}
			} else {

				decoded = decoded + "  ";
			}
		}
	}

	public void disp() {

		System.out.println("Decoded string: " + decoded);
	}

	public static void main(String[] args) {

		MorseCodeDecryption mcd = new MorseCodeDecryption();
		mcd.code_generate();
		mcd.code_decode();
		mcd.disp();
	}
}
