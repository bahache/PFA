
package pfa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Compaq
 */
@Entity
@Table(name="client")
public class Client implements Serializable {
    @Id
    private String cin;
    private String nom;
    private String prenom;
    private String tel;
    private String fax;
    private String adresse;
    private String email;

    public Client() {
    }
    public Client(String cin,String nom,String prenom,String tel,String fax,String adresse,String email)
    {
        this.cin=cin;
        this.nom=nom;
        this.prenom=prenom;
        this.tel=tel;
        this.fax=fax;
        this.adresse=adresse;
        this.email=email;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
