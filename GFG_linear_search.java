class GFG_linear_search {
	public static int liner(int arr[], int x)
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int arr[] = { 1, 3, 5, 7, 9, 8 };
		int search = liner(
			arr,
			10); // Here we are searching for 10 element in
				// the array which is not present in the
				// array so, it will print -1
		System.out.println(search);
	}
}

