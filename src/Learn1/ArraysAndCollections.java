package Learn1;

import java.util.*;

public class ArraysAndCollections {

    public static void main(String[] args) {
        System.out.println("Простой Array");

        int[] nums = new int[4];
        nums[0]=0;
        nums[3]=3;
        for (int num : nums) {
            System.out.println(num);
        }

        System.out.println(" ");
        System.out.println("Array - по значению или по ссылке");
        int[] integerArray = new int[2];
        Integer integer1 = new Integer(1);
        Integer integer2 = integer1;
        integerArray[0] = integer1;
        integerArray[1] = integer2;
        integer1 = new Integer(2);

        System.out.println(integerArray[0]);
        System.out.println(integerArray[1]);

        int [] a = {1,2,3};
        System.out.println("a:");
        for(int aaa: a)
            System.out.print(aaa);



        System.out.println(" ");
        System.out.println("Простой ArrayList");

        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(4);
        //b.set(5,8);  //ошибка

        System.out.println(" ");
        System.out.println("b:");
        for(int aaa: b)
            System.out.print(aaa);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(integer1);
        System.out.println(integerArrayList.get(0));

        integer1 = new Integer(2);
        integerArrayList.add(integer1);
        System.out.println(integerArrayList.get(0));
        System.out.println(integerArrayList.get(1));
//        integerArrayList.set(5, integer1);  //ошибка
//        System.out.println(integerArrayList.get(5));  //ошибка



        System.out.println(" ");
        System.out.println(" ");
        System.out.println("ArrayList c iterator");

        List<String> hats = new ArrayList<>();
        hats.add("ушанка");
        hats.add("тюбетейка");
        for (String hat : hats) {
            System.out.println(hat);
        }
        Iterator hatIterator = hats.iterator();
        while (hatIterator.hasNext()) {
            System.out.println(hatIterator.next());
        }



        System.out.println(" ");
        System.out.println("ArrayList с методом set");

		List<String> testList = new ArrayList<>();
		testList.add("aaaa");
		testList.add("bbbb");
		testList.set(0, "dddd");

		for (String test : testList) {
			System.out.println(test);
		}



        System.out.println(" ");
        System.out.println("Простой TreeMap");

		TreeMap<Integer, String> treeMapTest = new TreeMap<>();
		treeMapTest.put(4, "aaaa");
		treeMapTest.put(2, "bbbb");

		for (Map.Entry<Integer,String> item : treeMapTest.entrySet()) {
			System.out.println(item.getKey() + " " + item.getValue());
		}
    }
}
