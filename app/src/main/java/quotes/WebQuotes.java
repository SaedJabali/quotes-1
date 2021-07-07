package quotes;

public class WebQuotes {
  public String qotd_date;
  public Object quote ;



  public Object getQuote() {
    return quote;
  }
  @Override
  public String toString() {
    return "webQuotes{" +
      "qotd_date='" + qotd_date + '\'' +
      ", quote=" + quote +
      '}';
  }


}
