package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Slider;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Side;

public class GUI extends Application {
	private TextArea txaMessage;
	private TextField txfName;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			//build GUI
			GridPane grdPane = buildGui();
			//Display GUI
			Scene scene = new Scene(grdPane,270,100);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Clock in/Clock out");
			primaryStage.show();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public GridPane buildGui() {
		GridPane grdPane = new GridPane();
		txfName = new TextField("Type your name");
		grdPane.add(txfName, 0 ,0);
		
		Button btnClock = new Button("Clock in/Clock out");
		grdPane.add(btnClock, 0 , 1);
		
		txaMessage = new TextArea();
		grdPane.add(txaMessage, 0 , 2);
		return grdPane;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
