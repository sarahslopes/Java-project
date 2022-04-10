package ex04;

public class morador {
    String nome;
    String cpf;
    String celular;
    String dataNascimento;
    String sexo;
    int bloco;
    int apt;
    int codigoAcesso = 001; // primeiro morador

    morador(String nome, int bloco, int apt, int codigoAcesso) {
        this.nome = nome;
        this.bloco = bloco;
        this.apt = apt;
        this.codigoAcesso = codigoAcesso;

        codigoAcesso++;
    }

    public morador() {
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSexo(String string) {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String toString() {
        return (String.format("Nome:%s Cpf:%s Celular:%s Sexo:%s Bloco:%d Apartamento:%d", nome, cpf, celular, sexo,
                bloco, apt));
    }

}
