package Model;
import DAO.AlunoDAO;
import java.util.ArrayList;


public class Aluno extends Pessoa {
    
    private String curso;
    private int fase;
    
    
    public Aluno(){        
    }
    
    public Aluno(String curso, int fase, int id, String nome, int idade) {
        super(id, nome, idade);
        this.curso = curso;
        this.fase = fase;
    }
    
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
    
    
    @Override
    public String toString() { 
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Idade: " + this.getIdade()
                + "\n Curso: " + this.getCurso()
                + "\n Fase: " + this.getFase()
                + "\n -----------";
    }
    
    //Métodos de interação com o BD
    
    public ArrayList getListaAlunos(){
        return AlunoDAO.listaAlunos;
    }
    
    public int pegarID(){
        return AlunoDAO.pegarID();
    }
    
    
    //Métodos pro CRUD
    
    public boolean createAlunoBD (Aluno aluno){
        AlunoDAO.listaAlunos.add(aluno);
        return true;
    }
    
    public Aluno readAlunoBD(int id) {
       return AlunoDAO.listaAlunos.get(id);
    }
    
    public boolean updateAlunoBD (int id, Aluno aluno){
        AlunoDAO.listaAlunos.set(id - 1,aluno);
        return true;
    }
    
    public boolean deleteAlunoBD (int id){
        AlunoDAO.listaAlunos.remove(id - 1);
        return true;
    }
    
    
    
        
}
