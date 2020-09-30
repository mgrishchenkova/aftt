package main.lesson3.task4;

public class Human {
    String name;
    Human[] friends = new Human[5];

    Human (String name){
        this.name=name;

    }

    void addfriends(Human adfriends){
        int i=0;
        while (friends[i] != null) {
            if (friends[i] == adfriends) return;
            i++;
        }
        friends[i] = adfriends;
        adfriends.addfriends(this);
    }


}

