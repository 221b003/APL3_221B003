public class Main {
    public static void main(String[] args) {
        Beverage whiskey = new Whiskey();
        whiskey.prepare();
        System.out.println();

        Beverage rum = new Rum();
        rum.prepare();
        System.out.println();

        Beverage vodka = new Vodka();
        vodka.prepare();
        System.out.println();

        Beverage beer = new Beer();
        beer.prepare();
    }
}