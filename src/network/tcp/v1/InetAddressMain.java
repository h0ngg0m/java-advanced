package network.tcp.v1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress localhost = InetAddress.getByName("localhost");
        System.out.println("localhost: " + localhost);

        InetAddress google = InetAddress.getByName("google.com");
        System.out.println("google.com: " + google);
    }
    /*
    자바의 InetAddress 클래스를 사용하면 호스트 이름으로 대상 IP 주소를 얻을 수 있다.
    찾는 과정:
    1. 자바는 InetAddress 클래스의 getByName 메서드를 사용해서 해당하는 IP 주소를 조회한다.
    2. 이 과정에서 시스템의 호스트 파일을 먼저 확인한다. /etc/hosts (리눅스, mac)
    3. 호스트 파일에 정의되어 있지 않다면, DNS 서버에 요청해서 IP 주소를 얻는다.
     */
}
