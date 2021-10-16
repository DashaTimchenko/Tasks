package QueueStack;

import java.util.LinkedList;
import java.util.List;

public class OurQueue extends OurStack
{

@Override
    public void pop()
    {
        if ( length > 0 )
        {
            length--;
            System.out.println( q.get( 0 ) );
            q.remove( 0 );
        }
        else
            System.out.println( "we are empty!" );

    }
    @Override
    public void back()
    {
        System.out.println( q.get( 0 ) );
    }

}
