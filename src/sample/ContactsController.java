package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

import java.awt.print.Book;
import java.text.Collator;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class ContactsController {

    @FXML
    private ListView<ContactsInformation> ContactsListView;

    @FXML
    private ImageView PhotoImageView;

    @FXML
    private TextField NameTextField;

    @FXML
    private TextField SurnameTextField;

    @FXML
    private TextField EmailTextField;

    @FXML
    private TextField PhoneNumberTextField;

    @FXML
    private TextField ProfessionTextField;

    private final ObservableList<ContactsInformation> contacts = FXCollections.observableArrayList();


    public void initialize() {
        contacts.add(new ContactsInformation("David", "De Gea",
                "sample/images/david_degea.png", "david.degea@gmail.com",
                "+996555473104", "Football player (Goalkeeper)"));
        contacts.add(new ContactsInformation("Lee", "Grant",
                "sample/images/lee_grant.png", "lee.grant@gmail.com",
                "+996500431476", "Football player (Goalkeeper)"));
        contacts.add(new ContactsInformation("Sergio", "Romero",
                "sample/images/sergio_romero.png", "sergio.romero@gmail.com",
                "+996222125601", "Football player (Goalkeeper)"));
        contacts.add(new ContactsInformation("Victor", "Lindelof",
                "sample/images/victor_lindelof.png", "victor.lindelof@gmail.com",
                "+996505781726", "Football player (Defender)"));
        contacts.add(new ContactsInformation("Eric", "Bailly",
                "sample/images/eric_bailly.png", "eric.bailly@gmail.com",
                "+996707586021", "Football player (Defender)"));
        contacts.add(new ContactsInformation("Phil", "Jones",
                "sample/images/phil_jones.png", "phil.jones@gmail.com",
                "+9965558984011", "Football player (Defender)"));
        contacts.add(new ContactsInformation("Marcos", "Rojo",
                "sample/images/marcos_rojo.png", "marcos.rojo@gmail.com",
                "+996707586021", "Football player (Defender)"));
        contacts.add(new ContactsInformation("Ashley", "Young",
                "sample/images/ashley_young.png", "ashley.young@gmail.com",
                "+996552397562", "Football player (Defender)"));
        contacts.add(new ContactsInformation("Diogo", "Dalot",
                "sample/images/diogo_dalot.png", "diogo.dalot@gmail.com",
                "+996222203487", "Football player (Defender)"));
        contacts.add(new ContactsInformation("Luke", "Shaw",
                "sample/images/luke_shaw.png", "luke.shaw@gmail.com",
                "+996700219834", "Football player (Defender)"));
        contacts.add(new ContactsInformation("Aaron", "Wan-Bissaka",
                "sample/images/aaron_wanbissaka.png", "aaron.wanbissaka@gmail.com",
                "+996705347621", "Football player (Defender)"));
        contacts.add(new ContactsInformation("Timothy", "Fosu-Mensah",
                "sample/images/timothy_fosumensah.png", "timothy.fosumensah@gmail.com",
                "+996555367312", "Football player (Defender)"));
        contacts.add(new ContactsInformation("Axel", "Tuanzebe",
                "sample/images/axel_tuanzebe.png", "axel.tuanzebe@gmail.com",
                "+996220347965", "Football player (Defender)"));
        contacts.add(new ContactsInformation("Harry", "Maguire",
                "sample/images/harry_maguire.png", "harry.maguire@gmail.com",
                "+996555340912", "Football player (Defender)"));
        contacts.add(new ContactsInformation("Paul", "Pogba",
                "sample/images/paul_pogba.png", "paul.pogba@gmail.com",
                "+996702458965", "Football player (Midfielder)"));
        contacts.add(new ContactsInformation("Juan", "Mata",
                "sample/images/juan_mata.png", "juan.mata@gmail.com",
                "+996500458725", "Football player (Midfielder)"));
        contacts.add(new ContactsInformation("Jesse", "Lingard",
                "sample/images/jesse_lingard.png", "jesse.lingard@gmail.com",
                "+996550408163", "Football player (Midfielder)"));
        contacts.add(new ContactsInformation("Andreas", "Pereira",
                "sample/images/andreas_pereira.png", "andreas.pereira@gmail.com",
                "+996555012391", "Football player (Midfielder)"));
        contacts.add(new ContactsInformation("Federico", "Fred",
                "sample/images/federico_fred.png", "federico.fred@gmail.com",
                "+996220309173", "Football player (Midfielder)"));
        contacts.add(new ContactsInformation("Nemanja", "Matic",
                "sample/images/nemanja_matic.png", "nemanja.matic@gmail.com",
                "+996550340182", "Football player (Midfielder)"));
        contacts.add(new ContactsInformation("Scott", "McTominay",
                "sample/images/scott_mctominay.png", "scott.mctominay@gmail.com",
                "+996701205018", "Football player (Midfielder)"));
        contacts.add(new ContactsInformation("Daniel", "James",
                "sample/images/daniel_james.png", "daniel.james@gmail.com",
                "+996552109375", "Football player (Midfielder)"));
        contacts.add(new ContactsInformation("Angel", "Gomes",
                "sample/images/angel_gomes.png", "angel.gomes@gmail.com",
                "+996700320172", "Football player (Midfielder)"));
        contacts.add(new ContactsInformation("Tahith", "Chong",
                "sample/images/tahith_chong.png", "tahith.chong@gmail.com",
                "+996220409185", "Football player (Midfielder)"));
        contacts.add(new ContactsInformation("Marcus", "Rashford",
                "sample/images/marcus_rashford.png", "marcus.rashford@gmail.com",
                "+996700458736", "Football player (Forward)"));
        contacts.add(new ContactsInformation("Anthony", "Martial",
                "sample/images/anthony_martial.png", "anthony.martial@gmail.com",
                "+996707340191", "Football player (Forward)"));
        contacts.add(new ContactsInformation("Mason", "Greenwood",
                "sample/images/mason_greenwood.png", "mason.greenwood@gmail.com",
                "+996705203618", "Football player (Forward)"));

        ContactsListView.setItems(contacts.sorted());

        ContactsListView.getSelectionModel().selectedItemProperty().
                addListener(
                        new ChangeListener<ContactsInformation>() {
                            @Override
                            public void changed(ObservableValue<? extends ContactsInformation> observable, ContactsInformation oldValue, ContactsInformation newValue) {
                                PhotoImageView.setImage(
                                        new Image(newValue.getPhoto())
                                );
                                NameTextField.setText(newValue.getName());
                                SurnameTextField.setText(newValue.getSurname());
                                EmailTextField.setText(newValue.getEmail());
                                PhoneNumberTextField.setText(newValue.getPhoneNumber());
                                ProfessionTextField.setText(newValue.getProfession());
                            }
                        }
                );

        ContactsListView.setCellFactory(
                new Callback<ListView<ContactsInformation>, ListCell<ContactsInformation>>() {
                    @Override
                    public ListCell<ContactsInformation> call(ListView<ContactsInformation> listView) {
                        return new ImageTextCell();
                    }
                }
        );
    }

}
