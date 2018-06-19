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
        System.out.println("Простой ArrayList");

        int [] a = {1,2,3};
        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(4);
        System.out.println("a:");
        for(int aaa: a)
            System.out.print(aaa);
        System.out.println(" ");
        System.out.println("b:");
        for(int aaa: b)
            System.out.print(aaa);



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
