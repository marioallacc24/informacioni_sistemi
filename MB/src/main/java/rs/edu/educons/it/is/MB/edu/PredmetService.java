//Sloj servis koji radi biznis logiku
//
package rs.edu.educons.it.is.MB.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.edu.educons.it.is.MB.entity.Predmet;
import rs.edu.educons.it.is.MB.repository.PredmetRepository;

@Service
public class PredmetService {
	
	@Autowired
	PredmetRepository predmetRepository;
	
	
	private List<Predmet> predmeti = new ArrayList<> (Arrays.asList(new Predmet("Informacioni sistemi", "Treci semestar"),
			new Predmet( "Primenjeno programiranje", "Treci semestar"),
			new Predmet( "Racunarske mreze", "Drugi semestra")));

	public List<Predmet> getAllPredmeti() { // Funkcija za vracanje svih predmeta u nizu
		return predmeti;
	}

	public Predmet getPredmet(Long id) {

		return predmetRepository.findById(id);

	}
	
	public void addPredmet(Predmet predmet) {
		
		System.out.println("Predmet " + predmet.toString());
		predmetRepository.save(predmet);
	}
	
	public void deletePredmet(Long id) {
		
		System.out.println("Brisemo predmet id: " + id);

		predmetRepository.deleteById(id);
	}
	
	public void updatePredmet(Predmet predmet) {

		System.out.println("Update predmet id: " + predmet.toString());
		predmetRepository.save(predmet);
	} 
}
