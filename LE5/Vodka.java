class Vodka extends Beverage {
    @Override
    protected void pour() {
        System.out.println("Pouring vodka into the glass.");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Adding a splash of tonic water to the vodka.");
    }

    @Override
    protected void stir() {
        System.out.println("Stirring the vodka with a stirrer.");
    }

    @Override
    protected void serve() {
        System.out.println("Serving the vodka.");
    }
}
