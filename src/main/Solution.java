package main;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    public static void main(String args[]){
    	Solution solution = new Solution();
    	ArrayList<Integer> input = new ArrayList<Integer>();
    	input.add(1);
    	//input.add();
    	
    	System.out.println(solution.getClosestStrengths(input));
    }
	
    public int getClosestStrengths(ArrayList<Integer> input){
    	int lowestDifference = Integer.MAX_VALUE;
    	Collections.sort(input);
    	for(int i = 0; i < input.size()-1; i++){
    		int strengthDifference = Math.abs(input.get(i)- input.get(i+1));
    		if(strengthDifference < lowestDifference){
    			lowestDifference = strengthDifference;
    		}
    	}
    	return lowestDifference;
    }
}