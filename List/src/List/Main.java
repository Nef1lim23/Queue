package List;

public class Main {
    public static void main(String[] args){
        StockArrayList<String> st = new StockArrayList<>();
        st.add("Рапира");
        st.add("Бабочка");
        for(String s : st){
            System.out.println(s);
        }
        StockLinkedList<String> str = new StockLinkedList<>();
        str.add("Дагон");
        str.add("Травела");
        for(String s : str){
            System.out.println(s);
        }

    }
}