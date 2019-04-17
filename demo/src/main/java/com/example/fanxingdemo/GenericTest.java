package com.example.fanxingdemo;

/**
 * @author: SJH
 * @ClassName: GenericTest
 * @Description:
 */
public class GenericTest {
    public static void main(String[] args) {
        Box<String> name = new Box<String>("corn");
        Box<Integer> integerBox = new Box<>(712);
        System.out.println("name="+name.getData());
        System.out.println("name class"+name.getClass());
        System.out.println("integer class"+integerBox.getClass());
        System.out.println(name.getClass() == integerBox.getClass());
        System.out.println("--------------------------------");

        Box<Number> numberBox = new Box<>(555);
        Box<Integer> integerBox1 = new Box<>(898);

        getData(numberBox);
        getData(integerBox1);

    }


    private static void getData(Box<?> data) {
        System.out.println("data: "+data.getData());
    }

}
class Box<T> {
    private T data;

    public Box() {
    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
