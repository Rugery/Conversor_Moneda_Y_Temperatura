import javax.swing.*;

public class Validacion {
    private String valor;
    int input =0;

    public Validacion(String valor) {
        this.valor = valor;
        validarNull(valor);
    }

    public void validarNull(String valor){
        if (valor == null) {
            JOptionPane.showMessageDialog(null, "Programa Terminado", null, JOptionPane.INFORMATION_MESSAGE);
            input = 1;
        }else input =0;
    }

    public int getInput() {
        return input;
    }
}
