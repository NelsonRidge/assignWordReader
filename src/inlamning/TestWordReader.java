package inlamning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWordReader {

    @Test
    public void testCharacterCount() {               //Testar att antalet tecken räknas korrekt
        //Arrange
        WordReader myWordReader = new WordReader();  //Skapar ett WordReader-objekt
        myWordReader.setWord("Programmering");       //Sätter ordet som ska bearbetas
        int expected = 13;                           //Förväntat antal tecken som tilldelas variabeln "expected"

        //Act
        myWordReader.countChars();                     //Går igenom ordet och uppdaterar räknare
        int actual = myWordReader.getCharacterCount(); //Hämtar det faktiska antalet tecken som tilldelas variabeln "actual"

        //Assert
        assertEquals(expected,actual);                 //Jämför förväntat och faktiskt antal tecken

    }

    @Test
     public void testLineCount() {                  //Testar att antalet rader räknas korrekt
        //Arrange
        WordReader myWordReader = new WordReader(); //Skapar ett WordReader-objekt
        int expected = 3;                           //Förväntat antal rader som tilldelas variabeln "expected"

        //Act
        myWordReader.setWord("Programmering");     //Sätter första ordet
        myWordReader.countLines();                 //Går igenom ordet och uppdaterar räknare
        myWordReader.setWord("är");                //Sätter andra ordet
        myWordReader.countLines();                 //Går igenom ordet och uppdaterar räknare
        myWordReader.setWord("svårt!");            //Sätter tredje ordet
        myWordReader.countLines();                 //Går igenom ordet och uppdaterar räknare
        int actual = myWordReader.getLineCount();  //Hämtar faktiskt antal rader

        //Assert
        assertEquals(expected,actual);             //Jämför förväntat och faktiskt antal rader

    }
    @Test
    public void testBlankLineCount() {              //Testar att antalet rader räknas korrekt, även om man lämnar en tom rad
        //Arrange
        WordReader myWordReader = new WordReader(); //Skapar ett WordReader-objekt
        int expected = 3;                           //Förväntat antal rader som tilldelas variabeln "expected"

        //Act
        myWordReader.setWord("Programmering");      //Sätter första ordet
        myWordReader.countLines();                  //Går igenom ordet och uppdaterar räknare
        myWordReader.setWord("");                   //Sätter en "tom" sträng som andra ord
        myWordReader.countLines();                  //Går igenom den tomma strängen och uppdaterar räknare
        myWordReader.setWord("svårt!");             //Sätter tredje ordet
        myWordReader.countLines();                  //Går igenom ordet och uppdaterar räknare
        int actual = myWordReader.getLineCount();   //Hämtar faktiskt antal rader


        //Assert
        assertEquals(expected,actual);              //Jämför förväntat och faktiskt antal rader
    }
    @Test
    public void testGetCharacterCount() {           //Testar att konstruktorn initialiseras korrekt
        //Arrange
        WordReader myWordReader = new WordReader(); //Skapar ett WordReader-objekt
        int expected = 0;                           //Förväntat startvärde som tilldelas expected

        //Act
        int actual = myWordReader.getCharacterCount(); //Hämtar det faktiska startvärdet

        //Assert
        assertEquals(expected,actual);                 //Jämför förväntat och faktiskt startvärde
    }

}
