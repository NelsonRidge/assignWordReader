package assign;

public class WordReader {
    //Privata instansvariabler
    private int characterCount;             //Sparar antal tecken
    private int lineCount;                  //Sparar antal rader
    private String input;                   //Sparar antal de aktuella orden

    //Konstruktor som initierar instansvariablerna
    public WordReader() {
        characterCount = 0;                 //Initierar variabelns startvärde till 0
        lineCount = 0;                      //Initierar variabelns startvärde till 0
        input = "";                         //Initierar en tom sträng
    }
    //Metod för att sätta värdet på "input"
    public void setInput(String input) {
        this.input = input;                 //Uppdaterar "input" med orden användaren anger
    }
    public void countChars() {

        characterCount += input.length();   //Ökar värdet på "characterCount" med antal tecken som användaren anger
    }
    //Metod för att uppdatera antalet rader
    public void countLines() {

        lineCount ++;                       //Ökar värdet på "lineCount" med 1 för varje ny rad
    }
    //Metod för att returnera antalet tecken
    public int getCharacterCount() {        //Hämtar det uppdaterade värdet på "characterCount"
        return characterCount;              //Returnerar det uppdaterade värdet när metoden kallas på
    }
    //Metod för att returnera antal rader
    public int getLineCount() {             //Hämtar det uppdaterade värdet på "lineCount"
        return lineCount;                   //Returnerar det uppdaterade värdet när metoden kallas på
    }
}
