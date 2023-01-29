 public class sortList {  

  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
   
    Node head, tail = null;  
  
     
    public void addNode(int data) {  

        Node newNode = new Node(data);  

        if(head == null) {  
    
            head = tail = newNode;  
            
            head.previous = null;  
           
            tail.next = null;  
        }  
        else {  
           
            tail.next = newNode;  
          
            newNode.previous = tail;  
            
            tail = newNode;  
          
            tail.next = null;  
        }  
    }  
  
   
    public void sort() {  
        Node current = head, next = null;  
        int temp;  
       
        if(head == null) {  
            return;  
        }  
        else {  

            while(current!=null){
                next=current.next;

                while(next!=null){


                    if(current.data>next.data){

                        temp=current.data;
                        current.data=next.data;
                        next.data=temp;
                    }
                    next=next.next;
                }
                current=current.next;
            }
            
            }  
    }  
    
  
   
    public void display() {  
     
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
          
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        sortList dList = new sortList();  
      
        dList.addNode(7);  
        dList.addNode(1);  
        dList.addNode(4);  
        dList.addNode(5);  
        dList.addNode(2);  
  
       
        System.out.println("Original list: ");  
        dList.display();  
  
        dList.sort();  
  
      
        System.out.println("Sorted list: ");  
        dList.display();  
    }  
}   
    

