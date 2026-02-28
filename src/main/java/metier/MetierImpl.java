package metier;

import dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")

public class MetierImpl implements IMetier {
    @Autowired
    private Idao dao;

    public MetierImpl(@Qualifier("dao2") Idao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul(){
        double t = dao.getData();
        double res = t *23;
        return res;
    }

    public void setDao(Idao dao){
        this.dao=dao;

    }

}