public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>(10);
        myArrayList.add("Mot");
        myArrayList.add("Hai");
        myArrayList.add("Ba");
        myArrayList.add("Bon");
        myArrayList.add("Nam");
        myArrayList.add("Sau");
        myArrayList.add("Bay");
        myArrayList.add("Tam");
        myArrayList.add("Chin");
        myArrayList.add("Muoi");
        System.out.println(myArrayList.get(6));
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(3));
        System.out.println(myArrayList.get(9));
    }
}
