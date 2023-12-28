public class App {
    public static void main(String[] args) throws Exception {

        //Run this file only!

        Duck d1 = new Duck(new NormalFlyBehaviour(), new SilentQuackBehaviour());

        System.out.println("---- D1 ----");
        d1.fly();
        System.out.println(d1.quack());

        Duck d2 = new Duck(new SharpFastFlyBehaviour(), new LoudQuackBehaviour());

        System.out.println("---- D2 ----");
        d2.fly();
        System.out.println(d2.quack());

        Duck d3 = new Duck(new ZigzagFlyBehaviour() , new NormalQuackBehaviour());

        System.out.println("---- D3 ----");
        d3.fly();
        System.out.println(d3.quack());

    }
}
