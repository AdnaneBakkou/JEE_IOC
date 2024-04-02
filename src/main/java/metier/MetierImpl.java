package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl  implements IMetier{
  // sois autowared ou constructeur avec params
    private IDao dao = null; // couplage faible
    @Override
    public double calcule() {
        double t = dao.getData();
        double res = t *432;
        return res;
    }

    public MetierImpl() {
    }

    //constructueur

    @Autowired
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    // Injection dans la var dao dans un objet d'une classe qui implement Idao
    @Autowired
    public void setDao(IDao dao) {
        this.dao = dao;
    }

}
