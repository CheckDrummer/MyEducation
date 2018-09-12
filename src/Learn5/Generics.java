package Learn5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class SlowCar{
    void run(){
        System.out.println("еду 50 км/ч");
    }
}

class Car extends SlowCar{
    @Override
    void run(){
        System.out.println("еду 100 км/ч");
    }
}

class FastCar extends Car {
    @Override
    void run(){
        System.out.println("еду 220 км/ч");
    }
}

class Test1<T extends Car> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class Test<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}



public class Generics {

    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<Integer>();
//        list.add(new Integer(1));
//        list.add(1);
//        list.add(null);
//        list.add(3.3);
//        list.add(new Object());

//        List<? extends Number> list = new ArrayList<Integer>();
//        list.add(new Integer(1));
//        list.add(1);
//        list.add(null);
//        list.add(3.3);
//        list.add(new Object());
//        list.get(0);


//        List<? super Number> list1 = new ArrayList<Object>();
//        list1.add(new Integer(1));
//        list1.add(1);
//        list1.add(null);
//        list1.add(3.3);
//        list1.add(new Object());
//        System.out.println(list1.get(2));


//        Test1<Car> test1 = new Test1<>();
//        Test1<FastCar> test2 = new Test1<FastCar>();
//        Test1<SlowCar> test3 = new Test1<SlowCar>();


//        Test<? super Car> test = new Test<SlowCar>();
//        test.setT(new Car());
//        test.setT(new FastCar());
//        test.setT(new SlowCar());
//
//
//        Test<? extends Car> testt = new Test<FastCar>();
//        testt.setT(new Car());
//        testt.setT(new FastCar());
//        testt.setT(new SlowCar());
    }
}
