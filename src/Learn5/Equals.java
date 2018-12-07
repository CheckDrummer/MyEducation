package Learn5;

class One {
    private int i;

    public One(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (o.getClass() != this.getClass()) return false;
        One one = (One) o;
        return i == one.i;
    }
}

class Two extends One {
    private int j;

    public Two(int i, int j) {
        super(i);
        this.j = j;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Two two = (Two) o;
        return j == two.j;
    }
}

class Three extends Two {
    private int k;

    public Three(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Three three = (Three) o;
        return k == three.k;
    }
}

public class Equals {
    public static void main(String[] args) {
        One one = new One(1);
        Two two = new Two(1, 2);
        Two two2 = new Two(1, 2);
        One one2 = new One(1);
        One one3 = new One(1);
        System.out.println("one.equals(null): " + one.equals(null));
        System.out.println("one.equals(two): " + one.equals(two));
        System.out.println("two.equals(one) " + two.equals(one));
        System.out.println("***");
        System.out.println("two.equals(null): " + two.equals(null));
        System.out.println("two.equals(two2): " + two.equals(two2));
        System.out.println("two2.equals(two): " + two2.equals(two));
        System.out.println("***");
        System.out.println("one2.equals(two): " + one2.equals(two));
        System.out.println("two.equals(one2): " + two.equals(one2));
        System.out.println("one2.equals(one): " + one2.equals(one));
        System.out.println("***");
        System.out.println("one2.equals(one): " + one2.equals(one));
        System.out.println("one.equals(one3): " + one.equals(one3));
        System.out.println("one2.equals(one3): " + one2.equals(one3));


        Three three = new Three(1,2,3);
        Three three2 = new Three(1,2,3);
        System.out.println("***");
        System.out.println("three.equals(null): " + three.equals(null));
        System.out.println("one.equals(three): " + one.equals(three));
        System.out.println("two.equals(three): " + two.equals(three));
        System.out.println("three.equals(one): " + three.equals(one));
        System.out.println("three.equals(two): " + three.equals(two));
        System.out.println("three.equals(three2): " + three.equals(three2));
    }
}
