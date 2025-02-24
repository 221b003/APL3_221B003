class Singleton {
   
    private static final Singleton instance = new Singleton();
    private static int counter = 0;

      private Singleton() {
        System.out.println("Singleton count " + (++counter));
    }
    public static Singleton getInstance() {
        return instance;
    }
}