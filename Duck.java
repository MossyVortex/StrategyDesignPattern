public class Duck{

    private FlyStrategyInterface flyBehaviour;
    private QuackStrategyInterface quackBehaviour;


    public Duck(FlyStrategyInterface flyBehaviour, QuackStrategyInterface quackBehaviour){

        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;

    }

    public String quack(){ // this will be differenet depending on the value given to the constructor duriung instantiation of the duck in the app.java file
        return this.quackBehaviour.quack();
    }

    public void fly(){ // this will be differenet depending on the value given to the constructor duriung instantiation of the duck in the app.java file
        this.flyBehaviour.fly();
    }
    
    public void display(String string){ // hard coded means it is the same for all of the ducks
        System.out.println(string);
    }
}
