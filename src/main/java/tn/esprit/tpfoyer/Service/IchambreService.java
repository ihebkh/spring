package tn.esprit.tpfoyer.Service;

import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entity.Chambre;

import java.util.List;

@Service
public interface IchambreService {
    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);
}
