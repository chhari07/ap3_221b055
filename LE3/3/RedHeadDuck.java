class RedHeadDuck extends Duck implements FlyBehavior, QuackBehavior {
    @Override
    public void fly() {
        System.out.println("RedHead Duck flies.");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck quacks.");
    }
}