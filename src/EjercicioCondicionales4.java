import javax.swing.*;

public class EjercicioCondicionales4 {
    public static void main(String[] args) {
        float precioCompra, descuento;

        precioCompra = Float.parseFloat(JOptionPane.showInputDialog("Escriba el precio de la compra: "));

        if(precioCompra > 300){
            descuento = precioCompra * 0.20f;
            precioCompra -= descuento;
            JOptionPane.showMessageDialog(null, "El precio de compra es: " + precioCompra);
        }else{
        JOptionPane.showMessageDialog(null, "El precio de compra es: " + precioCompra);
        }
    }
}
