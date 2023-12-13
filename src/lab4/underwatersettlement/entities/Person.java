package lab4.underwatersettlement.entities;

import java.util.Objects;

public abstract class Person implements Audible{
    protected String name;
    protected String role;

    public Person(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        if (role != null) {
            return role;
        } else {
            System.out.println("Значение роли не может быть null");
            return "Error";
        }
    }

    public void setRole(String role) {
        if (role != null) {
            this.role = role;
        } else {
            System.out.println("Значение роли не может быть null");
        }
    }

    // Абстрактный метод, который должны реализовать подклассы
    public abstract String makeSound();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(role, person.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, role);
    }
}
