import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("otvetı.txt");
        fileWriter.write("1.Массивы удобны для создания и сохранения элементов одинаковой категории.каждый элемент имеет свой индекс по которому мы можем его вызвать и использовать.\n" +
                "2.Arraylist -это усовершенствованный массив,который позволяет нам создавать желаемое количество элементов,стирать их и добавлять другие.\n" +
                "3.при создании массива мы должны указывать его размер,в Arraylist этого можно не делать, он также создаёт дополнительную память если начальный лист заполнен.при удалении элемента в Arraylist не образуется\" пустота\" элементы сдвигаются,когда в массивах образуется \"дырка\".\n" +
                "4.wrapper используются для обварачивания примитивных элементов,так как в Arraylist'е примитивные элементы не могут быть использованы.пишем примитивные данные с заглавной буквы double: Double, int:Integer.\n" +
                "5.set(a,b) затирает предыдущий и заменяет его на новый,add(a,b) добавляет новый элемент и двигает предыдущий.");
        fileWriter.close();

        Random random = new Random();
        ArrayList<Integer> randoms = new ArrayList<>();
        int t=0;

        for (int i = 0; i <50; i++) {
            t = random.nextInt(100);
            System.out.println(t);
        }

        ArrayList<Integer> evenRandoms = new ArrayList<>();
        for (int i =0; i < 50; i++) {
            t = random.nextInt(100);
            if (t % 2 == 0) {
                evenRandoms.add(t);
                System.out.println("Even i=" + i + " t=" + t);
            } else {
                randoms.add(t);
                System.out.println("Odd i=" + i + " t=" + t);
            }
        }}}