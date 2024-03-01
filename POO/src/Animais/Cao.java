public class Cao{
   private String nome;
   private String cor;
   private int idade;

    public Cao(){
        cor = "Caramelo";
    }

    public Cao(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void Andar(){
        System.out.println("Estou andando... " + cor);
    }

    public void DadosCao(){
        System.out.println("Me chamo: " + nome + " Tenho: " + idade + " anos");
    }

    public void SetIdade(int idade){
        this.idade = idade; 
    }

    public boolean VerificaIdade(){
        if(idade > 10)
        return true; 
        else 
        return false;
    }
}