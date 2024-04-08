public class Book extends Publication{

    private String author;

    public Book(String author, String title, Genre genre, int edition, int year)
    {
        super(title,genre,edition,year);
        this.author=author;
    }

    @Override
    public void printInfo()
    {
        System.out.printf("%s. Edition (%d) published in %d\n%s book by %s.\n",this.getTitle(),this.getEdition(),this.getYear(),this.getGenre(),author);
        printFooter();
    }

    public String getAuthor()
    {
        return author;
    }
}
