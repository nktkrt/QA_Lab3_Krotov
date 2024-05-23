package koors;
import java.util.*;
import java.io.*;
/** 
 * Класс пользователя описывает имя, список конференций, которые он админит и в которых состоит.
 */
public class User implements Serializable{
    String nickname;
   ArrayList<Konferen> adminu=new ArrayList<Konferen>();
    ArrayList<Konferen> sostoyu=new ArrayList<Konferen>();
        User(String a){
    nickname=a;
   }

}
