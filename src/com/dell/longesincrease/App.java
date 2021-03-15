package com.dell.longesincrease;

import java.util.ArrayList;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		int array[] = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        ArrayList list = new ArrayList();
        ArrayList longestList = new ArrayList();
        int currentMax;
        int highestCount = 0;
        for(int i = 0; i < array.length;i++)
        {
            currentMax = Integer.MIN_VALUE;
            for(int j = i;j < array.length; j++)
            {
                if(array[j] > currentMax)
                {
                    list.add(array[j]);
                    currentMax = array[j];
                }
            }
             
            if(highestCount < list.size())
            {
                highestCount = list.size();
                longestList = new ArrayList(list);  
            }   
            list.clear();
        } 
         
        Iterator itr = longestList.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println("Length: " + highestCount);
		
	}

}
