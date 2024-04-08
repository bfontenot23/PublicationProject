public class Magazine extends Publication{

    private String publisher;

    public Magazine(String publisher, String title, Genre genre, int edition, int year)
    {
        super(title,genre,edition,year);
        this.publisher=publisher;
    }

    @Override
    public void printInfo()
    {
        System.out.printf("%s. Edition (%d) published in %d\n%s magazine by %s.\n",this.getTitle(),this.getEdition(),this.getYear(),this.getGenre(),publisher);
        printFooter();
    }

    public String getPublisher()
    {
        return publisher;
    }
}
