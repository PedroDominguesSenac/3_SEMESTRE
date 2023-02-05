package br.senac.jfxapp2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaPrincipalController implements Initializable {

    @FXML
    private Label labelMensagem;
    @FXML
    private TextField inputNome;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void exibirMensagem(ActionEvent event) {
        // System.out.println("Olá,Mundo!");
        //inputNome.setText("Ola, Mundo!");
        
        String nome = inputNome.getText + inputSobrenome.getText();
    
        labelMensagem.setText("Ola, " + inputNome.getText());
    }
    
}
