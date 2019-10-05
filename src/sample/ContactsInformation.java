package sample;

public class ContactsInformation {
    private String name;
    private String surname;
    private String photo;
    private String email;
    private String phoneNumber;
    private String profession;

    public ContactsInformation(String name, String surname, String photo, String email, String phoneNumber, String profession) {
        this.name = name;
        this.surname = surname;
        this.photo = photo;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
    }

    public  String getName() {
        return name;
    }

    public void  setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoto() {
        return  photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmial(String emial) {
        this.email = emial;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return getSurname();
    }
}
