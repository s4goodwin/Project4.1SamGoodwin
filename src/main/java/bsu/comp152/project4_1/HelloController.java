package bsu.comp152.project4_1;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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

public class HelloController extends Store implements Initializable {
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
    private ArrayList<MerchandiseItem> Stock;

    public HelloController(){
        super();
    }

    public void loadData(){
        ArrayList<MerchandiseItem> stockList=Stock;
        stockList=new ArrayList<MerchandiseItem>(getStock());
        ObservableList<MerchandiseItem> dataToShow=
                FXCollections.observableArrayList(stockList);
        ListStock.setItems(dataToShow);

    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadData();
        ListStock.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<MerchandiseItem>() {
            @Override
            public void changed(ObservableValue<? extends MerchandiseItem> observableValue, MerchandiseItem merchandiseItem, MerchandiseItem t1) {
                PriceField.setText(String.valueOf(t1.getPrice()));
                TypeField.setText(String.valueOf(t1.getTaxibleType()));
                NameField.setText(t1.getName());
            }
        });

    }
}