package  com.cloudbees.mvntest.core;

/**
 * Core logger class.
 *
 */
public class Logger 
{
    private Object unused;
    public static void log(String msg)
    {
        System.out.println( msg );
    }
}
