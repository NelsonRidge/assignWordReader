package assignment;

public class WordReader {
    //Privata instansvariabler
    private int characterCount;           //Sparar antal tecken
    private int lineCount;                //Sparar antal rader
    private String input;                 //Sparar de aktuella orden

    //Konstruktor som initierar instansvariablerna
    public WordReader() {
        characterCount = 0;               //Initierar variabelns startvärde till 0
        lineCount = 0;                    //Initierar variabelns startvärde till 0
        input = "";                       //Initierar en tom sträng
    }
    //Metod för att sätta värdet på "input"
    public void setInput(String input) {

        this.input = input;                //Uppdaterar "input" med orden som användaren angett
    }

    //Metod för att uppdatera antal tecken
    public void countChars() {

        characterCount += input.length();  //Ökar characterCount med antal tecken som användaren anger

    }
    //Metod för att uppdatera antalet rader
    public void countLines() {

        lineCount++;                       //Ökar antal rader med 1 för varje ny rad

    }
    //Metod för att returnera antalet tecken
    public int getCharacterCount() {       //Hämtar det uppdaterade värdet på characterCount

        return characterCount;             //Returnerar/skickar det uppdaterade värdet när
                                           //metoden "kallas på"
    }
    //Metod för att returnera antalet rader
    public int getLineCount() {            //Hämtar det uppdaterade värdet på characterCount

        return lineCount;                  //Returnerar/skickar det uppdaterade värdet när
                                           //metoden "kallas på"
    }
}




