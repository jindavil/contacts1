package contacts;

public class Playersinformation {
    private String name;
    private String surname;
    private Integer telefonumber;


    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public Integer getTelefonumber() {
        return telefonumber;
    }

    public void setTelefonumber(Integer telefonumber) {
        this.telefonumber = telefonumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Playersinformation product = (Playersinformation) o;

        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        return surname != null ? surname.equals(product.surname) : product.surname == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{Playersinformation " +
                "Name='" + name + '\'' +
                ", Sername='" + surname + '\'' +
                ", Telefonnumber='" + telefonumber + '\'' +
                '}';
    }


}

