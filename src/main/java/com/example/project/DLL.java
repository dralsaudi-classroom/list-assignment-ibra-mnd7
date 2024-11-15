package com.example.project;

public class DLL<T> {
	private DLLNode<T> head;
	private DLLNode<T> current;

    public DLL() {
        head = current = null;
    }
    public boolean empty() {
        return head == null;
    }
    public boolean last() {
        return current.next == null;
    }
    public boolean first() {
        return current.previous == null;
    }
    public boolean full() {
        return false;
    }
    public void findFirst() {
        current = head;
    }
    public void findNext() {
        current = current.next;
    }
    public void findPrevious() {
        current = current.previous;
    }
    public T retrieve() {
        return current.data;
    }
    public void update(T val) {
        current.data = val;
    }
    public void insert(T val) {
        DLLNode<T> tmp = new DLLNode<T>(val);
        if(empty()) {
            current = head = tmp;
        }
        else {
            tmp.next = current.next;
            tmp.previous = current;
            if(current.next != null)
                current.next.previous = tmp;
            current.next = tmp;
            current = tmp;
        }
    }
    public void remove() {
        if(current == head) {
            head = head.next;
            if(head != null)
               head.previous = null;
        }
        else {
            current.previous.next = current.next;
            if(current.next != null)
               current.next.previous = current.previous;
        }
        if(current.next == null)
            current = head;
        else
            current = current.next;
    }
    public void removeBetween(T e1, T e2) {
      	DLLNode<T> temp1=head;
    	DLLNode<T> temp2=head;
    
    	
    	while(temp2!=null&&!temp2.data.equals(e2)) {
    		temp2=temp2.next;
  
    	}
    	
    	while(temp1!=null&&!temp1.data.equals(e1)) {
    		temp1=temp1.next;
  
    	}
    	
    	
    	
    	if(temp1!=null && temp2!=null) {
    		DLLNode<T> temp3=temp1.next;
        	DLLNode<T> temp4=temp1.next;
        	while(temp4.next!=temp2) {
        		temp4=temp4.next;
        		temp4.previous=null;
        		temp3.next=null;
        		temp3=temp4;
        	}
        	
        	
    	temp1.next=temp2;
    	temp2.previous=temp1;}
    	

    }
}