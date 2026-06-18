public class Main {

    public static void main(String[] args) {
         Integer[] numeros = {1, 2, 3, 2, 5, 2};

        int quantidade = ArrayUtil.count(numeros, 2);

        System.out.println(quantidade);

    }
}