package com.example.project;

public class ListTester<T> {
    public static <T> void circularLeftShift(List <T> list, int n)
    {    
    	int tempcount=0;
	T[] temp = (T[]) new Object[n];

	list.findFirst();
	for(int i=0; i<n;i++) {
		if(!list.full()) {
	temp[tempcount++]=list.retrieve();
	list.findNext();}}
	
	while(!list.last()) {
		list.findNext();
	}
	
	for(int i=0; i<tempcount;i++) {
		list.insert(temp[i]);
		
	}
    }
    public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2)
    {
    	l1.findFirst();
    	int count=0;
    	while(!l1.last()) {
    		l1.findNext();
    		count++;
    	}
    	count++;
    	while(count>0) {
    		l2.insert(l1.retrieve());
    		l1.findPrevious();
    		count--;
    	}

    }
    
    
    
    public void remove(List <T> list, T e){
    	while(!list.last()) {
    		if(list.retrieve().equals(e)) {
    			list.remove();
    			
    		}
    		list.findNext();
    		
    	}
    	
    	if(list.retrieve().equals(e))
    	list.remove();
    	
    	
    }
}
