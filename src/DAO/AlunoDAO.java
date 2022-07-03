/*
 Aqui vamos simular a persistência de dados.
 */
package DAO;

import Model.Aluno;
import java.util.*;

public class AlunoDAO {

    public static ArrayList<Aluno> MinhaLista = new ArrayList<Aluno>();

    public static int maiorID() {
        
        int maiorID = 0;
        for (int i = 0; i < MinhaLista.size(); i++) {
            if (MinhaLista.get(i).getId() > maiorID) {
                maiorID = MinhaLista.get(i).getId();
            }
        }
        return maiorID;
        
        
    }

}
