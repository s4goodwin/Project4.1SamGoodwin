package bsu.comp152.project4_1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.jar.Attributes;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField PriceField;
    @FXML
    private TextField TypeField;
    @FXML
    private TextField NameField;
    @FXML
    private ListView<MerchandiseItem> ListStock;
    private MerchandiseItem Stock;

    public HelloController(){
        super();
    }

    public void loadData(){
        var stockList=new Store();
        ArrayList<MerchandiseItem> List=stockList.getStock();
        ObservableList<MerchandiseItem> dataToShow=
                FXCollections.observableArrayList(List);
        ListStock.setItems(dataToShow);

    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}