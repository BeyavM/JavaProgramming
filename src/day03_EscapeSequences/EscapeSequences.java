package day03_EscapeSequences;

/* Escape Sequences: MUST be given with double quote

\n = newline: starts a new line
\t = Horizontal Tab: moves the text to the right, as if you pressed 'tab'
\\ = backslash: puts a single backslash ( \ )
\" = double quote: puts a double quote where you want ( " )
 */

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java \nPython \nc#");

        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.println("Hello Cydeo, \nhow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.println("Hello Cydeo, \thow are you all today? \tIt's nice to see you all! \tWhat class do we have next week?");

        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.println("Hello Cydeo, \\how are you all today? \\It's nice to see you all! \\What class do we have next week?");

        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.println("Hello Cydeo,\" \"how are you all today?\" \"It's nice to see you all!\" \"What class do we have next week?\"");

    }


}

