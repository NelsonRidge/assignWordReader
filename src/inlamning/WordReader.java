package inlamning;

public class WordReader {

    //Privata instansvariabler
    private int characterCount;  //Sparar antal tecken
    private int lineCount;       //Sparar antal rader
    private String word;         //Sparar den aktuella texten

    //Konstruktor som initierar instansvariablerna till 0
    public WordReader() {
        characterCount = 0; //Initierar variabelns startvärde till 0
        lineCount = 0;      //Initierar variabelns startvärde till 0
        word = "";          //Initierar en tom sträng
    }
    //Metod för att sätta värdet på "word"
    public void setWord(String newWord) {

        word = newWord; //Uppdaterar "word" med ordet som användaren angett
    }

    //Metod för att uppdatera antal tecken
    public void countChars() {

        characterCount += word.trim().length(); //Ökar characterCount med antal tecken som användaren anger

    }

    public void countLines() {

        lineCount++;    //Ökar antal rader med 1 för varje rad

    }
    //Metod för att returnera antalet tecken
    public int getCharacterCount() { //Hämtar det uppdaterade värdet på characterCount

        return characterCount;      //Returnerar/skickar det uppdaterade värdet när
                                    // metoden "kallas på"
    }
    //Metod för att returnera antalet rader
    public int getLineCount() {     //Hämtar det uppdaterade värdet på characterCount

        return lineCount;           //Returnerar/skickar det uppdaterade värdet när
                                    // metoden "kallas på"
    }
}
