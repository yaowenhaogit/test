package demo;

public class Solution {
	   public int[] twoSum(int[] nums, int target) {
		    int array[] = new int[2];
	        for(int i = 0;i<nums.length;i++){
	            for(int j=0;j<nums.length;j++){
	                if(nums[i] + nums[j] == target && i!=j){
	                	array[0] = i;
	                	array[1] = j;
	                } 
	            }
	        }
	        return array;
	    }
	   //两数相加
	   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		   ListNode root = new ListNode(0);
	        ListNode cursor = root;
	        int carry = 0;
	        while(l1 != null || l2 != null || carry != 0) {
	            int l1Val = l1 != null ? l1.val : 0;
	            int l2Val = l2 != null ? l2.val : 0;
	            int sumVal = l1Val + l2Val + carry;
	            carry = sumVal / 10;
	            
	            ListNode sumNode = new ListNode(sumVal % 10);
	            cursor.next = sumNode;
	            cursor = sumNode;
	            
	            if(l1 != null) l1 = l1.next;
	            if(l2 != null) l2 = l2.next;
	        }
	        return root.next;
	   }
	   public static void main(String[] args) {
		   int[] a = {1,7,3,4,5,6};
		   System.out.println(a.length);
		   new Solution().twoSum(a, 6);
	   }
	   
	   public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { 
		    	  val = x; 
		      }
		}
}
