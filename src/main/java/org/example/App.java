package org.example;

import lombok.Data;
import lombok.ToString;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String VERSION = "1.0";

    public static void main( String[] args )
    {
        final Name n = new Name();
        n.setFirstName("Kris");
        n.setLastName("Foster");
        System.out.println("Version " + VERSION);
        System.out.println( "Hello World!!!!!" );
        System.out.println(n.toString());
    }
}

@ToString
@Data class Name {
    private String firstName;
    private String lastName;
}




