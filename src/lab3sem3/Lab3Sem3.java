/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3sem3;
// github 


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author 2484647
 */
public class Lab3Sem3 extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args); 
    }

    @Override
    public void start(Stage stage) {
        BorderPane bp = new BorderPane();
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setPadding(new Insets (25,25,25,25));
        
        bp.setTop(gp);
        
        Label lblname = new Label("First Name:");
        TextField nametf = new TextField();
        gp.add(lblname, 0, 1);
        gp.add(nametf, 1, 1);
        
        Label lbllname = new Label("Last Name:");
        TextField lnametf = new TextField();
        gp.add(lbllname, 0, 2);
        gp.add(lnametf, 1, 2);
        
        Label lblemail = new Label("Email:");
        TextField emailtf = new TextField();
        gp.add(lblemail, 0, 3);
        gp.add(emailtf, 1, 3);
        
        Label lblpw = new Label("Password:");
        PasswordField pwf = new PasswordField();
        gp.add(lblpw, 0, 4);
        gp.add(pwf, 1, 4); 
        
        Button btn1 = new Button("Register");
        btn1.setDisable(true);
 
        
        Button btn2 = new Button("Clear");
        gp.add(btn1, 0, 5);
        gp.add(btn2, 1, 5);
       
        final Text actiontarget = new Text();
        gp.add(actiontarget, 1, 6);
        
        nametf.setOnKeyReleased(e ->{
            if(nametf.getText().isEmpty() || lnametf.getText().isEmpty() 
                    || emailtf.getText().isEmpty() || pwf.getText().isEmpty()){
                btn1.setDisable(true);
            } else {
                btn1.setDisable(false);
            }
        });
        
        lnametf.setOnKeyReleased(e ->{
            if(nametf.getText().isEmpty() || lnametf.getText().isEmpty() 
                    || emailtf.getText().isEmpty() || pwf.getText().isEmpty()){
                btn1.setDisable(true);
            } else {
                btn1.setDisable(false);
            }
        });
        
        emailtf.setOnKeyReleased(e ->{
            if(nametf.getText().isEmpty() || lnametf.getText().isEmpty() 
                    || emailtf.getText().isEmpty() || pwf.getText().isEmpty()){
                btn1.setDisable(true);
            } else {
                btn1.setDisable(false);
            }
        });
        
        pwf.setOnKeyReleased(e ->{
            if(nametf.getText().isEmpty() || lnametf.getText().isEmpty() 
                    || emailtf.getText().isEmpty() || pwf.getText().isEmpty()){
                btn1.setDisable(true);
            } else {
                btn1.setDisable(false);
            }
        });
        
        btn1.setOnAction(new EventHandler<ActionEvent>(){   
            @Override
            public void handle(ActionEvent e) {
                if (!emailtf.getText().contains("@") || !emailtf.getText().contains(".") ||
                        !pwf.getText().matches(".*[a-zA-Z].*") || !pwf.getText().matches(".*\\d.*")){
                  actiontarget.setFill(Color.RED);
                  actiontarget.setText("Error");
                } else {
                actiontarget.setFill(Color.DEEPPINK);
                actiontarget.setText("Welcome");
                }           
            }
        });
           
        btn2.setOnAction(new EventHandler<ActionEvent>(){      
            @Override
            public void handle(ActionEvent e) {
               nametf.clear();
               emailtf.clear();
               lnametf.clear();
               pwf.clear();
               btn1.setDisable(true);
            }
        });
        
         Scene scene = new Scene(bp,300,250);
         
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }
    
}
