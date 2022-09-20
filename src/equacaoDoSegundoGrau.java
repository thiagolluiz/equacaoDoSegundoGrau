import javax.swing.*;

public class equacaoDoSegundoGrau {


public static void main(String[] args) {

            //Criando as variáveis a, b e c
            double a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de ‘a’:"));
            double b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de ‘b’:"));
            double c = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de ‘c’:"));
            //Chamando e instanciando Delta
            double delta = delta(a, b, c);

            JOptionPane.showMessageDialog(null, "O valor de Delta é: " + delta);
            JOptionPane.showMessageDialog(null, "O valor de x1 é: " + x1(a, b, delta));
            JOptionPane.showMessageDialog(null, "O valor de x2 é: " + x2(a, b, delta));

        }

        // Metodo para calcular Delta
        static double delta(double a, double b, double c) {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                throw new IllegalArgumentException("\nDelta é: " + delta + "\nNão existem raízes reais.");
            }
            return delta;
        }

        //Metodo que calcula x1
        static double x1(double a, double b, double delta) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            return x1;
        }

        //Metodo que calcula x2
        static double x2(double a, double b, double delta) {
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return x2;
        }
}