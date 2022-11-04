package org.example.model;


import jakarta.persistence.*;

@Entity
@Table
public class Item {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person owner;

    @Column(name = "item_name")
    private String item_name;

    public Item() {
    }

    public Item(String item_name) {
        this.item_name = item_name;

    }


    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", item_name='" + item_name + '\'' +
                '}';
    }
}
