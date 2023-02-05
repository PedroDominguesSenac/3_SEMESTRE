/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplotelas;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author LAPTOP
 */
public class TelaCadastroController implements Initializable {

    @FXML
    private TextField textNome;
    @FXML
    private TextField textSobrenome;
    @FXML
    private DatePicker dateNascimento;
    @FXML
    private ComboBox comboGenero;
    @FXML
    private TextField textRg;
    @FXML
    private TextField textCpf;
    @FXML
    private TextField textTelFixo;
    @FXML
    private TextField textCel;
    @FXML
    private TextField textEmail;
    @FXML
    private CheckBox checkTelFixo;
    @FXML
    private CheckBox checkCelular;
    @FXML
    private CheckBox checkEmail;
    @FXML
    private ToggleGroup permiteContato;
    
    String nome = "";
    LocalDate nascimento;
    int genero = -1;
    Toogle contato;
    boolean contatoTel
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboGenero.getItems().add("Feminino");
    }    

    @FXML
    private void sair(ActionEvent event) {
        System.exit(0);
    }
    

    @FXML
    private void limpar(ActionEvent event) {
        textNome.clear();
        dateNascimento.setValue(null);
        comboGenero.getSelectionModel().clearSelection();
        permiteContato.selectToggle(null);
        checkCelular.setSelected(false);
    }

    @FXML
    private void carregar(ActionEvent event) {
        textNome.setText(nome);
        dateNascimento.setValue(nascimento);
        comboGenero.getSelectionModel();
        permiteContato.select
    }

    @FXML
    private void salvar(ActionEvent event) {
        nome = textNome.getText();
        nascimento = dateNascimento.getValue();
        genero = comboGenero.getSelectionModel().getSelectedIndex();
        contato = permiteContato.getSelectedToggle();
        
        
    }
    
}
