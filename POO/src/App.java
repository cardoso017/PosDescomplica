public class App {
    public static void main(String[] args) throws Exception {
        
      Cao pet = new Cao("TESTE", 20);

       pet.Andar(); 
       pet.DadosCao();

       pet.SetIdade(20);

       if(pet.VerificaIdade())
        System.out.println("Ele é idoso");
       else 
       System.out.println("Novinho");
    }
}
