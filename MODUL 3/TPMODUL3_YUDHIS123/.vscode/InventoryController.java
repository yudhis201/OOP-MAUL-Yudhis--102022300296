package zeppeliapp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class InventoryController {

    @FXML
    private TableView<Album> albumTable;
    @FXML
    private TableColumn<Album, String> albumNameColumn;
    @FXML
    private TableColumn<Album, String> artistColumn;
    @FXML
    private TableColumn<Album, Integer> totalColumn;
    @FXML
    private TableColumn<Album, Integer> availableColumn;
    @FXML
    private TableColumn<Album, Integer> rentedColumn;
    
    @FXML
    private TextField albumNameTextField;
    @FXML
    private TextField artistTextField;
    @FXML
    private TextField totalTextField;
    @FXML
    private TextField availableTextField;
    
    @FXML
    private Button rentButton;
    @FXML
    private Button addButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button updateButton;

    private ObservableList<Album> albumList = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        
        albumNameColumn.setCellValueFactory(cellData -> cellData.getValue().getAlbumName());
        artistColumn.setCellValueFactory(cellData -> cellData.getValue().getArtist());
        totalColumn.setCellValueFactory(cellData -> cellData.getValue().getTotal());
        availableColumn.setCellValueFactory(cellData -> cellData.getValue().getAvailable());
        rentedColumn.setCellValueFactory(cellData -> cellData.getValue().getRented());

      
        albumTable.setItems(albumList);
    }

    @FXML
    private void onAlbumSelected(MouseEvent event) {
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumNameTextField.setText(selectedAlbum.getAlbumName());
            artistTextField.setText(selectedAlbum.getArtist());
            totalTextField.setText(String.valueOf(selectedAlbum.getTotal()));
            availableTextField.setText(String.valueOf(selectedAlbum.getAvailable()));
        }
    }

    @FXML
    private void handleRentAction() {
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null && selectedAlbum.getAvailable() > 0) {
            selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
            selectedAlbum.setRented(selectedAlbum.getRented() + 1);
            albumTable.refresh();
            showAlert("Success", "Album rented successfully.", AlertType.INFORMATION);
        } else {
            showAlert("Error", "No available albums to rent.", AlertType.ERROR);
        }
    }

    @FXML
    private void handleAddAction() {
        try {
            String albumName = albumNameTextField.getText();
            String artist = artistTextField.getText();
            int total = Integer.parseInt(totalTextField.getText());
            int available = Integer.parseInt(availableTextField.getText());

            Album newAlbum = new Album(albumName, artist, total, available, 0);
            albumList.add(newAlbum);
            albumTable.refresh();
            showAlert("Success", "Album added successfully.", AlertType.INFORMATION);
        } catch (NumberFormatException e) {
            showAlert("Error", "Invalid input for total or available.", AlertType.ERROR);
        }
    }

    @FXML
    private void handleDeleteAction() {
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);
            showAlert("Success", "Album deleted successfully.", AlertType.INFORMATION);
        } else {
            showAlert("Error", "Please select an album to delete.", AlertType.ERROR);
        }
    }

    @FXML
    private void handleUpdateAction() {
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            selectedAlbum.setAlbumName(albumNameTextField.getText());
            selectedAlbum.setArtist(artistTextField.getText());
            selectedAlbum.setTotal(Integer.parseInt(totalTextField.getText()));
            selectedAlbum.setAvailable(Integer.parseInt(availableTextField.getText()));
            albumTable.refresh();
            showAlert("Success", "Album updated successfully.", AlertType.INFORMATION);
        } else {
            showAlert("Error", "Please select an album to update.", AlertType.ERROR);
        }
    }

    private void showAlert(String title, String message, AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
