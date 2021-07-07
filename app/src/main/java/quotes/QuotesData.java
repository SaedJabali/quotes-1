package quotes;

public class QuotesData extends WebQuotes {
    public String body;

    public QuotesData(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "quotesData{" +
                "body='" + body + '\'' +
                '}';
    }
}
