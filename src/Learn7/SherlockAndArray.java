package Learn7;

public class SherlockAndArray {

    public static boolean isSherlock(int arr[])
    {

        int length = arr.length;
        int sum = 0;

        for(int i=0; i<length; i++)
            sum += arr[i];

        int leftSumFromLeftSide = arr[0];
        int rightSumFromLeftSide = sum-arr[0];

        int leftSumFromRightSide = sum-arr[length-1];
        int rightSumFromRightSide = arr[length-1];

        for(int i=1; i<length; i++){

            if (leftSumFromLeftSide == rightSumFromLeftSide || leftSumFromRightSide == rightSumFromRightSide)
                return true;

            if (leftSumFromLeftSide > rightSumFromLeftSide || leftSumFromRightSide < rightSumFromRightSide )
                return false;

            leftSumFromLeftSide = leftSumFromLeftSide + arr[i];
            rightSumFromLeftSide = rightSumFromLeftSide - arr[i];

            leftSumFromRightSide = leftSumFromRightSide - arr[length-1-i];
            rightSumFromRightSide = rightSumFromRightSide + arr[length-1-i];
        }

        if (leftSumFromLeftSide == rightSumFromLeftSide || leftSumFromRightSide == rightSumFromRightSide)
            return true;

        return false;
    }

    public static void main(String[] args) {

        System.out.println(isSherlock(new int[]{ 8, 8 }));
        System.out.println(isSherlock(new int[]{ 8, 3 }));

        System.out.println(isSherlock(new int[]{ 2, 8, 9, 1, 15, 5 }));
        System.out.println(isSherlock(new int[]{ 2, 8, 9, 1, 150, 5 }));

        System.out.println(isSherlock(new int[]{ 20, 80, 9, 1, 2, 3 }));
        System.out.println(isSherlock(new int[]{ 1, 2, 3, 20, 80, 9 }));

    }
}
