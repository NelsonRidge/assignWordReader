package assignment;

import java.util.Scanner;

public class MainWordReader {
    public static void main(String[] args) {
        //Skapar ett Scanner-objekt för att användaren ska kunna skriva in text
        Scanner scan = new Scanner(System.in);

        //Skapar ett WordReader-objekt för att bearbeta text
        WordReader wordReader = new WordReader();

        //Skriver ut en instruktion till användaren
        System.out.println("Skriv ett valfritt antal ord, på valfritt antal rader. Skriv ordet \"stop\" för att avsluta: ");


        //En loop som körs tills användaren skriver ordet "stop"
        while (true) {

            String input;               //Variabeln deklareras utan värde

            input = scan.nextLine();    //Läser raden användaren skriver


            // Kontrollerar om raden innehåller ordet "stop"
            if (input.toLowerCase().contains("stop")) {
                break;                  // Bryter loopen om "stop" finns på raden

            }

            //Skickar orden som användaren skrivit till wordReader
            wordReader.setWord(input);  //Texten(strängen) som angetts skickas till setWord
            wordReader.countChars();    //Uppdaterar teckenräkningen
            wordReader.countLines();    //Uppdaterar radräkningen

        }

        //Skriver ut resultatet till användaren
        System.out.println("Du har skrivit " + wordReader.getCharacterCount() + " tecken på " + wordReader.getLineCount() + " rader.");
    }
}

