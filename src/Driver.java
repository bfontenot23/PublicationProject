import java.util.ArrayList;
import java.util.Collections;

public class Driver {

    public static void main(String[] args)
    {
        ArrayList<Publication> pubs = new ArrayList<>();
        pubs.add(new Book("John Carreyrou", "Bad Blood: Secrets and Lies in a Silicon Valley Startup",
                Publication.Genre.THRILLER, 1, 2018));
        pubs.add(new Book("Andriy Burkov", "The Hundred-Page Machine Learning Book", Publication.Genre.SCIENCE, 1,
                2019));
        pubs.add(new Magazine("Meredith Corporation", "Sports Illustrated", Publication.Genre.ATHLETIC, 633, 2020));
        pubs.add(new Magazine("Meredith Corporation", "People", Publication.Genre.ENTERTAINMENT, 466, 2020));
        Collections.sort(pubs);
        for(Publication p : pubs)
            p.printInfo();
    }
}
