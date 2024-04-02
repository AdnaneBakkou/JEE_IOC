package dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao{
    @Override
    public double getData() {
       System.out.println("version bdd");
       double t = 23;
        return t;
    }
}
