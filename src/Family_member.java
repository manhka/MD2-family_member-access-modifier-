public class Family_member {
    int id;
    String name;
    int age;
    String phone_number;

    public Family_member() {
        id++;
    }

    public Family_member(int id, String name, int age, String phone_number) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;

    }

    @Override
    public String toString() {
        return "\nid:" + id +
                "\nName='" + name + '\'' +
                "\nAge=" + age +
                "\nPhone_number=" + phone_number
                ;
    }
}
