package ex04;

public class ap {
    int num;
    int andar;
    double metragem;
    String status;

    ap(int num, int andar, double metragem, String status) {
        this.num = num;
        this.andar = andar;
        this.metragem = metragem;
        this.status = status;
    }

    public ap() {
    }

    public String toString() {
        return (String.format("Nome:%d Andar:%d Metragem:%2f Status:%s\n", num, andar, metragem, status));
    }

}
