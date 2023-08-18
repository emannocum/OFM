import com.ofm.OFMBE;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserModel {
    
    private @Id @GeneratedValue Long id;
    private String firstname;
    private String lastname;

    User(){}

    User(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    //getters and setters
    public Long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getLastname(){
        return this.lastname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }
}
