import java.util.Arrays; 
public class Array { 
 private static int[] copyTwoArrays(int[] a1, int[] a2) { 
   int[] combined = Arrays.copyOf(a1, a1.length + a2.length); 
   System.arraycopy(a2, 0, combined, a1.length, a2.length); 
   return combined; 
 } 
 public static void main(String[] args) { 
   int[] first = {1,2,3,4,5}; 
   int[] second = {10,20,30}; 
   System.out.print(Arrays.toString(copyTwoArrays(first, second))); 
 } 
} 