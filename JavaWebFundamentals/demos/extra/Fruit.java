package demos.extra;

import java.util.ArrayList;
import java.util.List;

public abstract class Fruit {
    
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    
    @SuppressWarnings("unused")
    private static void badSqueeze(Fruit fruit) {
        if (fruit instanceof Orange) {
            Orange orange = (Orange)fruit;
            orange.squeeze();
        }
    }
    
    public static void main(String[] args) {
        List<Fruit> bag = new ArrayList<Fruit>();
        bag.add(new Apple());
        bag.add(new Apple());
        bag.add(new Orange());
        bag.add(new Apple());
        for (Fruit fruit : bag) {
            goodSqueeze(fruit);
        }
    }
    
    public boolean isSqueezable() {
        return false;
    }
    
    public void squeeze() {}
    
    
    public void doSqueeze() {
        if (isSqueezable()) {
            squeeze();
        }
    }
    
    private static void goodSqueeze(Fruit fruit) {
        fruit.doSqueeze();
    }
}

class Apple extends Fruit { }
class Orange extends Fruit { 
    public boolean isSqueezable() {
        return true;
    }
    
    public void squeeze() {
        System.out.println("squeeze "+this);
    }
}
