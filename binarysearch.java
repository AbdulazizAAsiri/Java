public class binarysearch {
	int search(int [] list , int target, int min , int max) {
		if (min > max) {
			return -1; 
		}
		 int mid =((max+min) / 2) ; 

		if (list[mid] == target) {
			return target ; 
		}
		else if (target< list[mid]) {
			return search(list, target, min , mid-1); 
		}
		else  {
			return search(list, target, mid+1 , max); 
		}
	}
	 public static void main(String[] args) {
		int [] list = {5,6,7,8,9,10,15} ; 
		int target = 16; 
		int max = list.length-1;
		int min = 0 ; 
		binarysearch objj = new binarysearch (); 
		// Testing the values, mathematical proofs wby induction ill be included later 
		for (int i = 0 ; i<20 ; i++) {
		int value = objj.search(list, i,min,max);
		if (value  == target) {
		System.out.println("Value found "+value);
		}
		else {
			System.out.println("Could not find the value "+value);
		}
	}
	}
}
