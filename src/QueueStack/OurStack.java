package QueueStack;

import java.util.LinkedList;
import java.util.List;

public class OurStack implements OurCollection
{


   public static void mine()
    {
        System.out.println( "I'm Stack" );
    }
    
    protected List <Integer> q = new LinkedList <>();
    
    protected int length = 0;
    
    public void push( int el )
    {
        q.add( el );
        length++;
        System.out.printf( "%s\n" , "OK" );
    }
    
    public void size()
    {
        System.out.printf( "size = %s\n" , length );
    }
    
    public void pop()
    {
        if ( length > 0 )
        {
            length--;
            System.out.println( q.get( length ) );
            q.remove( length );
        }
        else
            System.out.println( "we are empty!" );


    }
    
    
    public void back()
    {
        System.out.println( q.get( length - 1 ) );
    }
    
    public void clear()
    {
        length = 0;
        q = new LinkedList <>();
        System.out.println( "ok" );
    }
}
