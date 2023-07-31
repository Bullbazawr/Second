package SEMINAR2;



public class Main {
    
    public static void main(String[] args) {
        MyLinkedLIst list = new MyLinkedLIst();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.addFirst(8);
        list.addFirst(9);

        list.PrintMy();
        list.Reverse();
        list.PrintMy();
    }
}
