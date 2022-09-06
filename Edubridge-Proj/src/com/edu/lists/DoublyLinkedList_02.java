package com.edu.lists;

public class DoublyLinkedList_02 {

	int size=0;
	Element first,last;
	public DoublyLinkedList_02() {
		first=null;
		last=null;
		
	}
	public void addElement(int data)
	{
		Element e=new Element(data);
		if(first==null)
		{
			first=last=e;
			first.prev=null;
			last.next=null;
		}
		else
		{
			last.next=e;
			e.prev=last;
			last=e;
			last.next=null;
		}
		size++;		
	}
	
	public void rotateByN(int n)
	{
        Element curr = first;  
          
        if(n == 0 || n > size)   
           System.out.println("n should be between 1 to "+(this.size));  
        else {  
          
            for(int i = 1; i < n; i++)   
                curr = curr.next;  
              
            last.next = first;  
            first = curr.next;  
            first.prev = null;  
            last = curr;  
            last.next = null;  
        }  
	}
	
	
	public String toString()
	{
		StringBuffer sb=new StringBuffer();
		Element start=this.first;
		while(start!=null)
		{
			sb.append(start.data+", ");
			start=start.next;
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		DoublyLinkedList_02 dl=new DoublyLinkedList_02();
		dl.addElement(1);
		dl.addElement(2);
		dl.addElement(3);
		dl.addElement(4);
		dl.addElement(5);
		
		System.out.println(dl);
		
		dl.rotateByN(3);
		System.out.println(dl);
		
		
		
	}
}

class Element
{
	int data;
	Element prev,next;
	public Element(int data) {
		this.data=data;
	}
}