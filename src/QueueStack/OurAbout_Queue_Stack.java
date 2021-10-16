package QueueStack;

import java.util.*;

public class OurAbout_Queue_Stack {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );
        OurCollection tmp = new OurQueue();
        System.out.println( tmp.getClass() );
        String command = in.next();
        while ( !command.equalsIgnoreCase( "exit" ) ) {
            switch ( command.toUpperCase() ) {
                case "PUSH" -> {

                }
                case "POP" -> tmp.pop();
                case "BACK" -> tmp.back();
                case "SIZE" -> tmp.size();
                case "CLEAR" -> tmp.clear();
                default -> System.out.println( "ERROR: Unknown command!" );
            }
            command = in.next();
        }

        System.out.println( "Buy!" );
    }
}