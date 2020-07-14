package calculator_integer;

import java.util.Objects;

import common.Constants;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.util.converter.NumberStringConverter;

/**
 * Contains the various controls that perform operations.
 * @author jacobwatson
 * @since 07/13/2020
 * @version 1.0
 */
public class CalculationBox_Integer extends HBox {
	private final IntegerProperty mInputValue_01 = new SimpleIntegerProperty();
	private final IntegerProperty mInputValue_02 = new SimpleIntegerProperty();
	private final IntegerProperty mOutputValue = new SimpleIntegerProperty();
	
	private final TextField mInput_01;
	private final TextField mInput_02;
	private final TextField mOutput;
	
	/**
	 * Initializes a new CalculationArea. Sets all fields to their default values.
	 */
	public CalculationBox_Integer() {
		// setup hbox
		setSpacing(5.0);
		setPadding(new Insets(5.0));
		setAlignment(Pos.CENTER_LEFT);
		
		mInput_01 = new TextField();
		mInput_02 = new TextField();
		mOutput = new TextField();
		
//		mOutput.setDisable(true);
		
		mInput_01.textProperty().addListener((obs, ov, nv) -> {
			try {
				if (!Objects.equals(Constants.NullString, nv)) {
					Integer.parseInt(nv);
				}
			}
			catch (NumberFormatException e) {
				mInput_01.setText(ov);
			}
		});
		
		mInput_02.textProperty().addListener((obs, ov, nv) -> {
			try {
				if (!Objects.equals(Constants.NullString, nv)) {
					Integer.parseInt(nv);
				}
			}
			catch (NumberFormatException e) {
				mInput_02.setText(ov);
			}
		});
		
		mOutput.textProperty().addListener((obs, ov, nv) -> {
			try {
				if (!Objects.equals(Constants.NullString, nv)) {
					Integer.parseInt(nv);
				}
			}
			catch (NumberFormatException e) {
				mOutput.setText(ov);
			}
		});
		
		mInput_01.textProperty().bindBidirectional(mInputValue_01, new NumberStringConverter("#"));
		mInput_02.textProperty().bindBidirectional(mInputValue_02, new NumberStringConverter("#"));
		mOutput.textProperty().bindBidirectional(mOutputValue, new NumberStringConverter("#"));
		
		getChildren().clear();
		getChildren().addAll(mInput_01,
		                     new Label("+"),
		                     mInput_02,
		                     new Label("="),
		                     mOutput);
	}
	

	public IntegerProperty inputValue_01() {
		return mInputValue_01;
	}

	public IntegerProperty inputValue_02() {
		return mInputValue_02;
	}

	public IntegerProperty outputValue() {
		return mOutputValue;
	}
}