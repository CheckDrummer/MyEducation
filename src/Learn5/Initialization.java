package Learn5;


public class Initialization {

    public static void main(String[] args) {
        B1 b = new B1(3);
        System.out.println(b.i);
        System.out.println(b.j);

    }

}

class A1 {

    int i;

    public A1() {
        System.out.println(i);
    }

//    public A1(int i) {
//        this.i = i;
//    }
}

class B1 extends A1{

    int j;

    public B1 (int j) {
//        super();
        this.j = j;
    }
}


