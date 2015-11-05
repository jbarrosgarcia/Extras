
package proyectoextrajava;
import javax.swing.JOptionPane;

public class ProyectoExtraJava {

    public static void main(String[] args) {
        String nombre;
        int curso;
        int not1,not2,not3,nm;
        nombre=JOptionPane.showInputDialog("Introduzca el nombre");
        not1=Integer.parseInt(JOptionPane.showInputDialog("Nota primera evaluacion"));
        not2=Integer.parseInt(JOptionPane.showInputDialog("Nota segunda evaluacion"));
        not3=Integer.parseInt(JOptionPane.showInputDialog("Nota tercera evaluacion"));
        curso=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero del curso"));
        if(curso<1&&curso>5){
            JOptionPane.showMessageDialog(null, "El numero del curso es erroneo");
        }else{
            nm=(not1+not2+not3)/3;
            switch(curso){
                case 1:JOptionPane.showMessageDialog(null, "Primero\nNota media "+nm);
                    break;
                case 2:JOptionPane.showMessageDialog(null, "Segundo\nNota media "+nm);
                    break;    
                case 3:JOptionPane.showMessageDialog(null, "Tercero\nNota media "+nm);
                    break;
                case 4:JOptionPane.showMessageDialog(null, "Cuarto\nNota media "+nm);
                    break;
                case 5:JOptionPane.showMessageDialog(null, "Quinto\nNota media "+nm);
                    break;    
            }
        }
    }
}
