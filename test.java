class test {

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public Node head = null;
  public Node tail = null;

  public void addData(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
    } else {
      tail.next = newNode;
    }
    tail = newNode;
  }

  public void displayNodes() {
    Node temp = head;

    if (temp == null) {
      System.out.println("List is Empty");
      return;
    }

    while (temp != null) {
      System.out.print(" " + temp.data);
      temp = temp.next;
    }
  }

  public int displayAsDecimal() {
    String str = "";

    Node temp = head;

    if (temp == null) {
      System.out.println("List is empty");
      return 1;
    }

    while (temp != null) {
      str += temp.data;
      temp = temp.next;
    }

    return Integer.parseInt(str, 2);
  }

  public void delete(int data) {
    Node temp = head, prev = null;

    if (temp == head && temp.data == data) {
      head = temp.next;
      return;
    }

    while (temp != null && temp.data != data) {
      prev = temp;
      temp = temp.next;
    }

    if (temp == tail && temp.data == data) {
      tail = prev;
      tail.next = null;
      return;
    }

    prev.next = temp.next;
  }

  public void sortList() {
    //Node current will point to head
    Node current = head, index = null;
    int temp;

    if (head == null) {
      return;
    } else {
      while (current != null) {
        //Node index will point to node next to current
        index = current.next;

        while (index != null) {
          //If current node's data is greater than index's node data, swap the data between them
          if (current.data > index.data) {
            temp = current.data;
            current.data = index.data;
            index.data = temp;
          }
          index = index.next;
        }
        current = current.next;
      }
    }
  }

  public static void main(String[] args) {
    test list = new test();

    int[] array = { 2, 4,1,3,5,8,7 };

    for (int i = 0; i < array.length; i++) {
      list.addData(array[i]);
    }

    list.displayNodes();
    System.out.println();

    list.sortList();
    list.displayNodes();
    // System.out.println("Decimal Equilant is :" + list.displayAsDecimal());
  }
}
