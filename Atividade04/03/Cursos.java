public abstract class Cursos {

    protected String nomeCurso;
    protected String turno;
    protected String sala;

    public Cursos(String nomeCurso, String turno, String sala){

        this.nomeCurso = nomeCurso;
        this.turno = turno;
        this.sala = sala;

    }

    public void ExibirInfo(){

        System.out.println("=========Matricula");
        System.out.println("Curso: " + nomeCurso);
        System.out.println("Turno: " + turno);
        System.out.println("Sala: " + sala);
    }
    
}