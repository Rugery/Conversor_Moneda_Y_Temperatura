import javax.swing.*;
import java.io.IOException;

public class SeleccionDivisa {

    private double valorMoneda;
    public int input = 0;
    public SeleccionDivisa(double valorMoneda) throws IOException {
        this.valorMoneda = valorMoneda;
        select_Divisa(valorMoneda);
    }
    private void select_Divisa(double valorMoneda) throws IOException {
        String moneda[] = {"De pesos a Dólares","De pesos a Euros","De pesos a Libras", "De pesos a Yen","De pesos a Won Coreano","De Dólares a pesos","De Euros a pesos","De Libras a pesos", "De Yen a pesos","De Won Coreano a pesos"};
        String seleccionMoneda = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero:", null, JOptionPane.INFORMATION_MESSAGE, null, moneda, moneda[0]);
        switch (seleccionMoneda) {
            case "De pesos a Dólares":
                ApiDivisa pesosDolares = new ApiDivisa("COP", "USD", valorMoneda);
                pesosDolares.conversionMoneda();
                input = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
                break;
            case "De pesos a Euros":
                ApiDivisa pesosEuros = new ApiDivisa("COP", "EUR", valorMoneda);
                pesosEuros.conversionMoneda();
                input = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
                break;
            case "De pesos a Libras":
                ApiDivisa pesosLibras = new ApiDivisa("COP", "GBP", valorMoneda);
                pesosLibras.conversionMoneda();
                input = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
                break;
            case "De pesos a Yen":
                ApiDivisa pesosYen = new ApiDivisa("COP", "JPY", valorMoneda);
                pesosYen.conversionMoneda();
                input = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
                break;
            case "De pesos a Won Coreano":
                ApiDivisa pesosWonCoreano = new ApiDivisa("COP", "KRW", valorMoneda);
                pesosWonCoreano.conversionMoneda();
                input = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
                break;
            case "De Dólares a pesos":
                ApiDivisa dolaresPesos = new ApiDivisa("USD", "COP", valorMoneda);
                dolaresPesos.conversionMoneda();
                input = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
                break;
            case "De Euros a pesos":
                ApiDivisa eurosPesos = new ApiDivisa("EUR", "COP", valorMoneda);
                eurosPesos.conversionMoneda();
                input = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
                break;
            case "De Libras a pesos":
                ApiDivisa librasPesos = new ApiDivisa("GBP", "COP", valorMoneda);
                librasPesos.conversionMoneda();
                input = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
                break;
            case "De Yen a pesos":
                ApiDivisa yenPesos = new ApiDivisa("JPY", "COP", valorMoneda);
                yenPesos.conversionMoneda();
                input = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
                break;
            case "De Won Coreano a pesos":
                ApiDivisa wonCoreanoPesos = new ApiDivisa("KRW", "COP", valorMoneda);
                wonCoreanoPesos.conversionMoneda();
                input = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
                break;
        }
    }

    public int getInput() {
        return input;
    }
}
