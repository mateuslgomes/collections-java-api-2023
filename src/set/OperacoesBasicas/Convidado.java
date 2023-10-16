package set.OperacoesBasicas;

public class Convidado {

    private String nome;
    private int codigoConvite;

    public String getNome() {
        return this.nome;
    }

    public int getCodigoConvite() {
        return this.codigoConvite;
    }

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }


    @Override
    public String toString() {
        return "Convidade [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
    }

}
