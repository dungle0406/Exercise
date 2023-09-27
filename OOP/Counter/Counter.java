public class Counter {
    private int counter;
    private int initialValue;

    public Counter() {
        this.counter = 0;
    }

    public Counter(int counter) {
        initialValue = counter;
        this.counter = counter;
    }
    public void add(int number) {
        counter += number;
    }
    public void add() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
    public void reset() {
        counter = initialValue;
    }

    public int get() {
        return counter;
    }
}
