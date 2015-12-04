package imenik;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Todorovic Mladen
 *
 * @class User
 *
 */
public class User {
	
	/** Private fields */
	private String ime;
	private String prezime;
	private String telefon;
	private String adresa;
	private String email;
	private String rodjenje;
	private String pol;
	private String username;
	private String password;
	
	/** List of User object */
	List<User> list = new ArrayList<User>();
	
	/** Geters & seters */
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRodjenje() {
		return rodjenje;
	}
	public void setRodjenje(String rodjenje) {
		this.rodjenje = rodjenje;
	}
	public String getPol() {
		return pol;
	}
	public void setPol(String pol) {
		this.pol = pol;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	
}
