package proyectoalumno;
import javax.swing.JOptionPane;
public class ProyectoAlumno {

    public static void main(String[] args) {
            Alumno alumno1=new Alumno();
            alumno1.cambiarValor();
            JOptionPane.showMessageDialog(null, alumno1.visualizaAlumno());
            Alumno alumno2=new Alumno();
            alumno2.cambiarValor();
            JOptionPane.showMessageDialog(null, alumno2.visualizaAlumno());
    }

}
