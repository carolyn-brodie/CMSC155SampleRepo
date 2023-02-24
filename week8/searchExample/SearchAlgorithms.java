package week8.searchExample;

public class SearchAlgorithms {
	
	
	public static int linearSearch(double target, double[] array)
	{
		boolean found = false; 
		int index = 0;
				
		while ((index < array.length) && !found)
		{
			if (array[index] == target) 
			    found = true; 
			else index++;
		}
			    
		if (found) return index; 
		else return -1;
	}
	
	
	public static int findBook(Book book, Book[] books)
	{  // returns the position of course or -1 if not found
				
		boolean found = false; 
		int index = 0;
				
		while ((index < books.length) && !found)
		{
			if (books[index].equals(book)) 
			    found = true; 
			else index++;
		}
			    
		if (found) return index; 
		else return -1;
	}

	
	public static int binarySearchIterative(double[] array, double target )
	{
		int start, end, midpoint;
		start = 0;
		end = array.length -1;
		
		while (start < end)
		{
			midpoint = start + ((end - start) /2);
			 
			if (array[midpoint] == target)
				return midpoint;
			else if (array[midpoint] < target)  //target to the right of midpoint
				start = midpoint + 1;
			else //target to the left of midpoint
				end = midpoint -1;
		}
		return -1;
		
	}
	
	
	public static int binarySearch(double[] arr, double searchValue, int left, int right) 
	{ 
			if (right < left) 
			{ return -1; } 

			int mid = left + ((right - left) / 2); 
			if (searchValue > arr[mid]) 
			{ 
				return binarySearch(arr, searchValue, mid + 1, right); 
			} 
			else if (searchValue < arr[mid]) 
			{ 
				return binarySearch(arr, searchValue, left, mid - 1); 
			} 
			else { return mid; } 
	} 

	

	public static void main(String[] args) {
		 
		double[] theArray1 = {15, 2.5, 45.8, 10.2, 79, 25, 18, 1.1 };
		double[] theArray2 = {-5, 1.1, 25, 34.2, 45, 101, 12.2};
		
		System.out.println(linearSearch(25, theArray1));
		System.out.println(binarySearchIterative(theArray2, 1.1 ));
		System.out.println(binarySearch(theArray2, 1.1, 0, theArray2.length-1));

		
		
//		Book[] bookArray = {new Book("Abook", "someone", 12.33), new Book("Bbook", "another", 34.34), new Book("Cbook", "author",59.10)};
//
//		Book testBook = new Book("Cbook", "author",59.10);
		
		//System.out.println(findBook(testBook, bookArray));
		
	}

}
