package py.com.gestion.bibliografia.dao;

import py.com.gestion.bibliografia.db.DBTransactions;
import py.com.gestion.bibliografia.model.Autor;

public class AutorDao {

    DBTransactions<Autor> autorDBTransactions;

    public Autor select(Autor autor) throws Exception {

        Autor response = null;
        try {
            autorDBTransactions.select(autor);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }

        return response;
    }

    public void insert(Autor autor) throws Exception {
        try {
            autorDBTransactions.insert(autor);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }
    }

    public void update(Autor autor) throws Exception {
        try {
            autorDBTransactions.update(autor);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }
    }

    public void delete(Autor autor) throws Exception {
        try {
            autorDBTransactions.delete(autor);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }
    }
}