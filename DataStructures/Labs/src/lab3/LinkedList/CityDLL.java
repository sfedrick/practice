package lab3.LinkedList;

public class CityDLL {
    private static class Node {
    	private City data;
    	private Node next;
    	private Node previous;
    	public Node(City data, Node next,Node previous) {
    		this.data = data;
    		this.next = next;
    		this.previous=previous;
    	}

    	public City getData() {return data;}
    	public Node getNext() {return next;}
    	public Node getPrevious() {return previous;}
    	public void setNext(Node n) {next = n;}
    	public void setPrevious(Node n) {previous = n;}
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;
    public CityDLL() {};
    	public int size() {
    		return size;
    	}
    	public boolean isEmpty() {
    		return size == 0;
    	}

    	public City first() {
    		if (isEmpty()) {
    			return null;
    		}	
    		else {
    			return head.getData();
    		}
    	}

    	public City last() {
    		if (isEmpty()) {
    			return null;
    		}
    		else {
    			return tail.getData();
    		}
    	}
    	
    	
    
	    
	    
	    public City removeFirst() {
			if (isEmpty()) {
			    return null;
			}
			City target = head.getData();
			head = head.getNext();
			size--;
			if (isEmpty()) {
			    tail=null;
			}
			return target;
	    }
	
	    public City find (String name) {
			for(Node n = head; n!=null; n=n.getNext()) {
			    City data = n.getData();
			    if (data.getCity().equals(name)) {
				return data;
			    }
			}
		        return null;
	    }
	    public Node findnext (String name) {
	    	Node after=null;
			for(Node n = head; n!=null; n=n.getNext()) {
			    City data = n.getData();
			    if (data.getCity().equals(name)) {
			    after=n.getNext();
				return after;
			    }
			}
				Node n= null;
		        return n;
	    }
	    public Node findbefore (String name) {
	    	Node before=null;
			for(Node n = tail; n!=null; n=n.getPrevious()) {
			    City data = n.getData();
			    if (data.getCity().equals(name)) {
				return before;
			    }
			    else {
			    	before=n;
			    }
			}
				Node n= null;
		        return n;
	    }
	    
	    
	    
	    
	    
	    
	    ///Lab methods
	    
	    public void addFirst(City data) {
	    	Node newest = new Node(data,head,null );
			if (isEmpty()) {
				
			    tail = head;

			}
			else if (size==1){
				tail=head;
				tail.setNext(null);
				tail.setPrevious(head);
			}
			else {
				head.setPrevious(newest);
			}
			head = newest; 
			size++;
	    }
	    public void addLast(City data) {
    		Node newest = new Node(data, null, tail);
    		if (isEmpty()) { 
    			head = newest;
    		}
    		else if(size==1) {
    			tail.setNext(newest);
    			tail.setPrevious(head);
    		}
    		else {
    			tail.setNext(newest);
    		}
    		tail = newest; 
    		size++;
    	}
	    
	    public void insertbefore(City c,Node n) {
	    	
	    	if(n==head) {
	    		addFirst(c);
	    	}
	    	else {
	    	//Node before=null;
	    	Node before=n.getPrevious();
	    	
	    	System.out.println(n.getPrevious());
	    	Node add=new Node(c,n,before);
	    	n.setPrevious(add);
	    	before.setNext(add);
			size++;
			
	    	}   
			   
    		
    	}
	    
	    public void insertsorted(City c) {
	    	//System.out.println(size);
			if (isEmpty()) {
				
				addLast(c);
				
				
			}
			else if (size==1) {
				
				
				String name=c.getCity();
			    String nodename=head.getData().getCity();
				if (name.compareToIgnoreCase(nodename)<0) {
					addFirst(c);
			    }
				else {
					addLast(c);
				}
				
			}
			else {
				for (Node n=head; n!=null; n=n.getNext()){
				    String name=c.getCity();
				    String nodename=n.getData().getCity();
				    
				 	
				    if (name.compareToIgnoreCase(nodename)<0) {
				    	
				    	insertbefore(c,n);
				    	return;
					
				    }
				      
				}
				addLast(c); 
			}
		
			
	    }
	    
	    public void insertsortedpop(City c) {
	    	//System.out.println(size);
			if (isEmpty()) {
				
				addLast(c);
				
				
			}
			else if (size==1) {
				
				
				int name=c.getPopulation();
			    int nodename=head.getData().getPopulation();
				if (name<nodename) {
					addFirst(c);
			    }
				else {
					addLast(c);
				}
				
			}
			else {
				for (Node n=head; n!=null; n=n.getNext()){
				    int name=c.getPopulation();
				    int nodename=n.getData().getPopulation();
				    
				 	
				    if (name<nodename) {
				    	
				    	insertbefore(c,n);
				    	return;
					
				    }
				      
				}
				addLast(c); 
			}
		
			
	    }
	    public String toString() {
			String s = new String();
			for (Node n=head; n!=null; n=n.getNext()){
			    s = s + n.getData();
			    if (n != tail) {
				s = s+", ";
			    }
			}
			return s; 
	    }
}

