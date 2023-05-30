import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JTabbedPane tabbedPane1;
    private JTextArea desordenado;
    private JTextArea ordenado;
    private JButton ordenarButton;
    private JButton crearArregloInsercion;
    private JButton OrdenarInsercion;
    private JTextArea DesordenadoInser;
    private JTextArea OrdenadoInser;
    private JTextField txttamanio;
    private JTextField Tiempo;
    private JPanel MainPanel;
    private JTextField tiempo2;

    public Ventana(){
        Metodosdeordenamiento array1 = new Metodosdeordenamiento();
        Metodosdeordenamiento array2 = new Metodosdeordenamiento();


    crearArregloInsercion.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(txttamanio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese un tamaño");
            }else{
                int tamanio = Integer.parseInt(txttamanio.getText());
                array1.CrearArreglo(tamanio);
                DesordenadoInser.setText(array1.toString());
                array2.clonar(array1.array);
                desordenado.setText(array2.toString());
            }
        }
    });
        OrdenarInsercion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long inicio = System.nanoTime();
                array1.MetodoInsercion(array1.array);
                long fin = System.nanoTime();
                long tiempo = fin - inicio;
                OrdenadoInser.setText(array1.toString());
                Tiempo.setText(""+ tiempo + "nanosegundos");
            }
        });

        ordenarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                array2.clonar(array1.array);
                long inicio = System.nanoTime();
                array2.MetodoBurbuja(array2.array);
                long fin = System.nanoTime();
                long tiempo = fin - inicio;
                ordenado.setText(array2.toString());
                tiempo2.setText(""+ tiempo + " nanosegundos");
            }
        });
    }
    public JPanel getMainPanel() {
        return MainPanel;
    }
}
