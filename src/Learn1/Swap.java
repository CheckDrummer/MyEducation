package Learn1;

import java.awt.*;

public class Swap {

    public static int badSwap(int var1, int var2)
    {
        int temp = var1;
        var1 = var2;
        var2 = temp;

        return var1;
    }

    public static void tricky(Point arg1, Point arg2)
	{
//		arg1.x = 100;
//		arg1.y = 100;
		Point temp = arg1;
		arg1 = arg2;
		arg2 = temp;
	}

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int a1 = badSwap(a, b);
        System.out.println("swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a1 = " + a1);



        Point pnt1 = new Point(20, 20);
        Point pnt2 = new Point(0, 0);
        System.out.println("pnt1.X: " + pnt1.x + ", pnt1.Y: " + pnt1.y);
        System.out.println("pnt2.X: " + pnt2.x + ", pnt2.Y: " + pnt2.y);
        System.out.println(" ");
        tricky(pnt1, pnt2);
        System.out.println("pnt1.X: " + pnt1.x + ", pnt1.Y: " + pnt1.y);
        System.out.println("pnt2.X: " + pnt2.x + ", pnt2.Y: " + pnt2.y);
    }
}
