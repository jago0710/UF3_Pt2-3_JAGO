import javax.swing.*;
public class Main extends JFrame {
    private JLabel joel;
    private JLabel joel2;

    public Main() {
        setLayout(null);
        joel = new JLabel("Hola mundo");
        joel.setBounds(10, 20, 200, 300);
        add(joel);
        JButton joel3 = new JButton("Listo");
        joel3.setBounds(100, 100, 100, 50);
        add(joel3);
    }

    public static void main(String[] args) {
        Main formulario = new Main();
        formulario.setBounds(0, 0, 700, 500);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
        formulario.setResizable(true);
    }
}