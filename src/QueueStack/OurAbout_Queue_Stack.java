package QueueStack;

import java.util.*;


public class OurAbout_Queue_Stack
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner( System.in );
        OurCollection tmp = new OurQueue();
        System.out.println(tmp.getClass());
        String command = in.next();
        while ( !command.equalsIgnoreCase( "exit" ) )
        {
            switch ( command.toUpperCase() )
            {
                case "PUSH":
                {
                    try
                    {
                        tmp.push( in.nextInt() );
                    }
                    catch ( Throwable error )
                    {
                        System.out.println( "ERROR: Not number!" );
                    }
                    break;
                }
                case "POP":
                {
                    tmp.pop();
                    break;
                }
                case "BACK":
                {
                    tmp.back();
                    break;
                }
                case "SIZE":
                {
                    tmp.size();
                    break;
                }
                case "CLEAR":
                {
                    tmp.clear();
                    break;
                }
                default:
                {
                    System.out.println( "ERROR: Unknown command!" );
                }
            }
            command = in.next();
        }
        System.out.println( "Buy!" );
    }
}