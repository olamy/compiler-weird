package io.olamy.foo;

import javax.annotation.PostConstruct;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    @PostConstruct
    public void setup() {

    }
}
