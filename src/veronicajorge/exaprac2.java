package veronicajorge;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class exaprac2 {
    public static void main(String[] args)
    {
        int opcion;       
        int cantidad[] = new int[10];      
        String producto[] = new String[10];        
        double precio[] = new double[10];
                
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: \n\n 1)  Agregar producto \n 2)  Calcular total \n 3) Salir"));
                                                        
            switch(opcion)
            {
              case 1:
                    int c=1;
                    for(int i=0;i<=c;i++)
                    {
                        if(c<=9)
                        { 
                          producto[i] = JOptionPane.showInputDialog("Ingrese nombre del producto");                         
                          cantidad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad del producto"));                
                          precio[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del producto"));
                                                                      
                          int n = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea ingresar un nuevo registro?\n 1) Si\n 2) No"));
                          
                          if(n==1)
                            {
                                c++;
                            }
                            else
                            {
                                c--;
                            }
                        }
                        else
                            {
                                JOptionPane.showMessageDialog(null,"Registro completos");
                            }
                    }
                    break;
                    
                case 2: 
                
                 for(int i=0;i<=9;i++)
                    {
                        if(producto[i]!=null)
                        {
                         
                        double iva=cantidad[i]*precio[i];
                        double total =(iva*0.13)+iva;
                        JOptionPane.showMessageDialog(null,"Nombre del Producto: " + producto[i] + "\nCantidad del Producto: " + cantidad[i] + "\nPrecio del Producto: $" + precio[i] + "\n\nTotal de la compra: $" + total);
                        }                  
                    }
                      break;
                default:
                    
                    break;
            }
        }
        while(opcion!=3);
    }
    
}
                 
                 
  
    

