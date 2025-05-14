class Main{
    public static void main (String[] args) {
        Offering offering = new Icetea();
        offering = new Rum(offering);
        offering = new Gin(offering);
        System.out.println(offering.getName() + " " + offering.getPrice());
    }
}