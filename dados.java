package classe;

public class dados {

    String nome;
    String sexo;
    int ap;
    int codigo = 1;
    int bloco, cpf, cel, data;

    public dados(String nome, String sexo, int ap, int cpf, int cel, int data, int codigo, int bloco) {
        this.nome = nome;
        this.sexo = sexo;
        this.ap = ap;
        this.cpf = cpf;
        this.cel = cel;
        this.data = data;
        this.codigo = codigo;
        this.bloco = bloco;

        codigo++;

    }

    public dados() {

    }

    @Override
    public String toString() {
        return (String.format("Nome:%s Cpf:%d Celular:%d Data:%d Sexo:%s Bloco:%d Numero:%d Codigo:%d", nome, cpf, cel,
                data, sexo, bloco, ap, codigo));
    }

}
