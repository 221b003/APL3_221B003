class Beer extends Beverage {
    @Override
    protected void pour() {
        System.out.println("Pouring beer into the glass.");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Adding a slice of lemon to the beer.");
    }

    @Override
    protected void stir() {
        System.out.println("No stirring needed for beer.");
    }

    @Override
    protected void serve() {
        System.out.println("Serving the beer.");
    }
}