//Kontroler
package rs.edu.educons.it.is.MB.edu;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rs.edu.educons.it.is.MB.entity.Predmet;

@RestController
@RequestMapping("/faks")
public class PredmetController {

	@Autowired
	PredmetService predmetService;

	@RequestMapping("/predmeti")
	public List<Predmet> getPredmeti() {

		return predmetService.getAllPredmeti();

	}

	@RequestMapping(method = RequestMethod.GET, value ="/predmet/{id}")
	public Predmet getPredmet(@PathVariable Long id) {

		return predmetService.getPredmet(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/predmet")
	public void addPredmet(@RequestBody Predmet predmet) {
		
		predmetService.addPredmet(predmet);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value ="/predmet/{id}")
	public void deletePredmet(@PathVariable Long id) {

		 predmetService.deletePredmet(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value ="/predmet/{id}")
	public void updatePredmet(@RequestBody Predmet predmet) {

		 predmetService.updatePredmet(predmet);
	}
	
}
