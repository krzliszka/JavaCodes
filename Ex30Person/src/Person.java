public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age >=0 && age <= 100) {
            this.age = age;
        }  else {
            age = 0;
        }
    }

    public boolean isTeen() {
        if(this.age > 12 && this.age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if(firstName.isEmpty() == true && lastName.isEmpty() == true) {
            return "";
        } else if(lastName.isEmpty() == true) {
            return firstName;
        } else if(firstName.isEmpty()) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }
    }
}
