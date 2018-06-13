package Learn1;

public class Visibility {

    public static void main(String[] args) {
        //System.out.println(i); //не видна
        int x = 3;
        {
            int i = 4;
            x = i + 2;
        }
        System.out.println(x);}
}
