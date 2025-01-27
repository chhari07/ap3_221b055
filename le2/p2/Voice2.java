package le2.p2;

// Voice2.java
class Voice2 {
    private Animal[] animals;

    // Private method to prepare the voices (step 1)
    private void prepareVoice() {
        animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    // Private method to produce the sounds (step 2)
    private void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }

    // Template method enforcing the required order
    public void templateMethod() {
        prepareVoice(); // Step 1: Prepare the animal voices
        hear();         // Step 2: Hear the voices
    }
}
