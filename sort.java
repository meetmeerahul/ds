import java.util.Currency;

public class sort {

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

  public void sortList() {
    Node temp = head, next = null;
    int temp_store;

    if (temp == null) {
      System.out.println("List is empty");
      return;
    } else {
      while (temp != null) {
        next = temp.next;

        while (next != null) {
          if (temp.data > next.data) {
            temp_store = temp.data;
            temp.data = next.data;
            next.data = temp_store;
          }

          next = next.next;
        }
        temp = temp.next;
      }
    }
  }

  public static void main(String[] args) {
    sort list = new sort();

    int[] array = { 2, 4, 1, 3, 5, 8, 7 };

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
