import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String utf8String = "llii";
        byte[] bytesInCp1251 = utf8String.getBytes("cp1251");
        System.out.println(bytesInCp1251.toString());
    }
}