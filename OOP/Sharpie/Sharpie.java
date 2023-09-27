public class Sharpie {
    private String color;
    private float width;
    private float inkAmount;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        inkAmount = 100.0f;
    }

    public void use() {
        if (inkAmount > 10.0f) {
            inkAmount -= 10.0f;
        } else System.out.println("Out of ink!");
    }

    public float getInkAmount() {
        return inkAmount;
    }
}
