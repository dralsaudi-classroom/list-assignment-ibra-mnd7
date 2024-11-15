package com.example.project;

public class ListTester<T> {
    public static <T> void circularLeftShift(List <T> list, int n)
    {    
    	int tempcount=0;
	T[] temp = (T[]) new Object[n];

	list.findFirst();
	for(int i=0; i<n;i++) {
		
	temp[tempcount++]=list.retrieve();
	list.remove();
	
	if(list.empty())
		break;
	
	}
	if(!list.empty())
	while(!list.last()) {
		list.findNext();
	}

	for(int i=0; i<tempcount;i++) {
		list.insert(temp[i]);
		
	}
    }
    public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2) {

    	while(!l1.last()) {
    		l1.findNext();
    	
    	}

    	while(!l1.first()) {
    		
    		l2.insert(l1.retrieve());
    		l1.findPrevious();
    		
    	}
    	l2.insert(l1.retrieve());

    }
    
    
    

}
