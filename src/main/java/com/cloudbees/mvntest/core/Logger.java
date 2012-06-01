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
        assert com.cloudbees.mvntest.util.Math.add(1,2).equals(3);
        System.out.println( msg + "hello" );
    }
}
