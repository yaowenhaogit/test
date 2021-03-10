package demo;

import java.sql.NClob;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		 String strs[] = new String[] {"a"};
		 System.out.println(longestCommonPrefix(strs));
	}
	//最长公共前缀
	public static String longestCommonPrefix(String[] strs) {
		Set<Character> occ = new HashSet<Character>();
		int end = -1;
		if (strs.length==0) {
			return "";
		}
		int n = strs[0].length();
		for (String s : strs) {
			 n = Math.min(n, s.length());
		}
		for (int i = 0; i < n; i++) {
			for (String s : strs) {
				occ.add(s.charAt(i));
			}
			if (occ.size()>1) {
				end = i;
				break;
			}
			occ.clear();
			if (i==n-1) {
				end = n;
			}
		}
		if (end==-1) {
			return "";
		}
		return strs[0].substring(0, end);
    }
	
	
	
	
	//罗马变int
	 public  int romanToInt(String s) {
		int res = 0;
		int nc = getValue(s.charAt(0));
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (i==s.length()-1) {
				res += getValue(c);
			}else {
				if (nc>getValue(c)) {
					res -= getValue(c);
				}else {
					res += getValue(c);
				}
			}
		}
		return res;
	}
	 private  int getValue(char ch) {
	        switch(ch) {
	            case 'I': return 1;
	            case 'V': return 5;
	            case 'X': return 10;
	            case 'L': return 50;
	            case 'C': return 100;
	            case 'D': return 500;
	            case 'M': return 1000;
	            default: return 0;
	        }
	    }
 
	
	public static boolean isPalindrome(int x) {
		if (x<0) {
			return false;
		}
		int res = x;
		int y = 0;
		while (res>0) {
			y = y * 10 + res%10;
			res = res/10;
		}
		return x==y;
    }
	
//	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		int a = 0;
//		ListNode root = new ListNode(0);
//		ListNode listNode = root;
//		while (l1!=null || l2 !=null || a > 0) {
//			int l1val = l1 == null ? 0:l1.val;
//			int l2val = l2 == null ? 0:l2.val;
//			int b = l1val+l2val+a;
//			a = b/10;
//			ListNode node = new ListNode(b%10);
//			listNode.next = node;
//			listNode = node;
//			if (l1!=null) {
//				l1 = l1.next;
//			}
//			if (l2!=null) {
//				l2 = l2.next;
//			}
//		}
//		return root.next;
//	}
	
//	public static int reverse(int x) {
//        long n = 0;
//        while(x != 0) {
//            n = n*10 + x%10;
//            x = x/10;
//        }
//        return (int)n==n? (int)n:0;
//    }
	
//	public static int reverse(int x) {
//		String a = Integer.toString(x);
//		String s = a;
//		int flag = 1;
//		if (x<0) {
//			flag = -1;
//			s=a.substring(1);
//		}
//		try {
//			return Integer.parseInt(new StringBuilder(s).reverse().toString())*flag;
//		} catch (Exception e) {
//			return 0;
//		}
//    }

}
