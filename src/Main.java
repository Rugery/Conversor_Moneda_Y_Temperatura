import javax.swing.*;
import java.io.IOException;
/**
 * @author RUGERY DUEÑAS
 */
public class Main {
    public static void main(String[] args) {
        boolean numeroCorrecto = false;
        double valorM,valorT;
        String menu[] = {"Conversor de Moneda", "Conversor de Temperatura"};
        String temperatura[] = {"De Grados Centigrados a Fahrenheit", "De Fahrenheit a Grados Centigrados"};
        int input =0;
        do {
            try {
                String seleccionMenu = (String) JOptionPane.showInputDialog(null,"Seleccione una opción de conversión:",null,JOptionPane.INFORMATION_MESSAGE,null,menu,menu[0]);
                Validacion validarMenu = new Validacion(seleccionMenu);
                input = validarMenu.getInput();
                if (input !=0)break;
                    if (seleccionMenu == "Conversor de Moneda") {
                        String valorMoneda = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir:");
                        Validacion validarMoneda = new Validacion(valorMoneda);
                        valorM = Double.parseDouble(valorMoneda);
                        SeleccionDivisa valorDivisa = new SeleccionDivisa(valorM);
                        input = valorDivisa.getInput();
                        if (input !=0)break;
                    } else {
                        String seleccionTemperatura = (String) JOptionPane.showInputDialog(null, "Elije la conversion:", null, JOptionPane.PLAIN_MESSAGE, null, temperatura, temperatura[0]);
                        Validacion valSelTemperatura = new Validacion(seleccionTemperatura);
                        input = valSelTemperatura.getInput();
                        if (input !=0)break;
                        String valorTemperatura = JOptionPane.showInputDialog("Ingrese el valor que deseas convertir:");
                        Validacion validarTemperatura = new Validacion(valorTemperatura);
                        input = validarTemperatura.getInput();
                        valorT = Double.parseDouble(valorTemperatura);
                        if (input !=0)break;
                        if (seleccionTemperatura == "De Grados Centigrados a Fahrenheit") {
                            Temperatura temperaturaFaherenheit = new Temperatura(valorT, 1);
                            input = temperaturaFaherenheit.getInput();
                            if (input !=0)break;
                        } else {
                            Temperatura temperaturaGrados = new Temperatura(valorT, 2);
                            input = temperaturaGrados.getInput();
                            if (input !=0)break;
                        }
                   }
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no valido", null, JOptionPane.ERROR_MESSAGE);
                numeroCorrecto = false;
            } catch (IOException e) {
               throw new RuntimeException(e);
            }
        }while(numeroCorrecto != true );
    }
}