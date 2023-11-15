package inlamning;

import java.util.Scanner;

public class MainWordReader {
        public static void main(String[] args) {
        //Skapar ett Scanner-objekt för att användaren ska kunna skriva in text
        Scanner scan = new Scanner(System.in);

        //Skapar ett WordReader-objekt för att bearbeta text
        WordReader wordReader = new WordReader();

        //Skriver ut en instruktion till användaren
        System.out.println("Skriv ett valfritt antal ord. OBS! Endast ett ord per rad! Skriv ordet \"stop\" för att avsluta: ");


        //En loop som körs tills användaren skriver ordet "stop"
        while (true) {
            //Variabeln deklareras utan värde
            String inputWord;

            //Läser raden användaren skriver
            inputWord = scan.nextLine();

            //Bryter loopen om användaren skriver "stop"
            if (inputWord.equalsIgnoreCase("stop")) {
                break;
            }

            //Skickar ordet som användaren skrivit till wordReader
            wordReader.setWord(inputWord);  //Ordet som angetts skickas till setWord
            wordReader.countChars();        //Uppdaterar teckenräkningen
            wordReader.countLines();        //Uppdaterar radräkningen

        }

        //Skriver ut resultatet till användaren
        System.out.println("Du har skrivit " + wordReader.getCharacterCount() + " tecken på " + wordReader.getLineCount() + " rader.");
    }
}
