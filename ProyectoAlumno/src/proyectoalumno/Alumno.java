package proyectoalumno;

import javax.swing.JOptionPane;

public class Alumno {

    private static int referencia = 5500;
    private String nome;
    private String curso;
    private int idade;

    public Alumno() {
        this.referencia=this.referencia+1;
    }

    public Alumno(String nom, String curs, int idad) {
        this.idade = idad;
        this.nome = nom;
        this.curso = curs;
        this.referencia = this.referencia+1;
    }

    public Alumno cambiarValor() {
        this.nome = JOptionPane.showInputDialog("Introduzca nombre");
        this.curso = JOptionPane.showInputDialog("Introduzca curso");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Introduzca edad"));
        return this;
    }
    public String visualizaAlumno(){
        String respuesta="";
        respuesta="Nome alumno "+this.nome+"\nCurso "+this.curso+"\nIdade "+this.idade+"\nReferencia "+this.referencia;
        return respuesta;
    }
}
