package com.campusdual.classroom;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
    List<Person> lista = new ArrayList<Person>();
    Person p = new Person("Mario","Martinez");
    Teacher t = new Teacher("Kylian","Mbappe","Madrid");
    Doctor d = new Doctor("Pedro","Sanxe","Ladron");
    PoliceOfficer po = new PoliceOfficer("Peter","Parker","Equipo 1");
    lista.add(p);
    lista.add(t);
    lista.add(po);
    lista.add(d);
    return lista;
    }

    public static void showPeopleDetails(List<Person> stringList) {
    for(int i=0;i<stringList.size();i++){
        stringList.get(i).getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
