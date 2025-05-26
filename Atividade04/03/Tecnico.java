public class Tecnico extends Cursos{

    private int duracao;
    private String tipo;

    public Tecnico(String nomeCurso, String turno, String sala, int duracao, String tipo){

        super(nomeCurso,turno,sala);

        this.duracao = duracao;
        this.tipo = tipo;
    }

    public void ExibirInfo(){

        super.ExibirInfo();

        System.out.println("Tipo: " + tipo);
         System.out.println("Horas: " + duracao + "H");

    }

    public void Mensagem(){

        System.out.println("Matriculado Com sucesso no curso Tecnico!");
    }
}