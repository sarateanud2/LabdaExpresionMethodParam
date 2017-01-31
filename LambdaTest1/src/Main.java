
public class Main {

	public static void main(String[] args) {
		
		int[] nums = {-5, -10, -3, 10, 1, 1, 1, 1};
		
		System.out.println(sum(nums, ExpresionHelper::isEven));
		
		Operator op = ExpresionHelper::isPositiv;
		System.out.println(sum(nums, op));
		
	}
	
	private static int sum(int[] numbers, Operator op){
		
		int result = 0;
		
		for(int i : numbers){
			if(op.isEqual(i))
				result +=i;
		}
		
		return result;
	}

}



 