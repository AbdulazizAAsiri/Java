public class binarysearch {
	int search(int [] list , int target, int min , int max) {
		if (min >= max) {
			return -1; 
		}
		 int mid =(max+min) / 2 ; 
		if (list[mid] == target) {
			return target ; 
		}
		else if (list[mid] < target) {
			return search(list, target, mid+1 , max); 

		} else  {
			return search(list, target, min , mid-1); 
		}
	}
	 public static void main(String[] args) {
		int list[] = {5,6,7,8,9,10,15} ; 
		int target = 6; 
		int max = list.length;
		int min = 0 ; 
		binarysearch objj = new binarysearch (); 
		int value = objj.search(list,target,min,max);
		if (value  == target) {
		System.out.println("Value found "+value);
		}
		else {
			System.out.println("Could not find the value "+value);
		}
	}
}
