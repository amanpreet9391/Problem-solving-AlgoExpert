import java.util.*;

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    // Write your code here.
    Arrays.sort(array);
   int current=0;
    int left=current+1;
    int right=array.length-1;
    List<Integer[]> result=new ArrayList<>();
    while(current<array.length-1){
      if(left>=right){
        current++;
        left=current+1;
        right=array.length-1;
      }
      else if(array[current]+array[left]+array[right]==targetSum)
      {
        Integer[] r={array[current],array[left],array[right]};
        result.add(r);
        left++;
        right--;
      }
      else if(array[current]+array[left]+array[right]>targetSum){
        right--;
      }
      else{
        left++;
      }
    }
    return result;
  }
}