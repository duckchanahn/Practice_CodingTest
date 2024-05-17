
import java.net.InetAddress;

import java.net.UnknownHostException;

public class GettingIpAddress {

    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            String strIpAdress = inetAddress.getHostAddress();
           
            System. out .println("IP address: " + strIpAdress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}