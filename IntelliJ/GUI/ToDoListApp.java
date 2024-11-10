import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ToDoListApp extends Application {

    private ObservableList<String> tasks;

    @Override
    public void start(Stage primaryStage) {
        tasks = FXCollections.observableArrayList();

        // Create UI components
        TextField taskInput = new TextField();
        taskInput.setPromptText("Enter new task");

        ListView<String> taskListView = new ListView<>(tasks);

        Button addButton = new Button("Add Task");
        Button removeButton = new Button("Remove Task");

        // Add button functionality
        addButton.setOnAction(e -> {
            String newTask = taskInput.getText();
            if (!newTask.isEmpty()) {
                tasks.add(newTask);
                taskInput.clear();
            }
        });

        // Remove button functionality
        removeButton.setOnAction(e -> {
            String selectedTask = taskListView.getSelectionModel().getSelectedItem();
            if (selectedTask != null) {
                tasks.remove(selectedTask);
            }
        });

        // Layout
        VBox layout = new VBox(10, taskInput, addButton, taskListView, removeButton);
        Scene scene = new Scene(layout, 300, 400);

        primaryStage.setTitle("To-Do List");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
