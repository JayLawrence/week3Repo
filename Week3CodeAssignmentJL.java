//week 3 coding assignment: Jason Lawrence - July 4, 2022. 


public class Week3CodeAssignmentJL {
	
	
		//Step 7 method: (step 7 method call is in "main" below):
		public static String combinesStrings(String word, int n) {
			String newWord = "";
			for(int i = 0; i < n; i++) {
				newWord += word;
			}
			return newWord;
		}
	
		//Step 8 method: (step 8 method call is in "main" below):
		public static String fullNameMaker(String firstName, String lastName) {
			
			String newName = firstName + " " + lastName;
			return newName;
		}
		
		//Step 9 method:
		public static boolean isLargerThan100(int[] array) {
			int sum =0;
			for(int i = 0; i < array.length; i++) {
			sum += array[i];
			}
			if(sum > 100)
				return true;
			else
				return false;
		}
		
		//Step 10 method:
		public static double findAverage(double[] array) {
			double sum = 0;
			for(int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			return sum / array.length;
			
		}
		
		//Step 11 method:
		public static boolean greaterThanSecond (double[] array1, double[] array2) {
			int sum1= 0; 
			int sum2=0;
			
			for(int i =0; i < array1.length; i++) {
				sum1 += array1[i];
			}
			for(int i =0; i < array2.length; i++) {
				sum1 += array2[i];
			}
			
			if(sum1 > sum2)
				return true;
			else
				return false;
		}
		
		//Step 12 method:
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			
			if(isHotOutside == true && moneyInPocket > 10.50)
				return true;
			else
				return false;
		}
		
		//Step 13 method:
		//this method takes an array of doubles and first finds the minimum
		//and maximum values.  Then it returns a double[] array containing
		//these two minimum/max values.
		public static double[] getMinMax(double[] array) {
			double min = array[0];
			double max = array[0];
			for(double element: array) {
				if(element < min) {
					min = element;
				}
				if(element > min) {
					max = element;
				}
			}
			double[] minMaxArray = new double[] {min, max};
			return minMaxArray;
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	// Assignment Step 1:
		int[] ages = new int[] {3,9,23,64,2,8,28,93}; 
		System.out.println(ages[ages.length -1] - ages[0]); //Step 1a
		
		int[] ages2 = new int[] {3,9,23,64,2,8,28,93, 100};
		System.out.println(ages2[ages2.length -1] - ages2[0]); // Step 1b
		
		double count = 0;       //step 1c
		for(int i = 0; i < ages.length; i++)
		{
		count += ages[i];
		}
		System.out.println(count / ages.length);
	
	
		
	//Assignment step 2:
		String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally",
 "Buck", "Bob" };	
		
		double sum = 0;                        //step 2a
		for(int i = 0; i < names.length; i++)  
		{
			sum += names[i].length();
		}
		System.out.println(sum / names.length); 
		
		
		String combinedNames = "";             //step 2b
		for(int i = 0; i < names.length; i++)   
		{
			combinedNames += names[i];
		}
		System.out.println(combinedNames);
		
		 // System.out.println(names[names.length -1]); step 3, accessing last element of an array
	
		// System.out.println(names[0]);  step 4, accessing first element of an array
		
		
		//step 5:
		int[] nameLengths = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
			
		//step 6:
			int lengthSum =0;
			for(int i =0; i < nameLengths.length; i ++) {
				lengthSum += nameLengths[i];
			}
			System.out.println(lengthSum);
			
			
			System.out.println(combinesStrings("Hello", 3)); //(step 7 method calling test)	
			
			System.out.println(fullNameMaker("Emily", "Dickinson"));  //(step 8 method calling test)
		
			int[] testArray = new int[] {50, 60, 70};   //step 9 method calling test
			System.out.println(isLargerThan100(testArray));
			
			double[] testArray2 = new double[] {10.0, 20.0, 30.0}; //step 10 method calling test
			System.out.println(findAverage(testArray2));
			
			
			double[] testArray3 = new double[] {1.0, 2.0, 3.0};  //step 11 method calling test
			double[] testArray4 = new double[] {1.0, 2.0, 2.9};
			System.out.println(greaterThanSecond(testArray3, testArray4));
			
			System.out.println(willBuyDrink(true, 10.99));  //step 12 method calling test
			
			double[] testArray5 = new double[] {100.0, 200.0, 300.0}; //step 13 method calling test
			double[] testArray6 = getMinMax(testArray5);
			System.out.println(testArray6[0] + "," + testArray6[1]);
			
			
			}

			
		}

	


	
	

