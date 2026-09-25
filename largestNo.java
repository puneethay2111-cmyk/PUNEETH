public class largestNo {
    public static void main(String[] args) {
        int arr[] = { 5,3,9,16,21,2};
        int largest = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("Largest number in the array is: " + largest);
    }
}
