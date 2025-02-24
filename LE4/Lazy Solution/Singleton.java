class Singleton {
    // static class
    private static Singleton instance;
    private static int counter = 0;
    private Singleton()
    {
        System.out.println("Singleton count "+(++counter));
    }
    public static Singleton getInstance()
    {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
