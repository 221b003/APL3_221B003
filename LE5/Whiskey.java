class Whiskey extends Beverage {
    @Override
    protected void pour() {
        System.out.println("Pouring whiskey into the glass.");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Adding a splash of water to the whiskey.");
    }

    @Override
    protected void stir() {
        System.out.println("Stirring the whiskey gently.");
    }

    @Override
    protected void serve() {
        System.out.println("Serving the whiskey.");
    }
}