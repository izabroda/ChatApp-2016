

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Caller {
    private String loc_name;
    private String ip;
    private String rem_name; //����� ��� �����??
    private Object obj; //����� ������ ���� ���� � �������


    public Caller(String loc_n, String ip) {
        loc_name = loc_n;
        this.ip = ip;
    }

    public Connection call() throws IOException {
        Socket s = null;
        try {
            s = new Socket(ip, Protocole.getPort());
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Connection c = new Connection(s);
        c.sendnNickHello(loc_name);
        return c;
    }
}