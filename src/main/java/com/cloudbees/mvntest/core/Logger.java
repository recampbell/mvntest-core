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
        assert com.cloudbees.mvntest.util.Math.subtract(2,1).equals(1);
        System.out.println( msg + "hello" );
    }
}
