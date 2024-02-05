class LL {
	Node head;
			class Node{
				String data;
				Node next;
				
				Node(String data){
					this.data = data;
					this.next = null;
				}
			}
			
			// ADD (First, Last)
			public void addFirst(String data) {
				Node newNode = new Node(data);		// creation of new node
				if(head == null) {					// check for is there head null
					head = newNode;
					return;
				}
				newNode.next = head;				// if head is not null
				head = newNode;
			}
			
			// Add Last 
			public void addLast(String data) {
				Node newNode = new Node(data);
				if(head == null) {
					head = newNode;
					return;
				}
				
				Node CurrNode = head;
				while(currNode.next != null) {
					currNode = currNode.next;
				}
				
				//print
				public void printList() {
				Node CurrNode = head;
				while(currNode != null) {
					System.out.print(currNode.data + "->" );
					currNode = currNode.next;
				}
				System.out.println("NULL");
			}
		}
			public static void main(String[] args)
			{
				LL list = new LL();
						list.addFirst("a");
						list.addFirst("is");
						list.printList();
			}
}