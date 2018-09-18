import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebScraper {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static int wordCount(String texts) {
        String[] splitText = texts.trim().split("\\s+");
        return splitText.length;
    }

    public static int wordAppears(String keyword, String texts) {
        int wordCount = 0;
        String[] splitText = texts.trim().split("\\s+");
        for (String word : splitText) {
            if (word.toLowerCase().equals(keyword.toLowerCase())) {
                wordCount++;
            }
        }
        return wordCount;
    }

    public static void main(String[] unused){
    }
}
