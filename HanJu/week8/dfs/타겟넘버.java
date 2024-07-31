import java.io.*;
import java.util.*;
class Solution {
		static int answer=0;
		static int[] arr;
		static int tar,len;
	    public int solution(int[] numbers, int target) {
	        arr = numbers;
	    	tar = target;
	    	
	    	len = arr.length;
	    	
	    	dfs(0,0);
	        return answer;
	    }
	    
	    static void dfs(int depth,int sum) {
	    	if(depth ==len) {
	    		if(sum==tar)answer++;
	    		return;
	    	}else {
	    		dfs(depth+1,sum+arr[depth]);
	    		dfs(depth+1,sum-arr[depth]);
	    	}
	    	
	    	
		}
	}
