package org.example;


import org.example.model.Item;
import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class).addAnnotatedClass(Item.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
              session.beginTransaction();
//            Person person = session.get(Person.class,3);
//            System.out.println(person);
//            List<Item> itemList = person.getItemList();
//            System.out.println(itemList);
//            Item item = session.get(Item.class, 5);
//            System.out.println(item);
//            System.out.println(item.getOwner());
//            Person person = session.get(Person.class, 2);
//            Item newItem = new Item("Something", person);
//            person.getItemList().add(newItem);
//            session.save(newItem);
//            Person person = new Person("Nik", 55);
//            Item newItem = new Item("NoteBook", person);
//            person.setItemList(new ArrayList<Item>(Collections.singleton(newItem)));
//            session.save(person);
//            session.save(newItem);
//            Person person = session.get(Person.class, 3);
//            List<Item> itemList = person.getItemList();
//            for (Item item:itemList
//                 ) {
//                session.remove(item);
//            }
//            person.getItemList().clear();

//            Person person = session.get(Person.class, 2);
//            session.remove(person);
//            person.getItemList().forEach(i->i.setOwner(null));

//            Person person = session.get(Person.class, 4);
//            Item item = session.get(Item.class, 1);
//
//            item.getOwner().getItemList().remove(item);
//
//            item.setOwner(person);
//            person.getItemList().add(item);
            Person person = new Person("Test_person", 66);
            person.addItem(new Item("item1")) ;
            person.addItem(new Item("item2")) ;
            person.addItem(new Item("item3")) ;

            session.persist(person);

            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }





    }
}
