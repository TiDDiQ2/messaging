import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class controller implements Initializable{
    List<String> listOfMessages = new ArrayList<>();
    @FXML
    private VBox chatBox;

    @FXML
    private Button enterButton;

    @FXML
    private TextArea messageBox;

    @FXML
    private TextArea messageText1;

    @FXML
    private TextArea messageText2;

    @FXML
    private TextArea messageText3;

    @FXML
    private TextArea messageText4;

    @FXML
    private TextArea messageText5;

    @FXML
    private TextArea messageText6;

    @FXML
    private TextArea messageText7;

    @FXML
    private TextArea messageText8;

    @FXML
    private TextArea messageText9;

    @FXML
    private TextArea messageText10;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        messageText1.setManaged(false);
        messageText2.setManaged(false);
        messageText3.setManaged(false);
        messageText4.setManaged(false);
        messageText5.setManaged(false);
        messageText6.setManaged(false);
        messageText7.setManaged(false);
        messageText8.setManaged(false);
        messageText9.setManaged(false);
        messageText10.setManaged(false);
    }

    @FXML
    void enterMessage(ActionEvent event) {
        String text = messageBox.getText();
        int listSize = listOfMessages.size();
        switch (listSize) {
            case 0:
                messageText1.setManaged(true);
                messageText1.setText(text);
                messageText1.setVisible(true);
                listOfMessages.add(text);
                messageBox.clear();
                break;
            case 1:
                messageText2.setManaged(true);
                messageText2.setText(text);
                messageText2.setVisible(true);
                listOfMessages.add(text);
                messageBox.clear();
                break;
            case 2:
                messageText3.setManaged(true);
                messageText3.setText(text);
                messageText3.setVisible(true);
                listOfMessages.add(text);
                messageBox.clear();
                break;
            case 3:
                messageText4.setManaged(true);
                messageText4.setText(text);
                messageText4.setVisible(true);
                listOfMessages.add(text);
                messageBox.clear();
                break;
            case 4:
                messageText5.setManaged(true);
                messageText5.setText(text);
                messageText5.setVisible(true);
                listOfMessages.add(text);
                messageBox.clear();
                break;
            case 5:
                messageText6.setManaged(true);
                messageText6.setText(text);
                messageText6.setVisible(true);
                listOfMessages.add(text);
                messageBox.clear();
                break;
            case 6:
                messageText7.setManaged(true);
                messageText7.setText(text);
                messageText7.setVisible(true);
                listOfMessages.add(text);
                messageBox.clear();
                break;
            case 7:
                messageText8.setManaged(true);
                messageText8.setText(text);
                messageText8.setVisible(true);
                listOfMessages.add(text);
                messageBox.clear();
                break;
            case 8:
                messageText9.setManaged(true);
                messageText9.setText(text);
                messageText9.setVisible(true);
                listOfMessages.add(text);
                messageBox.clear();
                break;
            case 9:
                messageText10.setManaged(true);
                messageText10.setText(text);
                messageText10.setVisible(true);
                listOfMessages.add(text);
                messageBox.clear();
                break;
            default:
                listOfMessages.remove(0);
                listOfMessages.add(text);
                messageText1.setText(listOfMessages.get(0));
                messageText2.setText(listOfMessages.get(1));
                messageText3.setText(listOfMessages.get(2));
                messageText4.setText(listOfMessages.get(3));
                messageText5.setText(listOfMessages.get(4));
                messageText6.setText(listOfMessages.get(5));
                messageText7.setText(listOfMessages.get(6));
                messageText8.setText(listOfMessages.get(7));
                messageText9.setText(listOfMessages.get(8));
                messageText10.setText(listOfMessages.get(9));
                messageBox.clear();
        }
    }


}
