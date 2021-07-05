package ucf.assignments;

import org.junit.jupiter.api.Test;

class ToDoControllerTest {


    @Test
    void addList() {
        // create a List and give it the name "List Title"
        // Use addList("List Title") and return a list
        // create boolean to false
        // Loop through lists and compare both List string name
        // assert true for boolean
    }

    @Test
    void editList() {
        // create a List and give it a name
        // create another list with expected names
        // use editList() and give it a string and index number
        // declare boolean to false
        // assert that two strings are equals withing the expected list and output list. If tru boolean to true
        // assert true for boolean
    }

    @Test
    void addItem() {
        // create a Item and assign it values
        // use addItem() and give it the same values
        // assert the two Items are equal
    }

    @Test
    void searchItemsCompletedCheckbox() {
        // create a List and add multiple items with true for completed and uncompleted
        // create another list with only true values for completed - expected
        // use searchItem() and give true for completed boolean
            // assign completed items to a ArrayList<Item> - output
        // initialize boolean to false
        // loop through both expected and output lists and assign true to boolean if contents are equal
        // assert that the boolean is true
    }

    @Test
    void searchItemsUncompletedCheckbox() {
        // create a List and add multiple items with true for completed and uncompleted
        // create another list with only true values for uncompleted - expected
        // use searchItem() and give true for completed boolean
            // assign uncompleted items to a ArrayList<Item> - output
        // initialize boolean to false
        // loop through both expected and output lists and assign true to boolean if contents are equal
        // assert that the boolean is true
    }

    @Test
    void viewLists() {
        // create ArrayList<List>
        // add lists and items to it
        // create a ArrayList<Item> for expected
        // use viewLists() give it a index, which gives us output
        // declare boolean to false
        // loop through expected and output and if equal boolean is true
        // assert boolean for true
    }

    @Test
    void deleteList() {
        // create ArrayList<List>
        // add lists and items to it
        // create a List<Items> that we want deleted - expected
        // call deleteList() give it a index and the return value will be the list to delete - output
        // declare boolean to false
        // loop through expected and output and if equal boolean is true
        // assert boolean for true
    }

    @Test
    void saveList() {
        // create ArrayList<List>
        // add lists and items to it
        // create string with the contents of List that we are looking for - expected
        // call saveList(), give it index and it return string for the list - output
        // assert that the expected and output are equals
    }

    @Test
    void saveAll() {
        // create ArrayList<List>
        // add lists and items to it
        // create string with all content of ArrayList - expected
        // use saveAll() and give Array and receive string - output
        // assert that expected and output are equals
    }

    @Test
    void loadList() {
        // create a list and add values to it
        // use loadList(), the returned value should be a file loaded into a List
        // declare boolean to false
        // loop through both lists and change boolean to true if content is equal
        // assert boolean true
    }

    @Test
    void loadAll() {
        // create a ArrayList<List> and add values to it
        // use loadAll(), the returned value should be a file loaded into a ArrayList<List>
        // declare boolean to false
        // loop through both lists and change boolean to true if content is equal
        // assert boolean true
    }

    @Test
    void deleteItem() {
        // create a List
        // add content to List
        // create another List that have desired item deleted already - expected
        // use deleteItem() give index for Item to delete, returns a list without it - output
        // declare boolean to false
        // loop through both list and change value of boolean to true if contents are equal
        // assert boolean true
    }

    @Test
    void editDescription() {
        // create a List
        // add content to List
        // create a item that has the new description - expected
        // use editDescription() give index and string for Item to edit, returns Item - output
        // declare boolean to false
        // compare both Items and change boolean to true if equal
        // assert boolean true
    }

    @Test
    void editDate() {
        // create a List
        // add content to List
        // create a item that has the new due date - expected
        // use editDate() give index and string for Item to edit, returns Item - output
        // declare boolean to false
        // compare both Items and change boolean to true if equal
        // assert boolean true
    }
}