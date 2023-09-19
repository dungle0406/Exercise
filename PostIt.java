//Create a PostIt class that has
//        a backgroundColor represented by a string
//        a text on it
//        a textColor represented by a string
//        Create a few example post-it objects:
//        an orange with blue text: "Idea 1"
//        a pink with black text: "Awesome"
//        a yellow with green text: "Superb!"
public class PostIt {
    private String backgroundColor;
    private String text;
    private String textColor;

    public PostIt(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getText() {
        return text;
    }

    public String getTextColor() {
        return textColor;
    }

    public static void main(String[] args) {
        PostIt postIt1 = new PostIt("An orange", "Blue", "Idea 1");
        PostIt postIt2 = new PostIt("A pink", "Black", "Awesome");
        PostIt postIt3 = new PostIt("A yellow", "Green", "Superb!");

        System.out.println("Post-it 1: ");
        System.out.println("Background Color: " + postIt1.getBackgroundColor());
        System.out.println("Text: " + postIt1.getText());
        System.out.println("Text Color:" + postIt1.getTextColor());

        System.out.println("\nPost-it 2: ");
        System.out.println("Background Color: " + postIt2.getBackgroundColor());
        System.out.println("Text: " + postIt2.getText());
        System.out.println("Text Color:" + postIt2.getTextColor());

        System.out.println("\nPost-it 3: ");
        System.out.println("Background Color: " + postIt3.getBackgroundColor());
        System.out.println("Text: " + postIt3.getText());
        System.out.println("Text Color:" + postIt3.getTextColor());
    }
}
