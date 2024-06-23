
package com.espol.proy4.ed;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FavoritosController implements Initializable {
    
    @FXML
    private Label label_favoritos;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String msg = String.format("Favoritos de %s", App.userlogged.getName());
        label_favoritos.setText(msg);
    }
    
    @FXML
    private void regresar() throws IOException{
        App.setRoot("principal");
    }
    
}
