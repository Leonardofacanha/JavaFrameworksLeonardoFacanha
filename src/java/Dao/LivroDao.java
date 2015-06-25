package Dao;

import Model.Livro;
import java.util.List;

/**
* INTERFACE DAO(data access object) 
* @author Leonardo Façanha
* Professor Bruno Penha vai me dar 10 ;)
*/
public interface LivroDao {

    public void save(Livro livro);
    public Livro getLivro(long id);
    public List<Livro> list();
    public void remove(Livro livro);
    public void update(Livro livro);

}
