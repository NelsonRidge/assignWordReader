package assign;

import assignm.WordReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWordReader {

    @Test
    public void testCharacterCount() {                  //Testar att antalet tecken räknas korrekt
        //Arrange
        WordReader wordReader = new WordReader();       //Skapar ett WordReader-objekt
        wordReader.setInput("Programmering är svårt!"); //Sätter strängen som ska räknas
        int expected = 23;                              //Förväntat antal tecken som tilldelas variabeln

        //Act
        wordReader.countChars();                        //Kallar på metoden som räknar antal tecken
        int actual = wordReader.getCharacterCount();    //Hämtar faktiskt antal tecken som tilldelas variabeln "actual"

        //Assert
        assertEquals(expected,actual);                  //Jämför förväntat & faktiskt antal tecken
    }

    @Test
    public void testLineCount() {
        //Arrange
        WordReader wordReader = new WordReader();       //Skapar ett WordReader-objekt
        int expected = 3;

        //Act
        wordReader.setInput("Programmering");           //Sätter första raden
        wordReader.countLines();                        //Kallar på metoden som räknar rader
        wordReader.setInput("är");                      //Sätter andra raden
        wordReader.countLines();
        wordReader.setInput("svårt!");                  //Sätter tredje raden
        wordReader.countLines();
        int actual = wordReader.getLineCount();         //Kallar på metoden som hämtar faktiskt
                                                        //antal rader och tilldelar värdet till "actual"
        //Assert
        assertEquals(expected,actual);                  //Jämför förväntat & faktiskt antal rader
    }

    @Test
    public void testBlankLineCount() {
        //Arrange
        WordReader wordReader = new WordReader();       //Skapar ett WordReader-objekt
        int expected = 3;

        //Act
        wordReader.setInput("Programmering");           //Sätter första raden
        wordReader.countLines();                        //Kallar på metoden som räknar rader
        wordReader.setInput("");                        //Sätter andra raden
        wordReader.countLines();
        wordReader.setInput("svårt!");                  //Sätter tredje raden
        wordReader.countLines();
        int actual = wordReader.getLineCount();         //Kallar på metoden som hämtar faktiskt
                                                        //antal rader och tilldelar värdet till "actual"
        //Assert
        assertEquals(expected,actual);                  //Jämför förväntat & faktiskt antal rader
    }

    @Test
    public void testGetCharacterCount() {               //Testar att konstruktorn initialiseras korrekt
        //Arrange
        WordReader wordReader = new WordReader();       //Skapar ett WordReader-objekt
        int expected = 0;                               //Förväntat startvärde för "CharacterCount"

        //Act
        int actual = wordReader.getCharacterCount();    //Kallar på metoden som hämtar startvärdet för "characterCount"

        //Assert
        assertEquals(expected,actual);                  //Jamför förväntat och faktiskt startvärde för "characterCount"


    }

}
