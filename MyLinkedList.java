package Programs;

//	list whose elements are of type E
public class MyLinkedList<E>
{
	private ListNode<E> head;
	private ListNode<E> tail;
	private int size;

	public MyLinkedList()
	{
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	//	add a new element to the end of the list

	public void add(E newElement)
	{
		//	if the list is empty
		if (this.head == null)
		{
			ListNode<E> node = new ListNode<E>(newElement, null);
			this.head = node;
			this.tail = node;
		}
		else
		{
			ListNode<E> node = new ListNode<E>(newElement, null);
			tail.setNext(node);
			this.tail = node;
		}

		size++;
	}

	public void addFront(E newElement)
	{
		//	if the list is empty
		if (this.head == null)
		{
			ListNode<E> node = new ListNode<E>(newElement, null);
			this.head = node;
		}
		else
		{
			ListNode<E> node = new ListNode<E>(newElement, null);
			node.setNext(this.head);
			this.head = node;
		}
		
		size++;
	}

	//	get's the i-th element of the list
	public E get(int i)
	{
		if (i < 0)
			throw new IndexOutOfBoundsException(i + "");

		ListNode<E> current = this.head;
		int n = 0;
		//	hops i times
		while (n != i)
		{
			if (current == null)
				throw new IndexOutOfBoundsException(i + "");

			current = current.getNext();
			n++;
		}

		return current.getValue();
	}
	
	public int getSize()
	{
		return size;
	}

	@Override
	public String toString()
	{
		String S = new String();
		S = "MyLinkedList ["+this.get(0);
		ListNode<E> current = this.head;
		for(int i = 1;i<size;i++){
			current = current.getNext();
			S= S+","+current.getValue();
		}
		S = S + "]";
		return S;
	}
	public void delete(int i){
		ListNode<E> N = null;
		if (i < 0)
			throw new IndexOutOfBoundsException(i + "");

		ListNode<E> current = this.head;
		int n = 1;
		//	hops i times
		while (n !=i-1)
		{
			if (current == null){
				throw new IndexOutOfBoundsException(i + "");
			}
			current = current.getNext();
			n++;
		}
		current.setNext(current.getNext().getNext());
		size= size-1;
	}
	public boolean contains(E element){
		ListNode<E> current = this.head;
		for(int i = 0; i != size; i++){
			E elements = current.getValue();
			if (elements == element) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((head == null) ? 0 : head.hashCode());
		result = prime * result + size;
		result = prime * result + ((tail == null) ? 0 : tail.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyLinkedList other = (MyLinkedList) obj;
		if(other.getSize()!= this.getSize()){
			return false;
		}
		ListNode<E> current = this.head;
		ListNode<E> currentO = other.head;
		for(int i = 0;i<size;i++){
			if(!current.getValue().equals(currentO.getValue())){
				return false;
			}
			current =current.getNext();
			currentO=currentO.getNext();
		}
		return true;
	}

}


////	finds the last node in the list
//
//ListNode current = this.head;
////	while current.next is not null, set current = current.next
//while (current.getNext() != null)
//{
//	current = current.getNext();
//}

//	current.next = node