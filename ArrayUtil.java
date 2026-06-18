public class ArrayUtil {

    public static <T> int count(T[] vetor, T elemento) {

        int contador = 0;

        for (T item : vetor) {

            if (item.equals(elemento)) {
                contador++;
            }

        }

        return contador;
    }

    //static pq nao precisa criar um objeto da classe arrayutil
    //comparable: o t pode ser qualquer tipo, desde que saiba se comparar com outro t

        public static <T extends Comparable<T>> T max(T[] vetor) {

         verificaExiste(vetor);
        

//aqui tem que assumir que o primeiro é o maior
T maior = vetor[0];

for (T item : vetor) {
//a cada item do vetor
if (item.compareTo(maior) > 0) {
    maior = item;
}
}
return maior;

    }

    public static <T extends Comparable<T>> T min(T[] vetor) {

        verificaExiste(vetor);

        T menor = vetor[0];

        for(T item : vetor) {
            if(item.compareTo(menor) < 0) {
                menor = item;
            }
        }
        return menor;
    }

    public static <T> void verificaExiste(T[] vetor) {
     //verificando se o vetor existe para evitar uma repeticao rsrsrs

    if (vetor == null || vetor.length == 0) {
        throw new IllegalArgumentException("o array está vazio ou null");
    }
}
}
