package assign;

import java.util.Scanner;

public class MainWordReader {
    public static void main(String[] args) {
        //Skapar ett Scanner-objekt för att användaren ska kunna skriva in text
        Scanner scan = new Scanner(System.in);

        //Skapar ett WordReader-objekt för att bearbeta text
        WordReader wordReader = new WordReader();

        //Skriver ut en instruktion till användaren
        System.out.println("Skriv valfritt antal ord på valfritt antal rader. Skriv ordet \"stop\" för att avsluta.");

        //En loop som körs tills användaren skriver ordet "stop"
        while (true) {

            String input;               //Variabeln deklareras utan värde
            input = scan.nextLine();    //Variabeln får värdet användaren matar in

            // Kontrollerar om raden innehåller ordet "stop"
            if (input.toLowerCase().contains("stop")) {
                break;
            }

            wordReader.setInput(input);     //Texten (strängen) som angetss skickas till setInput
            wordReader.countChars(); //Hämtar uppdaterat värde på "characterCount"
            wordReader.countLines();      //Hämtar uppdaterat värde på "lineCount"

        }

        //Skriver ut resultatet till användaren
        System.out.println("Du har skrivit " + wordReader.getCharacterCount() + " tecken på " + wordReader.getLineCount() + "rader.");
    }
}
