import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList; 
import java.util.List;

public class Profile {
     // variables
     private String username;
     private String password;
     private String name;
     private int coins;
     private Map<String, Profile> friends;
     private Map<String, Profile> followers;
     private LinkedList<Task> tasks;


     public Profile(String user, String pw){
          username = user;
          password = pw;
          name = "Default Name";
          coins = 0;
          friends = new HashMap<String, Profile>();
          followers = new HashMap<String, Profile>();
          tasks = new LinkedList<Task>();
     }

     // constructors
     public Profile(String user, String pw, String n){
          username = user;
          password = pw;
          name = n;
          coins = 0;
          friends = new HashMap<String, Profile>();
          followers = new HashMap<String, Profile>();
          tasks = new LinkedList<Task>();
     }

     // get information
     public String getUsername(){ return username; }
     public String getPassword() { return password; }
     public String getName(){ return name; }
     public int getCoins(){ return coins; }
     
     public Map<String, Profile> getFriends(){ return friends; }
     public Map<String, Profile> getFollowers(){ return followers; }
     public List<Task> getTasks(){ return tasks; }

     // change profile
     public Profile addFollower(Profile person){
          followers.put(person.getUsername(), person);
          return person;
     }
     
     public Profile addFriend(Profile person){
          friends.put(person.getUsername(), person);
          return person;
     }
     
     public Task addTask(Task task){
          tasks.add(task);
          return task;
     }
     
     public Profile removeFollower(Profile person){
          followers.remove(person.getUsername());
          return person;
     }
     
     public Profile removeFriend(Profile person){
          friends.remove(person.getUsername());
          return person;
     }
     
     public Task removeTask(Task task){
          tasks.remove(task);
          return task;
     }

     public int addCoins(int amount){
          coins += amount;
          return coins;
     }

     public int removeCoins(int amount){
          coins -= amount;
          return coins;
     }


}