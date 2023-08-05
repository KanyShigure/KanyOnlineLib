import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * 主类，无作用.
 *
 * @author Kaminy
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://www.mcbbs.net/thread-691900-1-1.html").get();
        System.out.println(document);
    }
}
