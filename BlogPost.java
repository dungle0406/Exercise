//Create a BlogPost class that has
//        an authorName
//        a title
//        a text
//        a publicationDate
//        Create a few blog post objects:
//        "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
////        Lorem ipsum dolor sit amet.
//        "Wait but why" titled by Tim Urban posted at "2010.10.10."
//        A popular long-form, stick-figure-illustrated blog about almost everything.
//        "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//        Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.
public class BlogPost {
    private String authorName;
    private String title;
    private String text;
    private String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public static void main(String[] args) {
        BlogPost blogPost1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet", "2000.05.04.");
        BlogPost blogPost2 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything", "2010.10.10.");
        BlogPost blogPost3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing", "2017.03.28.");

        System.out.println("Blog Post 1: ");
        System.out.println("An author name: " + blogPost1.authorName);
        System.out.println("A title: " + blogPost1.title);
        System.out.println("A text: " + blogPost1.text);
        System.out.println("A publication date: " + blogPost1.publicationDate);

        System.out.println("\nBlog Post 2: ");
        System.out.println("An author name: " + blogPost2.authorName);
        System.out.println("A title: " + blogPost2.title);
        System.out.println("A text: " + blogPost2.text);
        System.out.println("A publication date: " + blogPost2.publicationDate);

        System.out.println("\nBlog Post 3: ");
        System.out.println("An author name: " + blogPost3.authorName);
        System.out.println("A title: " + blogPost3.title);
        System.out.println("A text: " + blogPost3.text);
        System.out.println("A publication date: " + blogPost3.publicationDate);
    }
}
