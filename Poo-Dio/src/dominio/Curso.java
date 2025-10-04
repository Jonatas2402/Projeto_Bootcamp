package dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    //Regra de negocio: Curso sempre vai iniciar com XP_PADRAO * cargaHoraria de XP
    public Double calcularXp() {
        return XP_PADRAO * cargaHoraria ;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso" +
                "titulo: " + getTitulo()  +
                ", descricao: " + getDescricao()  +
                ", cargaHoraria: " + cargaHoraria;
    }
}
