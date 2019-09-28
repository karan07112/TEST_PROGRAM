public class LargestNumber {

	public LargestNumber() {
		// TODO Auto-generated constructor stub
	}

	public static int getLargestNumber(int[] a, int size, int position)
			throws Exception {

		if (position > size) {

			throw new Exception("specifed postion is grater than array size");

		}

		int tmp;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (a[i] > a[j]) {

					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}

			}

		}

		return a[size - position];
	}

	public static int getLargestNumberThree(int[] a, int size, int position)
			throws Exception {

		if (position > size) {

			throw new Exception("specifed postion is grater than array size");

		}

		int j, first, second, third;

		first = second = third = Integer.MIN_VALUE;

		for (int i = 0; i < size; i++) {

			if (a[i] > first) {

				third = second;
				second = first;
				first = a[i];
			} else if (a[i] > second) {

				third = second;
				second = a[i];
			} else if (a[i] > third) {
				third = a[i];
			}

		}


		System.out.println(first + "," + second + "," + third);
		return a[size - position];
	}

	
	public static void missngNumber(int arr[]){
		
		
		int sum = 0;
		int idx = -1;
		for (int i = 0; i < arr.length; i++)
		{
		    if (arr[i] == 0)
		    {
		         idx = i; 
		    }
		    else 
		    {
		         sum += arr[i];
		    }
		}

		// the total sum of numbers between 1 and arr.length.
		int total = (arr.length + 1) * arr.length / 2;

		System.out.println("missing number is: " + (total - sum) + " at index " + idx);
		
	}
	public static void main(String args[]) {

		int a[] = { 10, 20, 230, 45, 6, 7, 22, 3355 };

		try {
			System.out.println("Third Largest Number is Arrya"
					+ getLargestNumber(a, a.length, 1));
			System.out.println("Third Largest Number is Arrya"
					+ getLargestNumber(a, a.length, 2));
			System.out.println("Third Largest Number is Arrya"
					+ getLargestNumber(a, a.length, 3));
			
			
		//	System.out.println(getLargestNumberThree(a, a.length, 3));
			
			missngNumber(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
