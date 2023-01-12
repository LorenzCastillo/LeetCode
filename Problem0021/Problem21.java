package Problem0021;

import java.util.List;

public class Problem21 {
    ListNode head;

    Problem21() {
        head = null;
    }

    public static void main(String[] args) {
        Problem21 list1 = new Problem21();
        Problem21 list2 = new Problem21();

        list1.insert(1);
        list1.insert(2);
        list1.insert(4);

        list2.insert(1);
        list2.insert(3);
        list2.insert(4);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    }

    void insert(int x) {
        ListNode node = new ListNode();
        node.val = x;
        node.next = head;
        head = node;
    }

    void readAll() {

    }
}
