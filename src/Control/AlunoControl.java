package Control;
import Model.Aluno;
import java.util.ArrayList;

public class AlunoControl {
    
    //Atributos
    private final Aluno a;
    
    //Método Construtor (quando instanciar um objeto AlunoControl, será criado um objeto Aluno;
    public AlunoControl(){
       this.a = new Aluno();
    }
    
    //Métodos CRUD    
    
    //Create
    public boolean cadastrarAluno (String curso, int fase, String nome, int idade){
        int id = a.pegarID();
        Aluno b = new Aluno (curso, fase, id, nome, idade);
        if (a.createAlunoBD(b) ){
            return true;
        } else {
            return false;
        }
        
    }
    
    
    //Read
    public Aluno lerAluno(int id){
        return a.readAlunoBD(id);
    }
    //Read
    public ArrayList getListaAlunos(){
        return a.getListaAlunos();
    }
    
    
    //Update
    public boolean editarAluno (String curso, int fase, int id, String nome, int idade){
        Aluno b = new Aluno (curso, fase, id, nome, idade);
        if (a.updateAlunoBD(id, b)) {
            return true;
        } else{
            return false;
        }
    }
    
    
    //Delete
    public boolean deletarAluno (int id){
        if (a.deleteAlunoBD(id)){
            return true;
        } else{
            return false;
        }
    }
             
    
    public String[][] listaTabela(){ //para colocar os dados da ArrayList na tabela presente na tela GerenciarAluno em View
        
        ArrayList<Aluno> minhaLista = a.getListaAlunos();
        int tamanho = minhaLista.size(); //1 linha para cada objeto Aluno na ArrayList
        String[][] tabela = new String[tamanho][5]; //colunas = 5 (ID, nome, idade, curso e fase)
        
        for (int i = 0; i < minhaLista.size(); i++){
            tabela[i][0] = minhaLista.get(i).getId() + ""; // "" --> pois deve ser String
            tabela[i][1] = minhaLista.get(i).getNome() + "";
            tabela[i][2] = minhaLista.get(i).getIdade() + "";
            tabela[i][3] = minhaLista.get(i).getCurso() + "";
            tabela[i][4] = minhaLista.get(i).getFase() + "";
        }
        
        return tabela;
    }
    
}
