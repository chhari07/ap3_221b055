class RubberDuck extends Duck implements SqueakBehavior {
    @Override
    public void squeak() {
        System.out.println("Rubber Duck squeaks.");
    }