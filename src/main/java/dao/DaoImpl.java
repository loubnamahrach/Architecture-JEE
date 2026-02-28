package dao;
import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements Idao {
    @Override
    public double getData(){
        System.out.println("version base de donnees");
        double temp = 25;
        return temp;
    }
}