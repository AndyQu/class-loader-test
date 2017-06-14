// $Id$

import baz.*;

public class SecondLoadedClass
{
    public SecondLoadedClass(String a, String b ) {
        System.out.println( "<<<<<bar! "+a+" "+b );
        new ThirdLoadedClass( a, b );

        try {
            Class booClass = Class.forName( "FourthLoadedClass" );
            Object boo = booClass.newInstance();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
