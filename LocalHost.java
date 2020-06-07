import java.net.InetAddress;

public class LocalHost
{
    public static void main(String []args)
    {
        try
        {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
        }
        catch(Exception ex)
        {
            System.out.println("Could not find local address!");
        }
    }

}
