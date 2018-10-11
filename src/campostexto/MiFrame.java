/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campostexto;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

/**
 *
 * @author alba
 */
public class MiFrame extends JFrame{
    private JTextField field_usuario;
    private JPasswordField field_contraseña;
    private JButton button_login;
      String usuario [][] = {
         
            {"pancho12@email.com","2416"},
            {"antonio292@email.com", "2705"},
            {"andres23@email.com", "0818"}
              
        };
    
    public MiFrame (){
        super ("Prueba de campos de texto");
        setLayout(new FlowLayout());
        
        //crea un campo de textto con 20 columnas
        field_usuario = new JTextField (20);
        add (field_usuario);
        //crea un campo con el texto oculto
         field_contraseña = new JPasswordField(20);
        add (field_contraseña);
        
        //crea un boton con texto
        button_login = new  JButton ("presionar");
        
          ;
        button_login.addActionListener((ActionEvent e) -> {
            System.out.println("usuario: " + field_usuario.getText());
            System.out.println("contreseña: " + field_contraseña.getText());
            for (int fila =0; fila< usuario.length; fila ++){
                 if (field_usuario.getText().equals(usuario[fila][0]) && field_contraseña.getText().equals(usuario[fila][1])){
                     JOptionPane.showMessageDialog(null, "usuario correcto");
                 }
            }
            //llamada al metodo de validacion 
              validacion(field_usuario.getText(),
                    field_contraseña.getText());
             JOptionPane.showMessageDialog(null, "campos obligatorios");
            
        });
        add (button_login);
    }
    private void validacion (String email, String contraseña){
            
    }
}

