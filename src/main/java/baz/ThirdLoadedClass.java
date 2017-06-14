// $Id$

package baz;

import java.util.HashSet;
import java.util.Set;

public class ThirdLoadedClass
{
    public ThirdLoadedClass(String a, String b ) {
        System.out.println( "<<<<<baz! "+a+" "+b );
        run();
    }

    public void run(){
        System.out.println( "<<<<<baz! run");
        Set<Integer> lst=new HashSet<>();
        lst.add(1);
        lst.add(2);
        lst.forEach(it->System.out.println(it));
    }
}
