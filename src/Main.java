public class Main {

    public static void main(String[] args) {
        String texts = WebScraper.urlToString("http://erdani.com/tdpl/hamlet.txt");
        System.out.println(texts);
        System.out.println(WebScraper.wordCount(texts));
        System.out.println(WebScraper.wordAppears("Prince", texts));
    }
}
