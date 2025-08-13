package Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long id = 0L;
    private String nome;
    private double preco;
    private static Long idCount = 0L;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser null");
        Objects.requireNonNull(nome, "Nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(String nome, double preco) {
        //Objects.requireNonNull(id, "Id não pode ser null");
        Objects.requireNonNull(nome, "Nome não pode ser null");

        //Random não funciona legal pois pode gerar um ID Igual
        //this.id = RandomGenerator.getDefault().nextLong(2);

        this.id = idCount;
        idCount++;

        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Manga manga = (Manga) object;
        return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }


    //No compareTo, você tem acesso a dois objetos, o objeto this. e o próximo que você vai comprar, no caso o outroManga
    //retorna negativo SE o this < outrManga
    //SE this == outroManga retorna 0
    //Se this > outroManga retorna positivo
//    @Override
//    public int compareTo(Manga outroManga) {
//        if(this.id < outroManga.getId()){
//            return -1;
//        }if(this.id.equals(outroManga.getId())){
//            return 0;
//        }else {
//            return 1;
//        }
//
//    }

    //Como o ID é um Wrapper, a própria classe Long tem um métod ComptareTo para facilitar, ficando deste forma:


    @Override
    public int compareTo(Manga o) {
        //compara Via ID
        //return this.id.compareTo(o.getId());

        //compara via preco
        //return  Double.valueOf(this.preco).compareTo(Double.valueOf(o.getPreco()));
        //ou
        //return Double.compare(this.preco, o.getPreco());

        //compara via nome
        return this.nome.compareTo(o.getNome());
    }


}
