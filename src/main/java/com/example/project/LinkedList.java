package com.example.project;

public class LinkedList<T> implements List<T>{
	private Node<T> head;
	private Node<T> current;
	
    public LinkedList() {
		head = current = null;
	}
	public boolean empty() {
		return head == null;
	}
	public boolean last() {
		return current.next == null;
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
    public T retrieve() {
        return current.data;
    }
    public void update(T e) {
        current.data = e;
    }
    public void insert(T e) {
        if (empty()) {
            current = head = new Node<T>(e);
        } else {
            Node<T> tmp = current.next;
            current.next = new Node<T>(e);
            current = current.next;
            current.next = tmp;
        }
    }
    public void remove() {
        if (current == head) {
            head = head.next;
        } else {
            Node<T> tmp = head;
            while (tmp.next != current) {
                tmp = tmp.next;
            }
            tmp.next = current.next;
        }
        if (current.next == null) {
            current = head;
        } else {
            current = current.next;
        }
    }
    public T mostFrequentElement() {
      	 Node<T> temp = head;
    	 Node<T> temp2 = temp.next;
    	    Node<T> mostF = head;
    	    int counter = 0;
    	   
    	    
    	    while(temp!=null) {
    	    	 int counter2 = 0;
    	    	 temp2 = temp.next;
    	    	while(temp2!=null) {
    	    		 
    	    		if(temp.data.equals(temp2.data)) {
    	    			counter2++;
    	    		}
    	    		temp2=temp2.next;
    	    		
    	    		if(counter2>counter) {
    	    			counter=counter2;
    	    			mostF=temp;
    	    		}
    	    		
    	    	}
    	    	
    	    	temp=temp.next;
    	    }
    	        	    
    return mostF.data;}
    
    
    
    
    public LinkedList<T> merge(LinkedList<T> l2){
        l2.current=l2.head;
        current=head;
        LinkedList <T>temp =new <T>LinkedList();
        
       while(!l2.last()||current.next!=null) {
    	   
    	   if(current!=null) {
    	   temp.insert(current.data);
    	   current =current.next;}
    	   
    	   if(!l2.last()) {
    	   temp.insert(l2.current.data);
    	   l2.current= l2.current.next;}
    	   
       }

        return temp;
        
    }}