package SpringAndAnotation;

@JsonSerialized
public class Person {
    @JsonElement
    private String firstName;
    @JsonElement
    private String lastName;
    @JsonElement
    private String age;
    @JsonElement
    private String address;

    public Person(String firstName, String lastName, String age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    @StringAnnotation
    private void changeString(){
        this.firstName = capitalized(this.firstName);
        this.lastName = capitalized(this.lastName);
    }

    private String capitalized(String name){
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
