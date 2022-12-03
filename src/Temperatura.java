import javax.swing.*;

public class Temperatura {
    private double valorTemp;
    private int seleccion;
    private int input = 0;

    public Temperatura(double valorTemp, int seleccion) {
        this.valorTemp = valorTemp;
        this.seleccion = seleccion;
        conversionTemperatura();
    }

    private void conversionTemperatura(){
        double valor;
        if (this.seleccion==1){
            valor = this.valorTemp*1.8000+32;
            JOptionPane.showMessageDialog(null, "El valor en Fahrenheit es: "+String.format("%.2f",valor)+" °C" , null, JOptionPane.INFORMATION_MESSAGE);
            input = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
        }else{
            valor = (this.valorTemp-32)/1.8000;
            JOptionPane.showMessageDialog(null, "El valor en Fahrenheit es: "+String.format("%.2f",valor)+" °F" , null, JOptionPane.INFORMATION_MESSAGE);
            input = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
        }
    }

    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }

    public double getValorTemp() {
        return valorTemp;
    }

    public int getInput() {
        return input;
    }
}
