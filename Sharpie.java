//Create a Sharpie class
//We should know the followings about each sharpie:
//        color (which should be a string),
//        width (which will be a floating point number) and the
//        inkAmount (another floating point number)
//        We need to specify the color and the width at creation
//        Every sharpie is created with a default inkAmount value: 100
//        We can use() the sharpie objects: using it decreases inkAmount by 10
public class Sharpie {
    private String color;
    private float width;
    private float inkAmount;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100.0f;
    }
    public void use() {
        this.inkAmount -= 10.0f;
    }

    public float getInkAmount() {
        return inkAmount;
    }

    public static void main(String[] args) {
        Sharpie sharpie = new Sharpie("Red", 50.0f);
        System.out.println(sharpie.inkAmount);
        sharpie.use();
        System.out.println(sharpie.inkAmount);
    }
}
