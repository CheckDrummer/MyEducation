package Learn5;

class Apple {
    public Apple(String sort) {
        this.sort = sort;
    }

    public String sort;

    @Override
    public String toString() {
        return "Apple{" +
                "sort='" + sort + '\'' +
                '}';
    }
}

class AppleService {
    public AppleService() {
    }

    public void modifySort (Apple apple) {
        apple.sort = "new";
        //return apple;
    }
}

public class ValueTransfer {
    public static void main(String[] args) {
        Apple apple = new Apple("old");
        System.out.println("Before " + apple);
        AppleService appleService = new AppleService();
        appleService.modifySort(apple);
        System.out.println("After " + apple);
    }
}
