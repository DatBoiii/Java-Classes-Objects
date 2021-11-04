public class PetClass {
    private String name;
    private int age;
    private String location;
    private String type;

    public PetClass(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;

    }

    public PetClass() {
        
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setLocation(String newLocation) {
        this.location = newLocation;
    }

    public static void main(String[] args) {
        PetClass newPet = new PetClass("Lucky", 2, "Michigan", "Dog");
        System.out.println(newPet.getAge());
    }
}