package soloTasks;

import java.util.ArrayList;
import java.util.Arrays;

public final class User {
    private String username;
    private String email;
    private byte[] passwordHash;
    public String getUsername() { return username;}
    public void setUsername(String username) { this.username = username;}
    public String getEmail() { return email;}
    public void setEmail(String email) { this.email = email;}
    public byte[] getPasswordHash() { return passwordHash;}
    public void setPasswordHash(byte[] passwordHash) { this.passwordHash =passwordHash;}

    public User(String username, String email, byte[] passwordHash) {
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
    }

    public boolean equals(Object o){
        if(this==o)return true;
        if(o==null||o.getClass()!=this.getClass()) return false;
        User user = (User)o;
        return (this.username.equals(user.username)&&
                this.email.equals(user.email)&&
                Arrays.equals(this.passwordHash,user.passwordHash)
                );
    }

    public static ArrayList<User> findDuplicates(ArrayList<User> list1, ArrayList<User> list2){
    ArrayList<User> duplicates = new ArrayList<>();
        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list2.size();j++){
                if(list1.get(i).equals(list2.get(j)))duplicates.add(list1.get(i));
            }
        }
    return duplicates;
    }

    public static void main(String[] args) {
        User user1 = new User("lera","rrr@mail.ru",new byte[]{12,34,56,78,100});
        User user2 = new User("lena","yyy@mail.ru",new byte[]{12,34,56,78,1});
        User user3 = new User("katya","xxxx@mail.ru",new byte[]{34,56,78,100});
        User user4 = new User("petya","v@mail.ru",new byte[]{12,56,56,78,100});
        User user5 = new User("karina","gg@mail.ru",new byte[]{12,34,56,3});
        User user6 = new User("maksim","qqq@mail.ru",new byte[]{56,78,100});
        ArrayList<User> list1=new ArrayList<>();
        ArrayList<User> list2=new ArrayList<>();
        list1.add(user1);
        list1.add(user2);
        list1.add(user3);

        list2.add(user1);
        list2.add(user2);
        list2.add(user4);
        list2.add(user5);
        list2.add(user6);

        for (User u:findDuplicates(list1,list2)
             ) {
            System.out.println(u.getUsername()+" "+u.getEmail());
        }
   }
}
