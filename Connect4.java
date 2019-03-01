

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

//1. Change the colors
//2. Repeat button usage
//3. Check for winner
public class Connect4 extends Application {
	int counter = 0;
	//Need 42 of these
	//Boolean[] BRec = new Boolean[] {false, false, false,false, false, false,false, false, false,false, false, false,false, false, false,false, false, false,false, false, false, false, false, false,false, false, false,false, false, false,false, false, false,false, false, false,false, false, false,false, false, false};
	boolean recexb1 = false;
	boolean rec1 = false;
	boolean rec2 = false;
	boolean rec3 = false;
	boolean rec4 = false;
	boolean rec5 = false;
	boolean recexb2 = false;
	boolean rec6 = false;
	boolean rec7 = false;
	boolean rec8 = false;
	boolean rec9 = false;
	boolean rec10 = false;
	boolean recexb3 = false;
	boolean rec11 = false;
	boolean rec12 = false;
	boolean rec13 = false;
	boolean rec14 = false;
	boolean rec15 = false;
	boolean recexb4 = false;
	boolean rec16 = false;
	boolean rec17 = false;
	boolean rec18 = false;
	boolean rec19 = false;
	boolean rec20 = false;
	boolean recexb5 = false;
	boolean rec21 = false;
	boolean rec22 = false;
	boolean rec23 = false;
	boolean rec24 = false;
	boolean rec25 = false;
	boolean recexb6 = false;
	boolean rec26 = false;
	boolean rec27 = false;
	boolean rec28 = false;
	boolean rec29 = false;
	boolean rec30 = false;
	boolean rb71 = false;
	boolean rb72 = false;
	boolean rb73 = false;
	boolean rb74 = false;
	boolean rb75 = false;
	boolean rb76 = false;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		stage.setTitle("Connect 4");
		stage.setResizable(false);
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setVgap(5); 
		gridPane.setHgap(5);
		gridPane.setAlignment(Pos.CENTER);
		// Making the rectangles
		Color Base = Color.rgb(0, 0, 0); //Red
		Rectangle rectangleBase = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangleBase.setArcWidth(20.0); 
		rectangleBase.setArcHeight(20.0);
		rectangleBase.setFill(Base);

		Rectangle rectangle1 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle1.setArcWidth(20.0); 
		rectangle1.setArcHeight(20.0);

		Rectangle rectangle2 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle2.setArcWidth(20.0); 
		rectangle2.setArcHeight(20.0);

		Rectangle rectangle3 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle3.setArcWidth(20.0); 
		rectangle3.setArcHeight(20.0);

		Rectangle rectangle4 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle4.setArcWidth(20.0); 
		rectangle4.setArcHeight(20.0);

		Rectangle rectangle5 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle5.setArcWidth(20.0); 
		rectangle5.setArcHeight(20.0);

		Rectangle rectangle6 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle6.setArcWidth(20.0); 
		rectangle6.setArcHeight(20.0);

		Rectangle rectangle7 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle7.setArcWidth(20.0); 
		rectangle7.setArcHeight(20.0);

		Rectangle rectangle8 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle8.setArcWidth(20.0); 
		rectangle8.setArcHeight(20.0);

		Rectangle rectangle9 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle9.setArcWidth(20.0); 
		rectangle9.setArcHeight(20.0);

		Rectangle rectangle10 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle10.setArcWidth(20.0); 
		rectangle10.setArcHeight(20.0);

		Rectangle rectangle11 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle11.setArcWidth(20.0); 
		rectangle11.setArcHeight(20.0);

		Rectangle rectangle12 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle12.setArcWidth(20.0); 
		rectangle12.setArcHeight(20.0);

		Rectangle rectangle13 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle13.setArcWidth(20.0); 
		rectangle13.setArcHeight(20.0);

		Rectangle rectangle14 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle14.setArcWidth(20.0); 
		rectangle14.setArcHeight(20.0);

		Rectangle rectangle15 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle15.setArcWidth(20.0); 
		rectangle15.setArcHeight(20.0);

		Rectangle rectangle16 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle16.setArcWidth(20.0); 
		rectangle16.setArcHeight(20.0);

		Rectangle rectangle17 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle17.setArcWidth(20.0); 
		rectangle17.setArcHeight(20.0);

		Rectangle rectangle18 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle18.setArcWidth(20.0); 
		rectangle18.setArcHeight(20.0);

		Rectangle rectangle19 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle19.setArcWidth(20.0); 
		rectangle19.setArcHeight(20.0);

		Rectangle rectangle20 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle20.setArcWidth(20.0); 
		rectangle20.setArcHeight(20.0);

		Rectangle rectangle21 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle21.setArcWidth(20.0); 
		rectangle21.setArcHeight(20.0);

		Rectangle rectangle22 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle22.setArcWidth(20.0); 
		rectangle22.setArcHeight(20.0);

		Rectangle rectangle23 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle23.setArcWidth(20.0); 
		rectangle23.setArcHeight(20.0);

		Rectangle rectangle24 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle24.setArcWidth(20.0); 
		rectangle24.setArcHeight(20.0);

		Rectangle rectangle25 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle25.setArcWidth(20.0); 
		rectangle25.setArcHeight(20.0);

		Rectangle rectangle26 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle26.setArcWidth(20.0); 
		rectangle26.setArcHeight(20.0);

		Rectangle rectangle27 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle27.setArcWidth(20.0); 
		rectangle27.setArcHeight(20.0);

		Rectangle rectangle28 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle28.setArcWidth(20.0); 
		rectangle28.setArcHeight(20.0);

		Rectangle rectangle29 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle29.setArcWidth(20.0); 
		rectangle29.setArcHeight(20.0);

		Rectangle rectangle30 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		rectangle30.setArcWidth(20.0); 
		rectangle30.setArcHeight(20.0);

		Rectangle recex1 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		recex1.setArcWidth(20.0); 
		recex1.setArcHeight(20.0);

		Rectangle recex2 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		recex2.setArcWidth(20.0); 
		recex2.setArcHeight(20.0);

		Rectangle recex3 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		recex3.setArcWidth(20.0); 
		recex3.setArcHeight(20.0);

		Rectangle recex4 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		recex4.setArcWidth(20.0); 
		recex4.setArcHeight(20.0);

		Rectangle recex5 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		recex5.setArcWidth(20.0); 
		recex5.setArcHeight(20.0);

		Rectangle recex6 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		recex6.setArcWidth(20.0); 
		recex6.setArcHeight(20.0);

		Rectangle r71 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		r71.setArcWidth(20.0); 
		r71.setArcHeight(20.0);

		Rectangle r72 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		r72.setArcWidth(20.0); 
		r72.setArcHeight(20.0);

		Rectangle r73 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		r73.setArcWidth(20.0); 
		r73.setArcHeight(20.0);

		Rectangle r74 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		r74.setArcWidth(20.0); 
		r74.setArcHeight(20.0);

		Rectangle r75 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		r75.setArcWidth(20.0); 
		r75.setArcHeight(20.0);

		Rectangle r76 = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		r76.setArcWidth(20.0); 
		r76.setArcHeight(20.0);

		//Name of the buttons
		Button first = new Button("1"); 
		Button second = new Button("2");
		Button third = new Button("3");
		Button fourth = new Button("4");
		Button fifth = new Button("5");
		Button sixth = new Button("6");
		Button seventh = new Button("7");
		//Size of the buttons
		first.setMaxSize(100, 200);
		second.setMaxSize(100, 200);
		third.setMaxSize(100, 200);
		fourth.setMaxSize(100, 200);
		fifth.setMaxSize(100, 200);
		sixth.setMaxSize(100, 200);
		seventh.setMaxSize(100, 200);
		//Location of the buttons
		gridPane.add(first, 1, 1);       
		gridPane.add(second, 2, 1);
		gridPane.add(third, 3, 1);
		gridPane.add(fourth, 4, 1);
		gridPane.add(fifth, 5, 1);
		gridPane.add(sixth, 6, 1);
		gridPane.add(rectangle1, 1, 2);
		gridPane.add(rectangle2, 1, 3);
		gridPane.add(rectangle3, 1, 4);
		gridPane.add(rectangle4, 1, 5);
		gridPane.add(rectangle5, 1, 6);
		gridPane.add(rectangle6, 2, 2);
		gridPane.add(rectangle7, 2, 3);
		gridPane.add(rectangle8, 2, 4);
		gridPane.add(rectangle9, 2, 5);
		gridPane.add(rectangle10, 2, 6);
		gridPane.add(rectangle11, 3, 2);
		gridPane.add(rectangle12, 3, 3);
		gridPane.add(rectangle13, 3, 4);
		gridPane.add(rectangle14, 3, 5);
		gridPane.add(rectangle15, 3, 6);
		gridPane.add(rectangle16, 4, 2);
		gridPane.add(rectangle17, 4, 3);
		gridPane.add(rectangle18, 4, 4);
		gridPane.add(rectangle19, 4, 5);
		gridPane.add(rectangle20, 4, 6);
		gridPane.add(rectangle21, 5, 2);
		gridPane.add(rectangle22, 5, 3);
		gridPane.add(rectangle23, 5, 4);
		gridPane.add(rectangle24, 5, 5);
		gridPane.add(rectangle25, 5, 6);
		gridPane.add(rectangle26, 6, 2);
		gridPane.add(rectangle27, 6, 3);
		gridPane.add(rectangle28, 6, 4);
		gridPane.add(rectangle29, 6, 5);
		gridPane.add(rectangle30, 6, 6);
		gridPane.add(recex1, 1, 7);
		gridPane.add(recex2, 2, 7);
		gridPane.add(recex3, 3, 7);
		gridPane.add(recex4, 4, 7);
		gridPane.add(recex5, 5, 7);
		gridPane.add(recex6, 6, 7);
		gridPane.add(seventh, 7, 1);
		gridPane.add(r71, 7, 2);
		gridPane.add(r72, 7, 3);
		gridPane.add(r73, 7, 4);
		gridPane.add(r74, 7, 5);
		gridPane.add(r75, 7, 6);
		gridPane.add(r76, 7, 7);
		
		//Timer class incorporation
		
		//Colors of the players
		Color P1 = Color.rgb(170, 0, 0); //Red
		Rectangle red = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		red.setArcWidth(20.0); 
		red.setArcHeight(20.0);
		red.setFill(P1);

		Color P2 = Color.rgb(255, 255, 51); //Yellow
		Rectangle yellow = new Rectangle(150.0f, 75.0f, 60.0f, 60.0f);
		yellow.setArcWidth(20.0); 
		yellow.setArcHeight(20.0);
		yellow.setFill(P2);

		//Label to print who wins
		Label Win = new Label("    Play");
		Win.setFont(Font.font("Cambria", 14));
		Win.setWrapText(false);
		gridPane.add(Win, 4, 10);

		Label P1L = new Label("P1 = Red");
		Win.setFont(Font.font("Cambria", 14));
		Win.setWrapText(false);
		gridPane.add(P1L, 3, 10);
		
		Label P2L = new Label("P2 = Yel");
		Win.setFont(Font.font("Cambria", 14));
		Win.setWrapText(false);
		gridPane.add(P2L, 5, 10);
		
		Color r = (Color) red.getFill();
		Color y = (Color) yellow.getFill();
		// Win Checker


		//Testing the actions
		first.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				boolean button1 = true;
				while (button1 == true) {
					if ((!(recex1.equals(rectangleBase))) && counter%2==0 && recexb1==false) {
						recex1.setFill(P1);
						recexb1=true;
						counter++;
						if (((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle5.getFill() == r) && (rectangle4.getFill() == r) && (rectangle3.getFill() == r)) || 
								((rectangle5.getFill() == r) && (rectangle4.getFill() == r) && (rectangle3.getFill() == r) && (rectangle2.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle3.getFill() == r) && (rectangle2.getFill() == r) && (rectangle1.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}


					if((!(recex1.equals(rectangleBase))) && ((counter%2==1)) && recexb1==false) {
						recex1.setFill(P2);
						recexb1=true;
						counter++;
						if (((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle5.getFill() == y) && (rectangle4.getFill() == y) && (rectangle3.getFill() == y)) || 
								((rectangle5.getFill() == y) && (rectangle4.getFill() == y) && (rectangle3.getFill() == y) && (rectangle2.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle3.getFill() == y) && (rectangle2.getFill() == y) && (rectangle1.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");	
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle5.equals(rectangleBase))) && counter%2==0 && rec5==false && recexb1 ==true) {
						rectangle5.setFill(P1);
						rec5=true;
						counter++;
						if (((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle5.getFill() == r) && (rectangle4.getFill() == r) && (rectangle3.getFill() == r)) || 
								((rectangle5.getFill() == r) && (rectangle4.getFill() == r) && (rectangle3.getFill() == r) && (rectangle2.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle3.getFill() == r) && (rectangle2.getFill() == r) && (rectangle1.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle5.equals(rectangleBase))) && ((counter%2==1)) && rec5==false && recexb1 ==true) {
						rectangle5.setFill(P2);
						rec5=true;
						counter++;
						if (((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle5.getFill() == y) && (rectangle4.getFill() == y) && (rectangle3.getFill() == y)) || 
								((rectangle5.getFill() == y) && (rectangle4.getFill() == y) && (rectangle3.getFill() == y) && (rectangle2.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle3.getFill() == y) && (rectangle2.getFill() == y) && (rectangle1.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");	
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle4.equals(rectangleBase))) && counter%2==0 && rec4==false && rec5==true && recexb1 ==true) {
						rectangle4.setFill(P1);
						rec4=true;
						counter++;
						if (((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle5.getFill() == r) && (rectangle4.getFill() == r) && (rectangle3.getFill() == r)) || 
								((rectangle5.getFill() == r) && (rectangle4.getFill() == r) && (rectangle3.getFill() == r) && (rectangle2.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle3.getFill() == r) && (rectangle2.getFill() == r) && (rectangle1.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;

					}
					if((!(rectangle4.equals(rectangleBase))) && ((counter%2==1)) && rec4==false && rec5==true && recexb1 ==true) {
						rectangle4.setFill(P2);
						rec4=true;
						counter++;
						if (((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle5.getFill() == y) && (rectangle4.getFill() == y) && (rectangle3.getFill() == y)) || 
								((rectangle5.getFill() == y) && (rectangle4.getFill() == y) && (rectangle3.getFill() == y) && (rectangle2.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle3.getFill() == y) && (rectangle2.getFill() == y) && (rectangle1.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");	
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle3.equals(rectangleBase))) && counter%2==0 && rec3==false && rec4==true && rec5==true && recexb1 ==true) {
						rectangle3.setFill(P1);
						rec3=true;
						counter++;
						if (((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle5.getFill() == r) && (rectangle4.getFill() == r) && (rectangle3.getFill() == r)) || 
								((rectangle5.getFill() == r) && (rectangle4.getFill() == r) && (rectangle3.getFill() == r) && (rectangle2.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle3.getFill() == r) && (rectangle2.getFill() == r) && (rectangle1.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle3.equals(rectangleBase))) && ((counter%2==1)) && rec3==false && rec4==true && rec5==true && recexb1 ==true) {
						rectangle3.setFill(P2);
						rec3=true;
						counter++;
						if (((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle5.getFill() == y) && (rectangle4.getFill() == y) && (rectangle3.getFill() == y)) || 
								((rectangle5.getFill() == y) && (rectangle4.getFill() == y) && (rectangle3.getFill() == y) && (rectangle2.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle3.getFill() == y) && (rectangle2.getFill() == y) && (rectangle1.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");	
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle2.equals(rectangleBase))) && counter%2==0 && rec2==false && rec3==true && rec4==true && rec5==true && recexb1 ==true) {
						rectangle2.setFill(P1);
						rec2=true;
						counter++;
						if (((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle5.getFill() == r) && (rectangle4.getFill() == r) && (rectangle3.getFill() == r)) || 
								((rectangle5.getFill() == r) && (rectangle4.getFill() == r) && (rectangle3.getFill() == r) && (rectangle2.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle3.getFill() == r) && (rectangle2.getFill() == r) && (rectangle1.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle2.equals(rectangleBase))) && ((counter%2==1)) && rec2==false && rec3==true && rec4==true && rec5==true && recexb1 ==true) {
						rectangle2.setFill(P2);
						rec2=true;
						counter++;
						if (((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle5.getFill() == y) && (rectangle4.getFill() == y) && (rectangle3.getFill() == y)) || 
								((rectangle5.getFill() == y) && (rectangle4.getFill() == y) && (rectangle3.getFill() == y) && (rectangle2.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle3.getFill() == y) && (rectangle2.getFill() == y) && (rectangle1.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");	
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle1.equals(rectangleBase))) && counter%2==0 && rec1==false && rec2==true && rec3==true && rec4==true && rec5==true && recexb1 ==true) {
						rectangle1.setFill(P1);
						rec1=true;
						counter++;
						if (((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle5.getFill() == r) && (rectangle4.getFill() == r) && (rectangle3.getFill() == r)) || 
								((rectangle5.getFill() == r) && (rectangle4.getFill() == r) && (rectangle3.getFill() == r) && (rectangle2.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle3.getFill() == r) && (rectangle2.getFill() == r) && (rectangle1.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle1.equals(rectangleBase))) && ((counter%2==1)) && rec1==false && rec2==true && rec3==true && rec4==true && rec5==true && recexb1 ==true) {
						rectangle1.setFill(P2);
						rec1=true;
						counter++;
						if (((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle5.getFill() == y) && (rectangle4.getFill() == y) && (rectangle3.getFill() == y)) || 
								((rectangle5.getFill() == y) && (rectangle4.getFill() == y) && (rectangle3.getFill() == y) && (rectangle2.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle3.getFill() == y) && (rectangle2.getFill() == y) && (rectangle1.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");	
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
					}
					button1 = false;
				}
			} 

		});
		second.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				boolean button1 = true;
				while (button1 == true) {
					if ((!(recex2.equals(rectangleBase))) && counter%2==0 && recexb2==false) {
						recex2.setFill(P1);
						recexb2=true;
						counter++;
						if (((recex2.getFill() == r) && (rectangle10.getFill() == r) && (rectangle9.getFill() == r) && (rectangle8.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle9.getFill() == r) && (rectangle8.getFill() == r) && (rectangle7.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle8.getFill() == r) && (rectangle7.getFill() == r) && (rectangle6.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r)) ||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(recex2.equals(rectangleBase))) && ((counter%2==1)) && recexb2==false) {
						recex2.setFill(P2);
						recexb2=true;
						counter++;
						if (((recex2.getFill() == y) && (rectangle10.getFill() == y) && (rectangle9.getFill() == y) && (rectangle8.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle9.getFill() == y) && (rectangle8.getFill() == y) && (rectangle7.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle8.getFill() == y) && (rectangle7.getFill() == y) && (rectangle6.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y)) ||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}	
					if ((!(rectangle10.equals(rectangleBase))) && counter%2==0 && rec10==false && recexb2 ==true) {
						rectangle10.setFill(P1);
						rec10=true;
						counter++;
						if (((recex2.getFill() == r) && (rectangle10.getFill() == r) && (rectangle9.getFill() == r) && (rectangle8.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle9.getFill() == r) && (rectangle8.getFill() == r) && (rectangle7.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle8.getFill() == r) && (rectangle7.getFill() == r) && (rectangle6.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r)) ||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle10.equals(rectangleBase))) && ((counter%2==1)) && rec10==false && recexb2 ==true) {
						rectangle10.setFill(P2);
						rec10=true;
						counter++;
						if (((recex2.getFill() == y) && (rectangle10.getFill() == y) && (rectangle9.getFill() == y) && (rectangle8.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle9.getFill() == y) && (rectangle8.getFill() == y) && (rectangle7.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle8.getFill() == y) && (rectangle7.getFill() == y) && (rectangle6.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y)) ||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle9.equals(rectangleBase))) && counter%2==0 && rec9==false && rec10==true && recexb2 ==true) {
						rectangle9.setFill(P1);
						rec9=true;
						counter++;
						if (((recex2.getFill() == r) && (rectangle10.getFill() == r) && (rectangle9.getFill() == r) && (rectangle8.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle9.getFill() == r) && (rectangle8.getFill() == r) && (rectangle7.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle8.getFill() == r) && (rectangle7.getFill() == r) && (rectangle6.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r)) ||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle9.equals(rectangleBase))) && ((counter%2==1)) && rec9==false && rec10==true && recexb2 ==true) {
						rectangle9.setFill(P2);
						rec9=true;
						counter++;
						if (((recex2.getFill() == y) && (rectangle10.getFill() == y) && (rectangle9.getFill() == y) && (rectangle8.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle9.getFill() == y) && (rectangle8.getFill() == y) && (rectangle7.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle8.getFill() == y) && (rectangle7.getFill() == y) && (rectangle6.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y)) ||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle8.equals(rectangleBase))) && counter%2==0 && rec8==false && rec9==true && rec10==true && recexb2 ==true) {
						rectangle8.setFill(P1);
						rec8=true;
						counter++;
						if (((recex2.getFill() == r) && (rectangle10.getFill() == r) && (rectangle9.getFill() == r) && (rectangle8.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle9.getFill() == r) && (rectangle8.getFill() == r) && (rectangle7.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle8.getFill() == r) && (rectangle7.getFill() == r) && (rectangle6.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r)) ||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle8.equals(rectangleBase))) && ((counter%2==1)) && rec8==false && rec9==true && rec10==true && recexb2 ==true) {
						rectangle8.setFill(P2);
						rec8=true;
						counter++;
						if (((recex2.getFill() == y) && (rectangle10.getFill() == y) && (rectangle9.getFill() == y) && (rectangle8.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle9.getFill() == y) && (rectangle8.getFill() == y) && (rectangle7.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle8.getFill() == y) && (rectangle7.getFill() == y) && (rectangle6.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y)) ||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle7.equals(rectangleBase))) && counter%2==0 && rec7==false && rec8==true && rec9==true && rec10==true && recexb2 ==true) {
						rectangle7.setFill(P1);
						rec7=true;
						counter++;
						if (((recex2.getFill() == r) && (rectangle10.getFill() == r) && (rectangle9.getFill() == r) && (rectangle8.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle9.getFill() == r) && (rectangle8.getFill() == r) && (rectangle7.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle8.getFill() == r) && (rectangle7.getFill() == r) && (rectangle6.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r)) ||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle7.equals(rectangleBase))) && ((counter%2==1)) && rec7==false && rec8==true && rec9==true && rec10==true && recexb2 ==true) {
						rectangle7.setFill(P2);
						rec7=true;
						counter++;
						if (((recex2.getFill() == y) && (rectangle10.getFill() == y) && (rectangle9.getFill() == y) && (rectangle8.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle9.getFill() == y) && (rectangle8.getFill() == y) && (rectangle7.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle8.getFill() == y) && (rectangle7.getFill() == y) && (rectangle6.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y)) ||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle6.equals(rectangleBase))) && counter%2==0 && rec6==false && rec7==true && rec8==true && rec9==true && rec10==true && recexb2 ==true) {
						rectangle6.setFill(P1);
						rec6=true;
						counter++;
						if (((recex2.getFill() == r) && (rectangle10.getFill() == r) && (rectangle9.getFill() == r) && (rectangle8.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle9.getFill() == r) && (rectangle8.getFill() == r) && (rectangle7.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle8.getFill() == r) && (rectangle7.getFill() == r) && (rectangle6.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r)) ||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle6.equals(rectangleBase))) && ((counter%2==1)) && rec6==false && rec7==true && rec8==true && rec9==true && rec10==true && recexb2 ==true) {
						rectangle6.setFill(P2);
						rec6=true;
						counter++;
						if (((recex2.getFill() == y) && (rectangle10.getFill() == y) && (rectangle9.getFill() == y) && (rectangle8.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle9.getFill() == y) && (rectangle8.getFill() == y) && (rectangle7.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle8.getFill() == y) && (rectangle7.getFill() == y) && (rectangle6.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y)) ||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);

						}
					}
					button1 = false;
				}
			} 

		});

		third.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				boolean button1 = true;
				while (button1 == true) {
					if ((!(recex3.equals(rectangleBase))) && counter%2==0 && recexb3==false) {
						recex3.setFill(P1);
						recexb3=true;
						counter++;
						if (((recex3.getFill() == r) && (rectangle15.getFill() == r) && (rectangle14.getFill() == r) && (rectangle13.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle14.getFill() == r) && (rectangle13.getFill() == r) && (rectangle12.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle13.getFill() == r) && (rectangle12.getFill() == r) && (rectangle11.getFill() == r)) ||	
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;

					}
					if((!(recex3.equals(rectangleBase))) && ((counter%2==1)) && recexb3==false) {
						recex3.setFill(P2);
						recexb3=true;
						counter++;
						if (((recex3.getFill() == y) && (rectangle15.getFill() == y) && (rectangle14.getFill() == y) && (rectangle13.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle14.getFill() == y) && (rectangle13.getFill() == y) && (rectangle12.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle13.getFill() == y) && (rectangle12.getFill() == y) && (rectangle11.getFill() == y)) ||	
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle15.equals(rectangleBase))) && counter%2==0 && rec15==false && recexb3 ==true) {
						rectangle15.setFill(P1);
						rec15=true;
						counter++;
						if (((recex3.getFill() == r) && (rectangle15.getFill() == r) && (rectangle14.getFill() == r) && (rectangle13.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle14.getFill() == r) && (rectangle13.getFill() == r) && (rectangle12.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle13.getFill() == r) && (rectangle12.getFill() == r) && (rectangle11.getFill() == r)) ||	
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;

					}
					if((!(rectangle15.equals(rectangleBase))) && ((counter%2==1)) && rec15==false && recexb3 ==true) {
						rectangle15.setFill(P2);
						rec15=true;
						counter++;
						if (((recex3.getFill() == y) && (rectangle15.getFill() == y) && (rectangle14.getFill() == y) && (rectangle13.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle14.getFill() == y) && (rectangle13.getFill() == y) && (rectangle12.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle13.getFill() == y) && (rectangle12.getFill() == y) && (rectangle11.getFill() == y)) ||	
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle14.equals(rectangleBase))) && counter%2==0 && rec14==false && rec15==true && recexb3 ==true) {
						rectangle14.setFill(P1);
						rec14=true;
						counter++;
						if (((recex3.getFill() == r) && (rectangle15.getFill() == r) && (rectangle14.getFill() == r) && (rectangle13.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle14.getFill() == r) && (rectangle13.getFill() == r) && (rectangle12.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle13.getFill() == r) && (rectangle12.getFill() == r) && (rectangle11.getFill() == r)) ||	
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;

					}
					if((!(rectangle14.equals(rectangleBase))) && ((counter%2==1)) && rec14==false && rec15==true && recexb3 ==true) {
						rectangle14.setFill(P2);
						rec14=true;
						counter++;
						if (((recex3.getFill() == y) && (rectangle15.getFill() == y) && (rectangle14.getFill() == y) && (rectangle13.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle14.getFill() == y) && (rectangle13.getFill() == y) && (rectangle12.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle13.getFill() == y) && (rectangle12.getFill() == y) && (rectangle11.getFill() == y)) ||	
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle13.equals(rectangleBase))) && counter%2==0 && rec13==false && rec14==true && rec15==true && recexb3 ==true) {
						rectangle13.setFill(P1);
						rec13=true;
						counter++;
						if (((recex3.getFill() == r) && (rectangle15.getFill() == r) && (rectangle14.getFill() == r) && (rectangle13.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle14.getFill() == r) && (rectangle13.getFill() == r) && (rectangle12.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle13.getFill() == r) && (rectangle12.getFill() == r) && (rectangle11.getFill() == r)) ||	
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;

					}
					if((!(rectangle13.equals(rectangleBase))) && ((counter%2==1)) && rec13==false && rec14==true && rec15==true && recexb3 ==true) {
						rectangle13.setFill(P2);
						rec13=true;
						counter++;
						if (((recex3.getFill() == y) && (rectangle15.getFill() == y) && (rectangle14.getFill() == y) && (rectangle13.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle14.getFill() == y) && (rectangle13.getFill() == y) && (rectangle12.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle13.getFill() == y) && (rectangle12.getFill() == y) && (rectangle11.getFill() == y)) ||	
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle12.equals(rectangleBase))) && counter%2==0 && rec12==false && rec13==true && rec14==true && rec15==true && recexb3 ==true) {
						rectangle12.setFill(P1);
						rec12=true;
						counter++;
						if (((recex3.getFill() == r) && (rectangle15.getFill() == r) && (rectangle14.getFill() == r) && (rectangle13.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle14.getFill() == r) && (rectangle13.getFill() == r) && (rectangle12.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle13.getFill() == r) && (rectangle12.getFill() == r) && (rectangle11.getFill() == r)) ||	
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;

					}
					if((!(rectangle12.equals(rectangleBase))) && ((counter%2==1)) && rec12==false && rec13==true && rec14==true && rec15==true && recexb3 ==true) {
						rectangle12.setFill(P2);
						rec12=true;
						counter++;
						if (((recex3.getFill() == y) && (rectangle15.getFill() == y) && (rectangle14.getFill() == y) && (rectangle13.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle14.getFill() == y) && (rectangle13.getFill() == y) && (rectangle12.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle13.getFill() == y) && (rectangle12.getFill() == y) && (rectangle11.getFill() == y)) ||	
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle11.equals(rectangleBase))) && counter%2==0 && rec11==false && rec12==true && rec13==true && rec14==true && rec15==true && recexb3 ==true) {
						rectangle11.setFill(P1);
						rec11=true;
						counter++;
						if (((recex3.getFill() == r) && (rectangle15.getFill() == r) && (rectangle14.getFill() == r) && (rectangle13.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle14.getFill() == r) && (rectangle13.getFill() == r) && (rectangle12.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle13.getFill() == r) && (rectangle12.getFill() == r) && (rectangle11.getFill() == r)) ||	
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;

					}
					if((!(rectangle11.equals(rectangleBase))) && ((counter%2==1)) && rec11==false && rec12==true && rec13==true && rec14==true && rec15==true && recexb3 ==true) {
						rectangle11.setFill(P2);
						rec11=true;
						counter++;
						if (((recex3.getFill() == y) && (rectangle15.getFill() == y) && (rectangle14.getFill() == y) && (rectangle13.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle14.getFill() == y) && (rectangle13.getFill() == y) && (rectangle12.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle13.getFill() == y) && (rectangle12.getFill() == y) && (rectangle11.getFill() == y)) ||	
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					button1 = false;
				}
			} 

		});
		fourth.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				boolean button1 = true;
				while (button1 == true) {
					if ((!(recex4.equals(rectangleBase))) && counter%2==0 && recexb4==false) {
						recex4.setFill(P1);
						recexb4=true;
						counter++;
						if (((recex4.getFill() == r) && (rectangle20.getFill() == r) && (rectangle19.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle19.getFill() == r) && (rectangle18.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle18.getFill() == r) && (rectangle17.getFill() == r) && (rectangle16.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(recex4.equals(rectangleBase))) && ((counter%2==1)) && recexb4==false) {
						recex4.setFill(P2);
						recexb4=true;
						counter++;
						if (((recex4.getFill() == y) && (rectangle20.getFill() == y) && (rectangle19.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle19.getFill() == y) && (rectangle18.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle18.getFill() == y) && (rectangle17.getFill() == y) && (rectangle16.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle20.equals(rectangleBase))) && counter%2==0 && rec20==false && recexb4 ==true) {
						rectangle20.setFill(P1);
						rec20=true;
						counter++;
						if (((recex4.getFill() == r) && (rectangle20.getFill() == r) && (rectangle19.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle19.getFill() == r) && (rectangle18.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle18.getFill() == r) && (rectangle17.getFill() == r) && (rectangle16.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle20.equals(rectangleBase))) && ((counter%2==1)) && rec20==false && recexb4 ==true) {
						rectangle20.setFill(P2);
						rec20=true;
						counter++;
						if (((recex4.getFill() == y) && (rectangle20.getFill() == y) && (rectangle19.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle19.getFill() == y) && (rectangle18.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle18.getFill() == y) && (rectangle17.getFill() == y) && (rectangle16.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle19.equals(rectangleBase))) && counter%2==0 && rec19==false && rec20==true && recexb4 ==true) {
						rectangle19.setFill(P1);
						rec19=true;
						counter++;
						if (((recex4.getFill() == r) && (rectangle20.getFill() == r) && (rectangle19.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle19.getFill() == r) && (rectangle18.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle18.getFill() == r) && (rectangle17.getFill() == r) && (rectangle16.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle19.equals(rectangleBase))) && ((counter%2==1)) && rec19==false && rec20==true && recexb4 ==true) {
						rectangle19.setFill(P2);
						rec19=true;
						counter++;
						if (((recex4.getFill() == y) && (rectangle20.getFill() == y) && (rectangle19.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle19.getFill() == y) && (rectangle18.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle18.getFill() == y) && (rectangle17.getFill() == y) && (rectangle16.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle18.equals(rectangleBase))) && counter%2==0 && rec18==false && rec19==true && rec20==true && recexb4 ==true) {
						rectangle18.setFill(P1);
						rec18=true;
						counter++;
						if (((recex4.getFill() == r) && (rectangle20.getFill() == r) && (rectangle19.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle19.getFill() == r) && (rectangle18.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle18.getFill() == r) && (rectangle17.getFill() == r) && (rectangle16.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle18.equals(rectangleBase))) && ((counter%2==1)) && rec18==false && rec19==true && rec20==true && recexb4 ==true) {
						rectangle18.setFill(P2);
						rec18=true;
						counter++;
						if (((recex4.getFill() == y) && (rectangle20.getFill() == y) && (rectangle19.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle19.getFill() == y) && (rectangle18.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle18.getFill() == y) && (rectangle17.getFill() == y) && (rectangle16.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle17.equals(rectangleBase))) && counter%2==0 && rec17==false && rec18==true && rec19==true && rec20==true && recexb4 ==true) {
						rectangle17.setFill(P1);
						rec17=true;
						counter++;
						if (((recex4.getFill() == r) && (rectangle20.getFill() == r) && (rectangle19.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle19.getFill() == r) && (rectangle18.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle18.getFill() == r) && (rectangle17.getFill() == r) && (rectangle16.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle17.equals(rectangleBase))) && ((counter%2==1)) && rec17==false && rec18==true && rec19==true && rec20==true && recexb4 ==true) {
						rectangle17.setFill(P2);
						rec17=true;
						counter++;
						if (((recex4.getFill() == y) && (rectangle20.getFill() == y) && (rectangle19.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle19.getFill() == y) && (rectangle18.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle18.getFill() == y) && (rectangle17.getFill() == y) && (rectangle16.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						};
					}
					if ((!(rectangle16.equals(rectangleBase))) && counter%2==0 && rec16==false && rec17==true && rec18==true && rec19==true && rec20==true && recexb4 ==true) {
						rectangle16.setFill(P1);
						rec16=true;
						counter++;
						if (((recex4.getFill() == r) && (rectangle20.getFill() == r) && (rectangle19.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle19.getFill() == r) && (rectangle18.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle18.getFill() == r) && (rectangle17.getFill() == r) && (rectangle16.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() ==r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((recex1.getFill() == r) && (recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r)) ||
								((recex1.getFill() == r) && (rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle5.getFill() == r) && (rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle8.getFill() == r) && (rectangle12.getFill() == r) && (rectangle16.getFill() == r)) ||
								((rectangle4.getFill() == r) && (rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r)) ||
								((rectangle3.getFill() == r) && (rectangle9.getFill() == r) && (rectangle15.getFill() == r) && (recex4.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r)) ||
								((rectangle2.getFill() == r) && (rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r)) ||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle16.equals(rectangleBase))) && ((counter%2==1)) && rec16==false && rec17==true && rec18==true && rec19==true && rec20==true && recexb4 ==true) {
						rectangle16.setFill(P2);
						rec16=true;
						counter++;
						if (((recex4.getFill() == y) && (rectangle20.getFill() == y) && (rectangle19.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle19.getFill() == y) && (rectangle18.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle18.getFill() == y) && (rectangle17.getFill() == y) && (rectangle16.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))||
								((recex1.getFill() == y) && (recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y)) ||
								((recex1.getFill() == y) && (rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle5.getFill() == y) && (rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle8.getFill() == y) && (rectangle12.getFill() == y) && (rectangle16.getFill() == y)) ||
								((rectangle4.getFill() == y) && (rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y)) ||
								((rectangle3.getFill() == y) && (rectangle9.getFill() == y) && (rectangle15.getFill() == y) && (recex4.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y)) ||
								((rectangle2.getFill() == y) && (rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y)) ||
								((rectangle1.getFill() == y) && (rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					button1 = false;
				}
			} 

		});
		fifth.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				boolean button1 = true;
				while (button1 == true) {
					if ((!(recex5.equals(rectangleBase))) && counter%2==0 && recexb5==false) {
						recex5.setFill(P1);
						recexb5=true;
						counter++;
						if (((recex5.getFill() == r) && (rectangle25.getFill() == r) && (rectangle24.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle25.getFill() == r) && (rectangle24.getFill() == r) && (rectangle23.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle24.getFill() == r) && (rectangle23.getFill() == r) && (rectangle23.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(recex5.equals(rectangleBase))) && ((counter%2==1)) && recexb5==false) {
						recex5.setFill(P2);
						recexb5=true;
						counter++;
						if (((recex5.getFill() == y) && (rectangle25.getFill() == y) && (rectangle24.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle25.getFill() == y) && (rectangle24.getFill() == y) && (rectangle23.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle24.getFill() == y) && (rectangle23.getFill() == y) && (rectangle23.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle25.equals(rectangleBase))) && counter%2==0 && rec25==false && recexb5 ==true) {
						rectangle25.setFill(P1);
						rec25=true;
						counter++;
						if (((recex5.getFill() == r) && (rectangle25.getFill() == r) && (rectangle24.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle25.getFill() == r) && (rectangle24.getFill() == r) && (rectangle23.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle24.getFill() == r) && (rectangle23.getFill() == r) && (rectangle23.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == y) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle25.equals(rectangleBase))) && ((counter%2==1)) && rec25==false && recexb5 ==true) {
						rectangle25.setFill(P2);
						rec25=true;
						counter++;
						if (((recex5.getFill() == y) && (rectangle25.getFill() == y) && (rectangle24.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle25.getFill() == y) && (rectangle24.getFill() == y) && (rectangle23.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle24.getFill() == y) && (rectangle23.getFill() == y) && (rectangle23.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle24.equals(rectangleBase))) && counter%2==0 && rec24==false && rec25==true && recexb5 ==true) {
						rectangle24.setFill(P1);
						rec24=true;
						counter++;
						if (((recex5.getFill() == r) && (rectangle25.getFill() == r) && (rectangle24.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle25.getFill() == r) && (rectangle24.getFill() == r) && (rectangle23.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle24.getFill() == r) && (rectangle23.getFill() == r) && (rectangle23.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == y) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle24.equals(rectangleBase))) && ((counter%2==1)) && rec24==false && rec25==true && recexb5 ==true) {
						rectangle24.setFill(P2);
						rec24=true;
						counter++;
						if (((recex5.getFill() == y) && (rectangle25.getFill() == y) && (rectangle24.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle25.getFill() == y) && (rectangle24.getFill() == y) && (rectangle23.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle24.getFill() == y) && (rectangle23.getFill() == y) && (rectangle23.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle23.equals(rectangleBase))) && counter%2==0 && rec23==false && rec24==true && rec25==true && recexb5 ==true) {
						rectangle23.setFill(P1);
						rec23=true;
						counter++;
						if (((recex5.getFill() == r) && (rectangle25.getFill() == r) && (rectangle24.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle25.getFill() == r) && (rectangle24.getFill() == r) && (rectangle23.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle24.getFill() == r) && (rectangle23.getFill() == r) && (rectangle23.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == y) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle23.equals(rectangleBase))) && ((counter%2==1)) && rec23==false && rec24==true && rec25==true && recexb5 ==true) {
						rectangle23.setFill(P2);
						rec23=true;
						counter++;
						if (((recex5.getFill() == y) && (rectangle25.getFill() == y) && (rectangle24.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle25.getFill() == y) && (rectangle24.getFill() == y) && (rectangle23.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle24.getFill() == y) && (rectangle23.getFill() == y) && (rectangle23.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle22.equals(rectangleBase))) && counter%2==0 && rec22==false && rec23==true && rec24==true && rec25==true && recexb5 ==true) {
						rectangle22.setFill(P1);
						rec22=true;
						counter++;
						if (((recex5.getFill() == r) && (rectangle25.getFill() == r) && (rectangle24.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle25.getFill() == r) && (rectangle24.getFill() == r) && (rectangle23.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle24.getFill() == r) && (rectangle23.getFill() == r) && (rectangle23.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == y) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle22.equals(rectangleBase))) && ((counter%2==1)) && rec22==false && rec23==true && rec24==true && rec25==true && recexb5 ==true) {
						rectangle22.setFill(P2);
						rec17=true;
						counter++;
						if (((recex5.getFill() == y) && (rectangle25.getFill() == y) && (rectangle24.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle25.getFill() == y) && (rectangle24.getFill() == y) && (rectangle23.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle24.getFill() == y) && (rectangle23.getFill() == y) && (rectangle23.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle21.equals(rectangleBase))) && counter%2==0 && rec21==false && rec22==true && rec23==true && rec24==true && rec25==true && recexb5 ==true) {
						rectangle21.setFill(P1);
						rec21=true;
						counter++;
						if (((recex5.getFill() == r) && (rectangle25.getFill() == r) && (rectangle24.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle25.getFill() == r) && (rectangle24.getFill() == r) && (rectangle23.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle24.getFill() == r) && (rectangle23.getFill() == r) && (rectangle23.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == y) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) ||
								((recex2.getFill() == r) && (recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill()== r))||
								((recex2.getFill() == r) && (rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r))||
								((rectangle10.getFill() == r) && (rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r)) ||
								((rectangle10.getFill() == r) && (rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r)) ||
								((rectangle9.getFill() == r) && (rectangle13.getFill() == r) && (rectangle17.getFill() == r) && (rectangle21.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle14.getFill() == r) && (rectangle20.getFill() == r) && (recex5.getFill() == r)) ||
								((rectangle8.getFill() == r) && (rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r)) ||
								((rectangle7.getFill() == r) && (rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r))||
								((rectangle1.getFill() == r) && (rectangle6.getFill() == r) && (rectangle11.getFill() == r) && (rectangle16.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle21.equals(rectangleBase))) && ((counter%2==1)) && rec21==false && rec22==true && rec23==true && rec24==true && rec25==true && recexb5 ==true) {
						rectangle21.setFill(P2);
						rec21=true;
						counter++;
						if (((recex5.getFill() == y) && (rectangle25.getFill() == y) && (rectangle24.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle25.getFill() == y) && (rectangle24.getFill() == y) && (rectangle23.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle24.getFill() == y) && (rectangle23.getFill() == y) && (rectangle23.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle6.getFill() == y) && (rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) ||
								((recex2.getFill() == y) && (recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill()== y))||
								((recex2.getFill() == y) && (rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y))||
								((rectangle10.getFill() == y) && (rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y)) ||
								((rectangle10.getFill() == y) && (rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y)) ||
								((rectangle9.getFill() == y) && (rectangle13.getFill() == y) && (rectangle17.getFill() == y) && (rectangle21.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle14.getFill() == y) && (rectangle20.getFill() == y) && (recex5.getFill() == y)) ||
								((rectangle8.getFill() == y) && (rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y)) ||
								((rectangle7.getFill() == y) && (rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					button1 = false;
				}
			} 

		});
		sixth.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				boolean button1 = true;
				while (button1 == true) {
					if ((!(recex6.equals(rectangleBase))) && counter%2==0 && recexb6==false) {
						recex6.setFill(P1);
						recexb6=true;
						counter++;
						if (((recex6.getFill() == r) && (rectangle30.getFill() == r) && (rectangle29.getFill() == r) && (rectangle28.getFill() == r))||
								((rectangle30.getFill() == r) && (rectangle29.getFill() == r) && (rectangle28.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle29.getFill() == r) && (rectangle28.getFill() == r) && (rectangle27.getFill() == r) && (rectangle26.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) 
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(recex6.equals(rectangleBase))) && ((counter%2==1)) && recexb6==false) {
						recex6.setFill(P2);
						recexb6=true;
						counter++;
						if (((recex6.getFill() == y) && (rectangle30.getFill() == y) && (rectangle29.getFill() == y) && (rectangle28.getFill() == y))||
								((rectangle30.getFill() == y) && (rectangle29.getFill() == y) && (rectangle28.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle29.getFill() == y) && (rectangle28.getFill() == y) && (rectangle27.getFill() == y) && (rectangle26.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) 
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle30.equals(rectangleBase))) && counter%2==0 && rec30==false && recexb6 ==true) {
						rectangle30.setFill(P1);
						rec30=true;
						counter++;
						if (((recex6.getFill() == r) && (rectangle30.getFill() == r) && (rectangle29.getFill() == r) && (rectangle28.getFill() == r))||
								((rectangle30.getFill() == r) && (rectangle29.getFill() == r) && (rectangle28.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle29.getFill() == r) && (rectangle28.getFill() == r) && (rectangle27.getFill() == r) && (rectangle26.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) 
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle30.equals(rectangleBase))) && ((counter%2==1)) && rec30==false && recexb6 ==true) {
						rectangle30.setFill(P2);
						rec30=true;
						counter++;
						if (((recex6.getFill() == y) && (rectangle30.getFill() == y) && (rectangle29.getFill() == y) && (rectangle28.getFill() == y))||
								((rectangle30.getFill() == y) && (rectangle29.getFill() == y) && (rectangle28.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle29.getFill() == y) && (rectangle28.getFill() == y) && (rectangle27.getFill() == y) && (rectangle26.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) 
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle29.equals(rectangleBase))) && counter%2==0 && rec29==false && rec30==true && recexb6 ==true) {
						rectangle29.setFill(P1);
						rec29=true;
						counter++;
						if (((recex6.getFill() == r) && (rectangle30.getFill() == r) && (rectangle29.getFill() == r) && (rectangle28.getFill() == r))||
								((rectangle30.getFill() == r) && (rectangle29.getFill() == r) && (rectangle28.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle29.getFill() == r) && (rectangle28.getFill() == r) && (rectangle27.getFill() == r) && (rectangle26.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) 
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle29.equals(rectangleBase))) && ((counter%2==1)) && rec29==false && rec30==true && recexb6 ==true) {
						rectangle29.setFill(P2);
						rec29=true;
						counter++;
						if (((recex6.getFill() == y) && (rectangle30.getFill() == y) && (rectangle29.getFill() == y) && (rectangle28.getFill() == y))||
								((rectangle30.getFill() == y) && (rectangle29.getFill() == y) && (rectangle28.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle29.getFill() == y) && (rectangle28.getFill() == y) && (rectangle27.getFill() == y) && (rectangle26.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) 
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle28.equals(rectangleBase))) && counter%2==0 && rec28==false && rec29==true && rec30==true && recexb6 ==true) {
						rectangle28.setFill(P1);
						rec28=true;
						counter++;
						if (((recex6.getFill() == r) && (rectangle30.getFill() == r) && (rectangle29.getFill() == r) && (rectangle28.getFill() == r))||
								((rectangle30.getFill() == r) && (rectangle29.getFill() == r) && (rectangle28.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle29.getFill() == r) && (rectangle28.getFill() == r) && (rectangle27.getFill() == r) && (rectangle26.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) 
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle28.equals(rectangleBase))) && ((counter%2==1)) && rec28==false && rec29==true && rec30==true && recexb6 ==true) {
						rectangle28.setFill(P2);
						rec28=true;
						counter++;
						if (((recex6.getFill() == y) && (rectangle30.getFill() == y) && (rectangle29.getFill() == y) && (rectangle28.getFill() == y))||
								((rectangle30.getFill() == y) && (rectangle29.getFill() == y) && (rectangle28.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle29.getFill() == y) && (rectangle28.getFill() == y) && (rectangle27.getFill() == y) && (rectangle26.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) 
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle27.equals(rectangleBase))) && counter%2==0 && rec27==false && rec28==true && rec29==true && rec30==true && recexb6 ==true) {
						rectangle27.setFill(P1);
						rec27=true;
						counter++;
						if (((recex6.getFill() == r) && (rectangle30.getFill() == r) && (rectangle29.getFill() == r) && (rectangle28.getFill() == r))||
								((rectangle30.getFill() == r) && (rectangle29.getFill() == r) && (rectangle28.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle29.getFill() == r) && (rectangle28.getFill() == r) && (rectangle27.getFill() == r) && (rectangle26.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) 
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle27.equals(rectangleBase))) && ((counter%2==1)) && rec27==false && rec28==true && rec29==true && rec30==true && recexb6 ==true) {
						rectangle27.setFill(P2);
						rec27=true;
						counter++;
						if (((recex6.getFill() == y) && (rectangle30.getFill() == y) && (rectangle29.getFill() == y) && (rectangle28.getFill() == y))||
								((rectangle30.getFill() == y) && (rectangle29.getFill() == y) && (rectangle28.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle29.getFill() == y) && (rectangle28.getFill() == y) && (rectangle27.getFill() == y) && (rectangle26.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) 
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(rectangle26.equals(rectangleBase))) && counter%2==0 && rec26==false && rec27==true && rec28==true && rec29==true && rec30==true && recexb6 ==true) {
						rectangle16.setFill(P1);
						rec16=true;
						counter++;
						if (((recex6.getFill() == r) && (rectangle30.getFill() == r) && (rectangle29.getFill() == r) && (rectangle28.getFill() == r))||
								((rectangle30.getFill() == r) && (rectangle29.getFill() == r) && (rectangle28.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle29.getFill() == r) && (rectangle28.getFill() == r) && (rectangle27.getFill() == r) && (rectangle26.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r)) ||
								((recex3.getFill() == r) && (recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r)) ||
								((recex3.getFill() == r) && (rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle15.getFill() == r) && (rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r)) ||
								((rectangle14.getFill() == r) && (rectangle18.getFill() == r) && (rectangle22.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r)) ||
								((rectangle13.getFill() == r) && (rectangle19.getFill() == r) && (rectangle25.getFill() == r) && (recex6.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r)) ||
								((rectangle12.getFill() == r) && (rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r)) ||
								((rectangle11.getFill() == r) && (rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r)) 
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(rectangle26.equals(rectangleBase))) && ((counter%2==1)) && rec26==false && rec27==true && rec28==true && rec29==true && rec30==true && recexb6 ==true) {
						rectangle26.setFill(P2);
						rec26=true;
						counter++;
						if (((recex6.getFill() == y) && (rectangle30.getFill() == y) && (rectangle29.getFill() == y) && (rectangle28.getFill() == y))||
								((rectangle30.getFill() == y) && (rectangle29.getFill() == y) && (rectangle28.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle29.getFill() == y) && (rectangle28.getFill() == y) && (rectangle27.getFill() == y) && (rectangle26.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y)) ||
								((recex3.getFill() == y) && (recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y)) ||
								((recex3.getFill() == y) && (rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle15.getFill() == y) && (rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y)) ||
								((rectangle14.getFill() == y) && (rectangle18.getFill() == y) && (rectangle22.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y)) ||
								((rectangle13.getFill() == y) && (rectangle19.getFill() == y) && (rectangle25.getFill() == y) && (recex6.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y)) ||
								((rectangle12.getFill() == y) && (rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y)) ||
								((rectangle11.getFill() == y) && (rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y)) 
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					button1 = false;
				}
			} 

		});
		seventh.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				boolean button1 = true;
				while (button1 == true) {
					if ((!(r76.equals(rectangleBase))) && counter%2==0 && rb76==false) {
						r76.setFill(P1);
						rb76=true;
						counter++;
						if (((r76.getFill() == r) && (r75.getFill() == r) && (r74.getFill() == r) && (r73.getFill() == r))||
								((r75.getFill() == r) && (r74.getFill() == r) && (r73.getFill() == r) && (r72.getFill() == r)) ||
								((r74.getFill() == r) && (r73.getFill() == r) && (r72.getFill() == r) && (r71.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(r76.equals(rectangleBase))) && ((counter%2==1)) && rb76==false) {
						r76.setFill(P2);
						rb76=true;
						counter++;
						if (((r76.getFill() == y) && (r75.getFill() == y) && (r74.getFill() == y) && (r73.getFill() == y))||
								((r75.getFill() == y) && (r74.getFill() == y) && (r73.getFill() == y) && (r72.getFill() == y)) ||
								((r74.getFill() == y) && (r73.getFill() == y) && (r72.getFill() == y) && (r71.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(r75.equals(rectangleBase))) && counter%2==0 && rb75==false && rb76 ==true) {
						r75.setFill(P1);
						rb75=true;
						counter++;
						if (((r76.getFill() == r) && (r75.getFill() == r) && (r74.getFill() == r) && (r73.getFill() == r))||
								((r75.getFill() == r) && (r74.getFill() == r) && (r73.getFill() == r) && (r72.getFill() == r)) ||
								((r74.getFill() == r) && (r73.getFill() == r) && (r72.getFill() == r) && (r71.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(r75.equals(rectangleBase))) && ((counter%2==1)) && rb75==false && rb76 ==true) {
						r75.setFill(P2);
						rb75=true;
						counter++;
						if (((r76.getFill() == y) && (r75.getFill() == y) && (r74.getFill() == y) && (r73.getFill() == y))||
								((r75.getFill() == y) && (r74.getFill() == y) && (r73.getFill() == y) && (r72.getFill() == y)) ||
								((r74.getFill() == y) && (r73.getFill() == y) && (r72.getFill() == y) && (r71.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(r74.equals(rectangleBase))) && counter%2==0 && rb74==false && rb75==true && rb76 ==true) {
						r74.setFill(P1);
						rb74=true;
						counter++;
						if (((r76.getFill() == r) && (r75.getFill() == r) && (r74.getFill() == r) && (r73.getFill() == r))||
								((r75.getFill() == r) && (r74.getFill() == r) && (r73.getFill() == r) && (r72.getFill() == r)) ||
								((r74.getFill() == r) && (r73.getFill() == r) && (r72.getFill() == r) && (r71.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(r74.equals(rectangleBase))) && ((counter%2==1)) && rb74==false && rb75==true && rb76 ==true) {
						r74.setFill(P2);
						rb74=true;
						counter++;
						if (((r76.getFill() == y) && (r75.getFill() == y) && (r74.getFill() == y) && (r73.getFill() == y))||
								((r75.getFill() == y) && (r74.getFill() == y) && (r73.getFill() == y) && (r72.getFill() == y)) ||
								((r74.getFill() == y) && (r73.getFill() == y) && (r72.getFill() == y) && (r71.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(r73.equals(rectangleBase))) && counter%2==0 && rb73==false && rb74==true && rb75==true && rb76 ==true) {
						r73.setFill(P1);
						rb73=true;
						counter++;
						if (((r76.getFill() == r) && (r75.getFill() == r) && (r74.getFill() == r) && (r73.getFill() == r))||
								((r75.getFill() == r) && (r74.getFill() == r) && (r73.getFill() == r) && (r72.getFill() == r)) ||
								((r74.getFill() == r) && (r73.getFill() == r) && (r72.getFill() == r) && (r71.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(r73.equals(rectangleBase))) && ((counter%2==1)) && rb73==false && rb74==true && rb75==true && rb76 ==true) {
						r73.setFill(P2);
						rb73=true;
						counter++;
						if (((r76.getFill() == y) && (r75.getFill() == y) && (r74.getFill() == y) && (r73.getFill() == y))||
								((r75.getFill() == y) && (r74.getFill() == y) && (r73.getFill() == y) && (r72.getFill() == y)) ||
								((r74.getFill() == y) && (r73.getFill() == y) && (r72.getFill() == y) && (r71.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(r72.equals(rectangleBase))) && counter%2==0 && rb72==false && rb73==true && rb74==true && rb75==true && rb76 ==true) {
						r72.setFill(P1);
						rb72=true;
						counter++;
						if (((r76.getFill() == r) && (r75.getFill() == r) && (r74.getFill() == r) && (r73.getFill() == r))||
								((r75.getFill() == r) && (r74.getFill() == r) && (r73.getFill() == r) && (r72.getFill() == r)) ||
								((r74.getFill() == r) && (r73.getFill() == r) && (r72.getFill() == r) && (r71.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(r72.equals(rectangleBase))) && ((counter%2==1)) && rb72==false && rb73==true && rb74==true && rb75==true && rb76 ==true) {
						r72.setFill(P2);
						rb72=true;
						counter++;
						if (((r76.getFill() == y) && (r75.getFill() == y) && (r74.getFill() == y) && (r73.getFill() == y))||
								((r75.getFill() == y) && (r74.getFill() == y) && (r73.getFill() == y) && (r72.getFill() == y)) ||
								((r74.getFill() == y) && (r73.getFill() == y) && (r72.getFill() == y) && (r71.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if ((!(r71.equals(rectangleBase))) && counter%2==0 && rb71==false && rb72==true && rb73==true && rb74==true && rb75==true && rb76 ==true) {
						r71.setFill(P1);
						rb71=true;
						counter++;
						if (((r76.getFill() == r) && (r75.getFill() == r) && (r74.getFill() == r) && (r73.getFill() == r))||
								((r75.getFill() == r) && (r74.getFill() == r) && (r73.getFill() == r) && (r72.getFill() == r)) ||
								((r74.getFill() == r) && (r73.getFill() == r) && (r72.getFill() == r) && (r71.getFill() == r)) ||
								((recex4.getFill() == r) && (recex5.getFill() == r) && (recex6.getFill() == r) && (r76.getFill() == r)) ||
								((recex4.getFill() == r) && (rectangle25.getFill() == r) && (rectangle29.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle25.getFill() == r) && (rectangle30.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle20.getFill() == r) && (rectangle24.getFill() == r) && (rectangle28.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle24.getFill() == r) && (rectangle29.getFill() == r) && (r74.getFill() == r)) ||
								((rectangle19.getFill() == r) && (rectangle23.getFill() == r) && (rectangle27.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle23.getFill() == r) && (rectangle28.getFill() == r) && (r73.getFill() == r)) ||
								((rectangle18.getFill() == r) && (rectangle24.getFill() == r) && (rectangle30.getFill() == r) && (r76.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle22.getFill() == r) && (rectangle27.getFill() == r) && (r72.getFill() == r)) ||
								((rectangle17.getFill() == r) && (rectangle23.getFill() == r) && (rectangle29.getFill() == r) && (r75.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle21.getFill() == r) && (rectangle26.getFill() == r) && (r71.getFill() == r)) ||
								((rectangle16.getFill() == r) && (rectangle22.getFill() == r) && (rectangle28.getFill() == r) && (r74.getFill() == r))
								){	
							Win.setText("P1 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					if((!(r71.equals(rectangleBase))) && ((counter%2==1)) && rb71==false && rb72==true && rb73==true && rb74==true && rb75==true && rb76 ==true) {
						r71.setFill(P2);
						rb71=true;
						counter++;
						if (((r76.getFill() == y) && (r75.getFill() == y) && (r74.getFill() == y) && (r73.getFill() == y))||
								((r75.getFill() == y) && (r74.getFill() == y) && (r73.getFill() == y) && (r72.getFill() == y)) ||
								((r74.getFill() == y) && (r73.getFill() == y) && (r72.getFill() == y) && (r71.getFill() == y)) ||
								((recex4.getFill() == y) && (recex5.getFill() == y) && (recex6.getFill() == y) && (r76.getFill() == y)) ||
								((recex4.getFill() == y) && (rectangle25.getFill() == y) && (rectangle29.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle25.getFill() == y) && (rectangle30.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle20.getFill() == y) && (rectangle24.getFill() == y) && (rectangle28.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle24.getFill() == y) && (rectangle29.getFill() == y) && (r74.getFill() == y)) ||
								((rectangle19.getFill() == y) && (rectangle23.getFill() == y) && (rectangle27.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle23.getFill() == y) && (rectangle28.getFill() == y) && (r73.getFill() == y)) ||
								((rectangle18.getFill() == y) && (rectangle24.getFill() == y) && (rectangle30.getFill() == y) && (r76.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle22.getFill() == y) && (rectangle27.getFill() == y) && (r72.getFill() == y)) ||
								((rectangle17.getFill() == y) && (rectangle23.getFill() == y) && (rectangle29.getFill() == y) && (r75.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle21.getFill() == y) && (rectangle26.getFill() == y) && (r71.getFill() == y)) ||
								((rectangle16.getFill() == y) && (rectangle22.getFill() == y) && (rectangle28.getFill() == y) && (r74.getFill() == y))
								){	
							Win.setText("P2 Wins");
							first.setDisable(true);
							second.setDisable(true);
							third.setDisable(true);
							fourth.setDisable(true);
							fifth.setDisable(true);
							sixth.setDisable(true);
							seventh.setDisable(true);
						}
						break;
					}
					button1 = false;
				}
			} 

		});


		
		//Activating the whole thing
		Scene scene = new Scene(gridPane);
		stage.setScene(scene);  
		stage.show();
	}
	
}