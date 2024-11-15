package com.example.project;

public class ListTester<T> {
    public static <T> void circularLeftShift(List <T> list, int n)
    {    
    	DLL<T> tmp=new DLL();
	list.findFirst();
	for(int i=0; i<n;i++) {
		
	tmp.insert(list.retrieve());
	list.remove();
	
	if(list.empty())
		break;
	
	}
	
	
	if(!list.empty())
	while(!list.last()) {
		list.findNext();
	}

	while(!tmp.last()) {
		tmp.findNext();
	}
	
while(!tmp.first()) {
	list.insert(tmp.retrieve());
	tmp.findPrevious();
	
}
list.insert(tmp.retrieve());
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
