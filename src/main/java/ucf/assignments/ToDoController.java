/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class ToDoController {

    // Methods were created as void to not get errors but pseudo explains what the parameters and return values are

    // initialize global ArrayList<List> ToDoLists to store all lists
    // Not sure if allowed but initialize two booleans to false for completed and uncompleted

    @FXML
    public ListView<String> toDoListDisplay;
    @FXML
    public TableView<String> itemDisplay;
    @FXML
    public TableColumn<Item, String> descriptionCellDisplay;
    @FXML
    public TableColumn<Item, String> dueDateCellDisplay;
    @FXML
    public TableColumn<Item, String> completeCellDisplay;
    @FXML
    public TextField EnterListNameDisplay;
    @FXML
    public TextField EditListNameDisplay;
    @FXML
    public TextField dueDateDisplay;
    @FXML
    public TextArea descriptionDisplay;
    @FXML
    public TextArea editDescriptionDisplay;
    @FXML
    public TextField editDueDateDisplay;

    @FXML
    public void completedItemsCheckBoxClicked(ActionEvent actionEvent) {
        // when ticked boolean is true change global completed boolean to true
    }

    @FXML
    public void uncompletedItemsCheckBoxClicked(ActionEvent actionEvent) {
        // when ticked boolean is true change global uncompleted boolean to true
    }

    @FXML
    public void addListButtonClicked(ActionEvent actionEvent) {
        // get string in EnterListNameDisplay
        // send it in the method
        addList();
        // method returns a list and we add it to Arraylist
        // clear display
    }

    @FXML
    public void editListButtonClicked(ActionEvent actionEvent) {
        // get string in EditListNameDisplay
        // get index for selected list in ListDisplay
        // send string and index to method
        editList();
        // method returns list with edited name and add to ToDoLists Array
        // clear display
    }

    @FXML
    public void addItemButtonClicked(ActionEvent actionEvent) {
        // get string that is in description display
        // get string that is in due date display
        // send both strings to method
        addItem();
        // method returns Item and we add it to ToDoLists
        // clears both input displays
    }

    @FXML
    public void searchItemsButtonClicked(ActionEvent actionEvent) {
        // declare two booleans and assign them the values of the global booleans
        // send booleans to method
        searchItems();
        // receives ArrayList<Item> with desired requirements for completed/uncompleted
        // update itemDisplay with List but don't add to ToDoList
    }

    @FXML
    public void viewSelectedListButtonClicked(ActionEvent actionEvent) {
        // get index of selected list
        // send index to method
        viewLists();
        // method returns the List of items to display in itemDisplay
    }

    @FXML
    public void deleteListButtonClicked(ActionEvent actionEvent) {
        // get index of selected list
        // send index to method
        deleteList();
        // returns with the list wanted and remove()
        // update on toDoListDisplay
    }

    @FXML
    public void saveListButtonClicked(ActionEvent actionEvent) {
        // get selected index from toDoDisplay
        // send index to method
        saveList();
        // return as a string and save to txt or json file
    }

    @FXML
    public void saveAllListsButtonClicked(ActionEvent actionEvent) {
        // send the whole ToDoLists to method
        saveAll();
        // return as a string and save to txt or json file
    }

    @FXML
    public void loadListButtonClicked(ActionEvent actionEvent) {
        loadList();
        // method returns a single list
        // add the list to our main ArrayList
    }

    @FXML
    public void loadAllListsButtonClicked(ActionEvent actionEvent) {
        loadAll();
        // method returns Arraylist
        // add the whole list to our main Arraylist/ or replace it with new one
    }

    @FXML
    public void deleteItemButtonClicked(ActionEvent actionEvent) {
        // retrieve index of selected list itemDisplay
        // send index to method
        deleteItem();
        // method returns list with deleted item
        // update to ToDoLists
    }

    @FXML
    public void editDescriptionButtonClicked(ActionEvent actionEvent) {
        // get string from editDescriptionDisplay
        // get index selected in itemDisplay
        // send string and index to method
        editDescription();
        // method returns updated Item
        // update the index where it belongs too
        // clear display
    }

    @FXML
    public void editDueDateButtonClicked(ActionEvent actionEvent) {
        // get string from editDueDateDisplay
        // get index selected in itemDisplay
        // send string and index to method
        editDate();
        // method returns updated Item
        // update the index it belongs too
        // clear display
    }

    public void addList() {
        // declare a new ArrayList<Item>
        // declare a new list and assign the string given for the list name
        // return list
    }

    public void editList() {
        // Find list with the same index
        // Replace string title with the new one
        // return list
    }

    public void addItem() {
        // use the both strings and create a new Item with those
        // assign false for completion because it was just created
        // return the Item
    }

    public void searchItems() {
        // receives two booleans
        // loop through ArrayList<Item> if completed is true and add to a new ArrayList<item>
        // loop through ArrayList<Item> if uncompleted is true and add to a new ArrayList<item>
        // return the new ArrayList<Item>
    }

    public void viewLists() {
        // receives index number
        // find which list that index belongs to
        // return List of Items
    }

    public void deleteList() {
        // receives index number
        // find which that index belongs to in ToDoLists
        // return list
    }

    public void saveList() {
        // receive index
        // get list that belongs to that index in ToDoLists
        // loop to list to append each item to stringBuilder
        // change to string and return
    }

    public void saveAll() {
        // receives the whole Arraylist
        // loop through the list and append each part to a stringBuilder
        // change to string and return
    }

    public void loadList() {
        // opens file explorer to search for file / or file path (not sure how it will work)
        // read file in loop and appends all info into a List
        // return the single List
    }

    public void loadAll() {
        // opens file explorer to search for file / or file path (not sure how it will work)
        // read file in loop and appends all info into a ArrayList<List>
        // return ArrayList<List>
    }

    public void deleteItem() {
        // retrieve selected/clicked item from itemDisplay
        // delete item from its Arraylist<List> with remove()
        // update itemDisplay
    }

    public void editDescription() {
        // receive string and index
        // find the description that the index belongs too
        // replace with new string
        // return the updated Item
    }

    public void editDate() {
        // receive string and index
        // find the due date that the index belongs too
        // replace with new string
        // return the updated Item
    }
}