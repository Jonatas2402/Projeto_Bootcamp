package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    //Regra de negocio: Mentoria sempre vai iniciar com 20 de XP
    public Double calcularXp() {
        return XP_PADRAO + 20d;
    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria" +
                "titulo: " + getTitulo() +
                ", descricao: " + getDescricao() +
                ", data: " + data;
    }


}
