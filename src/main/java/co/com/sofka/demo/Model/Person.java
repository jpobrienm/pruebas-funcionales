package co.com.sofka.demo.Model;


import org.springframework.data.annotation.Id;

public class Person {

    @Id
    private Long id;
    private String name;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
