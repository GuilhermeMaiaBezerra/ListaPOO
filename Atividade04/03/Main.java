/* Você foi contratado pela "Escola Futuro Brilhante" para desenvolver um sistema de matrículas.
 A escola oferece cursos regulares, técnicos e profissionalizantes (cada um com regras e benefícios diferentes).
  Utilize os conceitos de classes, objetos, abstração, encapsulamento, herança e polimorfismo para implementar
   esse sistema em Java.*/

public class Main{
    public static void main(String[] args){

        Tecnico cTecnico = new Tecnico("Tec. Informatica", "Matutino", "32",  60, "Tecnico");

        cTecnico.ExibirInfo();

        cTecnico.Mensagem();

        Profissionalizantes cProf = new Profissionalizantes("Vendedor", "Vespertino", "53", 50, "Profissionalizante");
        
        cProf.ExibirInfo();
        cProf.Mensagem();

        Regular cReg = new Regular("Excel", "Noturno", "A5", 12, "Regular");
        
        cReg.ExibirInfo();
        cReg.Mensagem();
    }
}

