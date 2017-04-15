public class binarysearch2 {
	int search(int [] list , int target, int min , int max) {
		
		while ( min <= max) {

			int middle = (min + max)/2	; 
			if (list[middle] == target) {
				return target ;  
			}
			else if (target < list[middle]) {
				max = middle - 1 ; 
			}
			else {
				min = middle + 1 ; 
			}
		}
		return -1 ; 
	}
	 public static void main(String[] args) {
		int list[] = {5,6,7,8,9,10,15} ; 
		int target = 16; 
		int max = list.length-1;
		int min = 0 ; 
		binarysearch2 objj = new binarysearch2 (); 
		for (int i = 0 ; i<20 ; i++) {
		int value = objj.search(list,i,min,max);
		if (value  == target) {
		System.out.println("Value found "+value);
		}
		else {
			System.out.println("Could not find the value "+value);
		}
	}
	}
}
