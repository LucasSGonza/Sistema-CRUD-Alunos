package DAO;

import Model.Aluno;
import java.util.ArrayList;


public class AlunoDAO {
    
    //Atributos
    public static ArrayList<Aluno> listaAlunos = new ArrayList(); //static para ser a mesma ArrayList em cada instância
    
    //Métodos
    public static int pegarID(){
        int id = 0;
        id = listaAlunos.size() + 1;       
        return id;
    }
    
}
