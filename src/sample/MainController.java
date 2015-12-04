package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class MainController {

    private ObservableList<String> documentTypes;

    @FXML
    private ListView<String> documentTypesListView;

    private Main mainApp;

    public MainController(){}

    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
        documentTypes = FXCollections.observableArrayList();
        documentTypes.add("Физические лица");
        documentTypes.add("Юридические лица");

        documentTypesListView.setItems(documentTypes);
    }




}
