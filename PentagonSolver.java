import java.util.*;

public class PentagonSolver {

/*
This function return if the given sum solves the pentagon problem
If true , then this is a valid permuation, false otherwise.
*/
public static boolean IsPentagon(int [] list  ) {
		int first = list[0]; 
		for (int i = 1 ; i < 5 ;i++ ) {
			if (first != list[i]) {
				return false ; 
			}
		}
		return true; 
	
	}
/*
This function only swaps in place
*/
public static void Swap (int [] list , int index_1 , int index_2){
		int temp = list[index_1];
       list[index_1] = list[index_2];
       list[index_2] = temp;
}
/*
This function return the sum of the side of a pentagon
It returns  the sum.
*/
public static int SumPentagon (int []list) {
		int sum = 0 ; 
		for (int i = 0 ;i<list.length ;i++ ) {
			sum+=list[i];
		}
		return sum;
	}
/*
This is the major function that prints the final result if it solves the pentagon problem
if a generated permutation is pentagon solver, then it gets printed out, no otherwise.
*/
public static void CheckIFPentagonSolver(String str) {
	int [] permuation = new int [str.length()];
	int permutaion_index=0;
	int sum_pentagon = 0; 
	for (int i = 0 ;i <str.length() ;i++ ) {
		permuation[i] = str.charAt(i) - '0' ; 
	}
	int [] []  pentagon_sides= new int [5][3];
	for (int i = 0;i<5 ; i++) {
			for (int j = 0 ;j<3 ; j++) {
				if (permutaion_index>=permuation.length){
					permutaion_index-=1;	
				}
				pentagon_sides[i][j] = permuation[permutaion_index]; 
				permutaion_index++;
			}
			permutaion_index--;
		}
		pentagon_sides[4][2] = permuation[0];
		int [] sum = new int [5]; 
		for (int i = 0;i<5 ;i++ ) {
			sum[i] = SumPentagon(pentagon_sides[i]);
			
		}
		sum_pentagon = sum[0] ;
		boolean is_solver = IsPentagon(sum);
		if (is_solver == true) {
		System.out.println(str+" is a permutation, Sum: "+sum_pentagon);
		}		
}
/*
This function generates all the possible permutations that form 0 to n (in our case, 0 - 9)
*/
public  static void DoPermutation(int first_index, int[] list , String concat_permutations) {
        if (first_index == list.length) {
            for(int x: list){
            concat_permutations+=x;
        }
       CheckIFPentagonSolver(concat_permutations);
       return ;
    }
    for (int i = first_index; i < list.length; i++) {
        Swap(list,i,first_index);
        DoPermutation(first_index + 1, list,concat_permutations);
        Swap (list, i, first_index);
    }
}
public static void main(String[] args) {
  	int[]  list_of_permutation= {0,1,2,3,4,5,6,7,8,9};  	
  	 String concat_permutations = "";
  	DoPermutation(0,list_of_permutation, concat_permutations);; 
}
}