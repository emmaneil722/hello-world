// A place to see if i can code mergesort
// Emma MR Neil (c) 2019

class mergeSort{
    // pre: n<= data.length()
    // post: data is returned sorted in  ascending order
    
    public int[] merge(int[] data){
	//merges the arrays generated in sort
    }

    public int[] sort(int[] data, int[] temp, int low, int high){
	// base case: if the list contains one element, it is already sorted
	if(data.length() <2){
	    return data;
	}
	int n = high-low +1;
	int mid = low + n/2;
	
	int[] temp = data[0,mid];
	data = data[mid+1,n];
	sort(temp, mid);
	sort(data, mid);
	merge(data);
	
    public static void main(String[] args){
	int[] list = [2,3,1,5,3,6,7,13,11,1];
	System.out.print(data);
	System.out.print(sort(list,int[] empty,0,list.length-1 ));
    }
}