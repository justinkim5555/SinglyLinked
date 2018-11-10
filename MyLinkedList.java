class MyLinkedList {

    private SinglyNode head;

    public MyLinkedList() {
      head = null;
    // Initalizing my singly linked list


    // Traverse the linked list to get element by index

    /** Helper function to return the index-th node in the linked list. */
    private SinglyNode getNode(int index){
      SinglyNode cur = head;
      for (int i = 0; i < index && cur != null; ++i) {
        cur = cur.next;
      }
      return cur

    }

    private SinglyNode getTail(int index){
      SingleNode cur = head;
      while (cur != null && cur.next != null) {
      cur = cur.next;
      }
      return cur;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        SinglyListNode cur = getNode(index);
        return cur == null ? -1 : cur.val;
    }






    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {

    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {

    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {

    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {

    }
}

/**
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
