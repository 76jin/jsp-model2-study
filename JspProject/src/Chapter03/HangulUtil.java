package Chapter03;

public class HangulUtil {
    public static String toKor(String eng) {
        try {
            return new String(eng.getBytes("8859_1"), "euc-kr");
        } catch (Exception e) {
            return null;
        }
    }
}
