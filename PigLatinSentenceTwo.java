package com.PigLatin;

import java.util.Scanner;

public class PigLatinSentenceTwo {

	public static void main(String[] args) {
				
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word to be translated to Pig Latin:");
		String userText = kb.nextLine();  //Pull text entered by user into the main
				
		int textlength = userText.length();  //Index each letter of userText
		
		for (int i = 0; i < textlength; i++) { 
			char ch = Character.toLowerCase(userText.charAt(i)); //Convert userText to all lower case
			int index = 0;			
			int endIndex = userText.indexOf(' ');
			int nextIndex = endIndex + 1;
			int endSIndex = userText.indexOf(' ', ' ');
			
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { //Parse userText for vowels
				
				index = userText.indexOf(ch); //Assign first vowel index number to index
				
			String beforeVowel = userText.substring(0, index); //Create new string containing letters before index
			String afterVowel = userText.substring(index, endIndex); //Create new string containing letters after and including index
			System.out.println(afterVowel + beforeVowel + "ay"); //Print both before index and after index strings in correct pig latin order and add "ay"
			break;
			
			}
			
			
			
		}
	}
}
