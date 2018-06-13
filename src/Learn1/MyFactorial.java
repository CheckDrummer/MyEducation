package Learn1;

class Factorial{

    public static int getFactorial(int num) throws FactorialException{

        int result=1;
        if(num<1) throw new FactorialException("Число не может быть меньше 1", num);

        for(int i=1; i<=num;i++){

            result*=i;
        }
        return result;
    }
}

class FactorialException extends Exception{

	private int number;
	public int getNumber(){return number;}
	public FactorialException(String message, int num){
		super(message);
		number=num;
	}
}

public class MyFactorial {

    public static int factorial (int x) {
		if (x == 0) return 0;
		if (x == 1) return 1;
		return x*factorial(x-1);
	}


    public static void main(String[] args){
        System.out.println("Рекурсия");
        System.out.println(factorial(4));


        System.out.println(" ");
        System.out.println("Перебор");
        try{
            int result = Factorial.getFactorial(0);
            System.out.println(result);
        }
        catch(FactorialException ex){

            System.out.println(ex.getMessage());
            System.out.println("Вы указали: " + ex.getNumber());
        }
    }
}
