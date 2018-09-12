package Learn5;

class A {
    int i;
    public A (int i) {
        this.i = i;
    }

    public void boo () {
        System.out.println("boo");
    }
}
//
//    public static void method() {
//        int sum = 10;
//        A a = new A () {
//            void bla() {
//                sum++;
//                System.out.println(sum);
//            }
//        }
//    }

public class Closure {
    public static void main(String[] args) {

        int j = 10;

        A a = new A (3){
            @Override
            public void boo() {
                System.out.println(j);
            }
        };

//        j = 11;
        a.boo();



    }
}
