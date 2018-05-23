package rs.edu.educons.it.is.MB.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Predmet {

	@Id
	@GeneratedValue
	Long id;
	String naziv;
	String opis;

	public Predmet() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Predmet(String naziv, String opis) {
		super();
		this.naziv = naziv;
		this.opis = opis;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	@Override
	public String toString() {
		return "Predmet [id=" + id + ", naziv=" + naziv + ", opis=" + opis + "]";
	}

}
