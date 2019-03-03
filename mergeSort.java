// A place to see if i can code mergesort
// Emma MR Neil (c) 2019

class mergeSort{
    int[]  data; // array of values to be sorted
    int n; // pre: n<= data.length()
    // post: data is returned sorted in  ascending order
    
    public int[] sort(data, n){
	return sortHelper(data, n);
    }

    public int[] sortHelper(data, n){
	// base case: if the list contains one element, it is already sorted
	if(data.length() <2){
	    return data;
	}
	int mid = n/2;
	int[] temp = data[0,mid];
	data = data[mid+1,n];
	sortHelper(temp, mid);
	sortHelper(data, mid);
	
	
    public static void main(String[] args){
	data = [2,3,1,5,3,6,7,13,11,1];
	System.out.print(data);
	System.out.print(sort(data, 10);
    }
}