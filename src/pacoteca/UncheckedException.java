package pacoteca;

import javax.swing.*;
//Fazer a divisão de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denomidador: ");
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;

            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showInputDialog(null, "Entrada inválida, informe um número inteiro! " + e.getLocalizedMessage());
            } catch (ArithmeticException e) {
                JOptionPane.showInputDialog(null, "Impossível dividir o número por zero! ");

            } finally {
                System.out.println("O chegou no fynally ...");
            }
        } while (continueLooping) ;
        System.out.println("O código contineu ...");
    }
    public static int dividir(int a, int b){
        return a/ b;
  }

}
