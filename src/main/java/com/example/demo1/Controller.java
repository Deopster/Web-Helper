package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import java.awt.datatransfer.*;
import java.awt.Toolkit;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;



public class Controller implements Initializable {
    @FXML
    private WebView WebView;
    @FXML
    public ListView<String> Hey;
    @FXML
    private WebView Web1;
    @FXML
    private TextField log;
    @FXML
    private TextField pass;
    @FXML
    private TextField strok;
    Label selectedLbl = new Label();
    // создаем список объектов

    public String urls;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        urls="https://my.mosenergosbyt.ru/auth";
        log.setText("");
        pass.setText("");
        final  WebEngine engine= Web1 .getEngine();
        engine.load("https://yandex.ru/");
        sett();
    }

    @FXML
    public void ms(javafx.event.ActionEvent actionEvent) {
        urls="https://my.mosenergosbyt.ru/auth";
        log.setText("");
        pass.setText("");
        getv();
        sett();
    }

    public void ci(javafx.event.ActionEvent actionEvent) {
        urls="https://www.cian.ru/";
        log.setText("login");
        pass.setText("password");
        getv();
        sett();
    }

    public void jr(javafx.event.ActionEvent actionEvent) {
        urls="https://school.mosreg.ru/feed";
        log.setText("");
        pass.setText("");
        getv();
        sett();
    }

    public void gos(ActionEvent actionEvent) {
        urls="https://esia.gosuslugi.ru/login/";
        log.setText("");
        pass.setText("");
        getv();
        sett();
    }
    public void gos1(ActionEvent actionEvent) {
        urls="https://esia.gosuslugi.ru/login/";
        log.setText("");
        pass.setText("");
        getv();
        sett();
    }
    public void gos2(ActionEvent actionEvent) {
        urls="https://esia.gosuslugi.ru/login/";
        log.setText("");
        pass.setText("");
        getv();
        sett();
    }
    public void seven(ActionEvent actionEvent) {
        urls="https://lk.seven-sky.net/";
        log.setText("");
        pass.setText("");
        getv();
        sett();
    }
    public void trik(ActionEvent actionEvent) {
        urls="https://lk-subscr.tricolor.tv/#Login";
        log.setText("");
        pass.setText("");
        getv();
        sett();
    }
    public void voda(ActionEvent actionEvent) {
        urls="http://xn----7sbabgej1bmmugcbkl9m.xn--p1ai/";
        log.setText("");
        pass.setText("");
        getv();
        sett();
    }
    public void voda1(ActionEvent actionEvent) {
        urls="http://xn----7sbabgej1bmmugcbkl9m.xn--p1ai/javascript:void(0)";
        log.setText("");
        pass.setText("");
        getv();
        sett();
    }
    public void getv(){
        String ctc = log.getText().toString();
        StringSelection stringSelection = new StringSelection(ctc);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
    public void myuk(){
        urls="https://lk.myuk.ru/";
        log.setText("");
        pass.setText("");
        getv();
        sett();
    }

    public void copylog(ActionEvent actionEvent) {
        getv();
    }

    public void copypass(ActionEvent actionEvent) {
        String ctc = pass.getText().toString();
        StringSelection stringSelection = new StringSelection(ctc);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    public void asvt(ActionEvent actionEvent) {
        urls="https://lk.asvt.ru/";
        log.setText("");
        pass.setText("");
        getv();
        sett();
    }
    public void back(ActionEvent actionEvent) {
    }

    public void sett(){
        strok.setText(urls);
        final  WebEngine engine= WebView .getEngine();
        if (urls.contains("http"))
            engine.load(urls);

        else
            engine.load("https://yandex.ru/search/?text="+urls);
    }
    public void go(ActionEvent actionEvent) {
        urls=strok.getText();
        sett();
    }
}
