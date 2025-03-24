abstract class Beverage {
    public void prepare() {
        pour();
        addCondiment();
        stir();
        serve();
    }

    protected abstract void pour();
    protected abstract void addCondiment();
    protected abstract void stir();
    protected abstract void serve();
}