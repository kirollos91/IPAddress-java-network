import java.util.Scanner;
import java.net.InetAddress;

public class FindIPAddress {
    public static void main(String[]args)
    {


        String host ;
        Scanner input = new Scanner(System.in);
        System.out.print("\n\n enter host name: ");
        host = input.next();
        try
        {
            InetAddress address  = InetAddress.getByName(host);
            System.out.println("IP address: " + address.toString());
        }
        catch(Exception ex)
        {
            System.out.println("Could not find: " + host);
        }
        input.close();


    }
}
