package org.o7planning.tutorial.javacollection.helloworld;
 
import java.util.LinkedList;
 
public class HelloLinkedList {
 
    public static void main(String[] args) {
        // Tạo một đối tượng LinkedList.
        LinkedList<String> list = new LinkedList<String>();
 
        // Thêm một số phần tử vào danh sách.
        list.add("F");
        list.add("B");
        list.add("D");
        list.add("E");
        list.add("C");
 
        // Thêm phần tử vào cuối danh sách.
        list.addLast("Z");
 
        // Thêm phần tử vào vị trí đầu tiên của danh sách.
        list.addFirst("A");
 
        // Trèn một phần tử vào ví trí có chỉ số 1.
        list.add(1, "A2");
 
        // Ghi ra tất cả các phần tử của danh sách:
        System.out.println("Original contents of list: " + list);
 
        // Loại bỏ một phần tử khỏi danh sách
        list.remove("F");
 
        // Loại bỏ phần tử tại vị trí có chỉ số 2.
        list.remove(2);
 
        // In ra danh sách sau khi đã xóa 2 phần tử.
        System.out.println("Contents of list after deletion: " + list);
 
        // Loại bỏ phần tử đầu tiên và cuối cùng trong danh sách.
        list.removeFirst();
        list.removeLast();
 
        // In ra danh sách sau khi đã xóa.
        System.out.println("List after deleting first and last: " + list);
 
        // Lấy ra phần tử tại chỉ số 2.
        Object val = list.get(2);
 
        // Sét đặt lại phần tử tại vị trí có chỉ số 2.
        list.set(2,"Changed");
        System.out.println("List after change: " + list);
    }
 
}