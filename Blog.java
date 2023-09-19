//Reuse your BlogPost class
//Create a Blog class which can:
//        store a list of BlogPosts
//        and has the following methods:
//        add(BlogPost) -> adds a BlogPost to the list
//        delete(int) -> deletes the BlogPost from the given index
//        update(int, BlogPost) -> replaces an item at the given index with a new BlogPost

import java.util.ArrayList;
import java.util.List;

public class Blog {
    private List<BlogPost> blogPosts;

    public Blog() {
        this.blogPosts = new ArrayList<>();
    }

    void add(BlogPost blogPost) {
        this.blogPosts.add(blogPost);
    }

    void delete(int index) {
        if (index >= 0 && index < blogPosts.size()) {
            this.blogPosts.remove(index);
        }
    }

    void update(int index, BlogPost blogPost) {
        if (index >= 0 && index < blogPosts.size()) {
            blogPosts.set(index, blogPost);
        }
    }

    public List<BlogPost> getBlogPosts() {
        return blogPosts;
    }

    public static void main(String[] args) {
        Blog blog = new Blog();
        BlogPost blogPost1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet", "2000.05.04.");
        BlogPost blogPost2 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything", "2010.10.10.");
        BlogPost blogPost3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing", "2017.03.28.");
        blog.add(blogPost1);
        blog.add(blogPost2);
        blog.add(blogPost3);
        System.out.println("Initial Blog Posts: ");
        for (BlogPost post : blog.getBlogPosts()) {
            System.out.println(post.getAuthorName());
        }

        blog.delete(0);
        System.out.println("\nAfter removing: ");
        for (BlogPost post : blog.getBlogPosts()) {
            System.out.println(post.getAuthorName());
        }

        BlogPost updatedBlogPost = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing", "2017.03.28.");
        blog.update(0, updatedBlogPost);
        System.out.println("\nUpdated Blog Posts: ");
        for (BlogPost post : blog.getBlogPosts()) {
            System.out.println(post.getAuthorName());
        }
    }
}
