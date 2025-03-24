class Rum extends Beverage {
    @Override
    protected void pour() {
        System.out.println("Pouring rum into the glass.");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Adding a slice of lime to the rum.");
    }

    @Override
    protected void stir() {
        System.out.println("Stirring the rum with ice.");
    }

    @Override
    protected void serve() {
        System.out.println("Serving the rum.");
    }
}
