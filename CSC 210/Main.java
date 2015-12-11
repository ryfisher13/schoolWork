package Programs;

public class Main {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		MyLinkedList list1 = new MyLinkedList();
		MyLinkedList list2 = new MyLinkedList();
		MyArrayList Alist = new MyArrayList();
		MyArrayList Alist1 = new MyArrayList();
		MyArrayList Alist2 = new MyArrayList();
		int i;
		list.add("dog");
		list1.add("dog");
		Alist.add("dog");
		Alist1.add("dog");
		for (i = 0; i < 10; i++) {
			Alist.add(i);
			Alist1.add(i);
			Alist2.add(i + 1);
			list.add(i);
			list2.add(i + 1);
			list1.add(i);
		}
		System.out.println(list.toString());
		System.out.println(list2.toString());
		System.out.println("list1 = list 2:" + list.equals(list2));
		System.out.println(list.toString());
		System.out.println(list1.toString());
		System.out.println("list1 = list 2:" + list.equals(list1));
		System.out.println(list.toString());
		System.out.println("list contains 1:"+list.contains(1));
		System.out.println(list.toString());
		System.out.println("list contains 10:"+list.contains(10));
		System.out.println(list.toString());
		System.out.println("list contains dog:"+list.contains("dog"));
		System.out.println(list.toString());
		list.delete(5);
		System.out.println(list.toString());

		System.out.println(Alist.toString());
		System.out.println(Alist2.toString());
		System.out.println(Alist.equals(Alist2));
		System.out.println(Alist.toString());
		System.out.println(Alist1.toString());
		System.out.println(Alist.equals(Alist1));
		System.out.println(Alist.toString());
		System.out.println(Alist.contains(1));
		System.out.println(Alist.toString());
		System.out.println(Alist.contains("dog"));
		System.out.println(Alist.toString());
		Alist.delete(5);
		System.out.println(Alist.toString());
	}
}