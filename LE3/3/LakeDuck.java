class LakeDuck extends Duck implements FlyBehavior, QuackBehavior {
    @Override
    public void fly() {
        System.out.println("Lake Duck flies.");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck quacks.");
    }
}