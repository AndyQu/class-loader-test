// $Id$

public class FirstLoadedClass
{
    static public void main( String args[] ) throws Exception {
        System.out.println( "<<<<< foo! "+args[0]+" "+args[1] );
        new SecondLoadedClass( args[0], args[1] );
    }
}
