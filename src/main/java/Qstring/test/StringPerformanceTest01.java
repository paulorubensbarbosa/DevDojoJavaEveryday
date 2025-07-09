package Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        contactString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo para executar tudo: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        contactStringBuilder(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo para executar tudo: " + (fim  - inicio) + "ms");

        inicio = System.currentTimeMillis();
        contactStringBuffer(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo para executar tudo: " + (fim  - inicio) + "ms");


    }

    public static void contactString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho ; i++){
            texto += i;
        }
    }

    public static void contactStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho ; i++){
            sb.append(i);
        }
    }

    public static void contactStringBuffer(int tamanho){
        StringBuffer sbuff = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho ; i++){
            sbuff.append(i);
        }
    }
}
