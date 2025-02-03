abstract class Animal {
    abstract void makeVoice();
}

class Cow extends Animal {
    void makeVoice() {
        System.out.println("Moo");
    }
}

class Dog extends Animal {
    void makeVoice() {
        System.out.println("Bark");
    }
}

class Pig extends Animal {
    void makeVoice() {
        System.out.println("Oink");
    }
}

class Goat extends Animal {
    void makeVoice() {
        System.out.println("Bleat");
    }
}

class Lion extends Animal {
    void makeVoice() {
        System.out.println("Roar");
    }
}
