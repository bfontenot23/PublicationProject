public class Publication implements Comparable<Publication>
{

    public enum Genre
    {
        SCIENCE,
        ROMANCE,
        COMIC,
        CLASSIC,
        ATHLETIC,
        BEAUTY,
        FASHION,
        ENTERTAINMENT,
        THRILLER;
    }

    private String title;
    private Genre genre;
    private int edition;
    private int year;

    public Publication(String title, Genre genre, int edition, int year)
    {
        this.title=title;
        this.genre=genre;
        this.edition=edition;
        this.year=year;
    }

    public void printInfo()
    {
        System.out.printf("%s. Edition (%d) published in %d\n",title,edition,year);
    }

    public void printFooter()
    {
        System.out.print("All rights reserved.\n--------------------\n");
    }

    @Override
    public int compareTo(Publication other)
    {
        if(this.genre.compareTo(other.getGenre())==0) return this.title.compareTo(other.getTitle());
        else return this.genre.compareTo(other.getGenre());
    }

    public String getTitle()
    {
        return title;
    }

    public Genre getGenre()
    {
        return genre;
    }

    public int getEdition()
    {
        return edition;
    }

    public int getYear()
    {
        return year;
    }
}
