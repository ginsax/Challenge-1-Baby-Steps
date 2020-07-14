package calculator_integer;

import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IntegerCalculatorApp extends Application {
	
	private class Controller extends AnchorPane {
		
		public Controller() {
			super();
			
			final VBox vbox = new VBox();
			// set anchors
			AnchorPane.setTopAnchor(vbox,
			                        0.0);
			AnchorPane.setRightAnchor(vbox,
			                          0.0);
			AnchorPane.setBottomAnchor(vbox,
			                           0.0);
			AnchorPane.setLeftAnchor(vbox,
			                         0.0);
			
			// setup vbox
			vbox.setSpacing(5.0);
			vbox.setPadding(new Insets(5.0));
			vbox.setAlignment(Pos.CENTER_LEFT);
			
			// addition section
			final CalculationBox_Integer boxAddition = new CalculationBox_Integer();
			
			boxAddition.inputValue_01().addListener(e -> {
				add(boxAddition);
			});
			boxAddition.inputValue_02().addListener(e -> {
				add(boxAddition);
			});
			
			// subtraction section
			final CalculationBox_Integer boxSubtraction = new CalculationBox_Integer();
			
			boxSubtraction.inputValue_01().addListener(e -> {
				subtract(boxSubtraction);
			});
			boxSubtraction.inputValue_02().addListener(e -> {
				subtract(boxSubtraction);
			});
			
			// multiplication section
			final CalculationBox_Integer boxMultiplication = new CalculationBox_Integer();
			
			boxMultiplication.inputValue_01().addListener(e -> {
				multiply(boxMultiplication);
			});
			boxMultiplication.inputValue_02().addListener(e -> {
				multiply(boxMultiplication);
			});
			
			// division section
			final CalculationBox_Integer boxDivision = new CalculationBox_Integer();
			
			boxDivision.inputValue_01().addListener(e -> {
				divide(boxDivision);
			});
			boxDivision.inputValue_02().addListener(e -> {
				divide(boxDivision);
			});
			
			final BorderPane buttonPane = new BorderPane();
			final Button buttonRandomize = new Button("Randomize");
			final Button buttonClear = new Button("Clear");
			
			buttonRandomize.setOnAction(e -> {
				final Random random = new Random();
				
				boxAddition.inputValue_01().set(random.nextInt(10));
				boxAddition.inputValue_02().set(random.nextInt(10));
				boxSubtraction.inputValue_01().set(random.nextInt(10));
				boxSubtraction.inputValue_02().set(random.nextInt(10));
				boxMultiplication.inputValue_01().set(random.nextInt(10));
				boxMultiplication.inputValue_02().set(random.nextInt(10));
				boxDivision.inputValue_01().set(random.nextInt(10));
				boxDivision.inputValue_02().set(random.nextInt(10));
			});
			
			buttonClear.setOnAction(e -> {
				boxAddition.inputValue_01().set(0);
				boxAddition.inputValue_02().set(0);
				boxSubtraction.inputValue_01().set(0);
				boxSubtraction.inputValue_02().set(0);
				boxMultiplication.inputValue_01().set(0);
				boxMultiplication.inputValue_02().set(0);
				boxDivision.inputValue_01().set(0);
				boxDivision.inputValue_02().set(0);
			});
			
			buttonPane.setLeft(buttonRandomize);
			buttonPane.setRight(buttonClear);
			
			vbox.getChildren().addAll(new Label("addition"),
			                          boxAddition,
			                          new Label("subtraction"),
			                          boxSubtraction,
			                          new Label("multiplication"),
			                          boxMultiplication,
			                          new Label("division"),
			                          boxDivision,
			                          buttonPane);
			getChildren().add(vbox);
		}
		
		private void add(final CalculationBox_Integer calculationBox) {
			final int input_0 = calculationBox.inputValue_01().get();
			final int input_1 = calculationBox.inputValue_02().get();
			
			final int result = new IntegerCalculator().add(input_0, input_1);
					
			calculationBox.outputValue().setValue(result);
		}
		
		private void subtract(final CalculationBox_Integer calculationBox) {
			final int input_0 = calculationBox.inputValue_01().get();
			final int input_1 = calculationBox.inputValue_02().get();
			
			final int result = new IntegerCalculator().subtract(input_0, input_1);
					
			calculationBox.outputValue().setValue(result);
		}
		
		private void multiply(final CalculationBox_Integer calculationBox) {
			final int input_0 = calculationBox.inputValue_01().get();
			final int input_1 = calculationBox.inputValue_02().get();
			
			final int result = new IntegerCalculator().multiply(input_0, input_1);
					
			calculationBox.outputValue().setValue(result);
		}
		
		private void divide(final CalculationBox_Integer calculationBox) {
			final int input_0 = calculationBox.inputValue_01().get();
			final int input_1 = calculationBox.inputValue_02().get();
			
			final int result = new IntegerCalculator().divide(input_0, input_1);
					
			calculationBox.outputValue().setValue(result);
		}
	}
	
	
	@Override
	public void start(final Stage stage) throws Exception {
		final Controller controller = new Controller();
		final Scene scene = new Scene(controller);
		
		stage.setScene(scene);
		stage.setTitle("Calculator - Integer");
		stage.show();
		stage.centerOnScreen();
	}
	
	public static void main(final String[] args) {
		Application.launch(args);
	}
}