import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
//GUI
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javafx.scene.layout.BackgroundFill;

//Ditey yung main gui bale
public class Main extends Application{
	
    public static void main(String[] args) {
    	//call new gui
//    	new Main().setVisible(true); //old jframe ver
    	launch(args);
    }

    private int n_balls = 0;  
	    
	//when launch, call here
	public void start(Stage primaryStage) throws Exception{
	//		JFrame root = new JFrame();
	//		root.setSize(1530,720); //in px-> 1280+250
	//		root.setDefaultCloseOperation(EXIT_ON_CLOSE);
	//		root.setLocationRelativeTo(null);
			
			//panelContainer looks like this BallPanel(1280,720) | ControlPanel(100,720)
			Pane paneContainer = new Pane();
	//		panelContainer.setLayout(new BoxLayout(panelContainer, BoxLayout.X_AXIS));
			
			Pane paneBall = new Pane();
	//		panelBall.setBackground(Color.red);
	//		panelBall.setPreferredSize(new Dimension(1280, 720));
	
			Pane paneControl = new Pane();
	//		panelControl.setPreferredSize(new Dimension(250, 720));
	//		panelBall.setBackground(Color.white);
			
			//add to container
	//		panelContainer.add(panelBall);
	//		panelContainer.add(panelControl);		
			
			/////CONTROL PANEL
			Label labelX = new Label("Pos X:");
	        TextField inputX = new TextField();
	        Label labelY = new Label("Pos Y:");
	        TextField inputY = new TextField();
	
	        //set stage?
	        GridPane gridPane = new GridPane();
	        GridPane gpControl = new GridPane();
	        gpControl.setAlignment(Pos.BASELINE_CENTER);
	        
	//        VBox vboxControl = new VBox();
	//        TextArea txtSolution = new TextArea("");
	
	        Label labelDeg = new Label("Degrees:");
	        TextField inputDeg = new TextField();
	
	        Label labelVel = new Label("Velocity (px/s):");
	        TextField inputVel = new TextField();
	
	        //TODO: add thread on button
	        Button btnSubmit = new Button("ADD BALL");
	        
	        
	        gridPane.setAlignment(Pos.BASELINE_CENTER);
	        gridPane.addRow(0,labelX,inputX);
	        gridPane.addRow(1,labelY,inputY);
	        gridPane.addRow(2,labelDeg, inputDeg);
	        gridPane.addRow(3,labelVel, inputVel);
	//        gridPane.addRow(3,cbPrint, btnSubmit);
	//        gridPane.addRow(4,l3, answer);
	//        gridPane.addRow(3,btnSubmit);
	//        paneBall.prefWidthProperty();
	        
	//        GridPane gridBallContainer = new GridPane();
	//        gridBallContainer.setPrefWidth(1280);
	//        gridBallContainer.setPrefWidth(1280);
	        paneBall.setMinWidth(1280);
	        paneControl.setMaxWidth(100);
	        TextArea tester = new TextArea("(Test) Balls rn:\n");
	        tester.setMaxSize(250, 720);
	        
	        gpControl.addRow(0,gridPane);
	        gpControl.addRow(1,btnSubmit);
	        gpControl.addRow(2,tester);
	        
	//        vboxControl.getChildren().add(tester);
	//        vboxControl.getChildren().add(gridPane);
	//        vboxControl.getChildren().add(btnSubmit);
	        paneControl.getChildren().add(gpControl);
	        
	        
	//        vboxControl.gethChildren
	//        vboxControl.getChildren().add(labelX);
	//        vboxControl.getChildren().add(inputX);
	//        vboxControl.getChildren().add(labelY);
	//        vboxControl.getChildren().add(inputY);
	//        vboxControl.getChildren().add(labelDeg);
	//        vboxControl.getChildren().add(inputDeg);
	        
	//        panelControl.add(labelX);
	//        panelControl.add(inputX);
	//        panelControl.add(labelVel);
	//        panelControl.add(inputVel);
	//        panelControl.add(btnSubmit);
	//        panelControl.add(vboxControl);
	        
	        
	//        paneControl.getChildren().add(tester);
	//        Paint bgColor = new Paint(valueOf('#ffffff'));
	//        BackgroundFill bgc = new BackgroundFill(valueOf(Color.red), null, null);
	//        paneBall.setBackground(Color.getColor("#FFFFFF"));
	        
	        
	        paneContainer.getChildren().addAll(paneControl,paneBall);
	        Scene scene = new Scene(paneContainer);
	        
	        primaryStage.setTitle("BOUNCING BALLS - grp i forgot num");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	        primaryStage.setHeight(720);
	        primaryStage.setWidth(1530);
	             
	        
	        btnSubmit.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	                //clear first
	                String temp = "";
	                String velocity=inputVel.getText();
	                String x=inputX.getText();
	                String y=inputY.getText();
	                String degrees=inputDeg.getText();
	
	                //TODO: add the thread thing here
	                
	                tester.appendText(n_balls+" at pos ("+x+","+y+") "+velocity+"deg + "+velocity+"px/s  \n");
	                n_balls++;
	
	            }});
		}
}