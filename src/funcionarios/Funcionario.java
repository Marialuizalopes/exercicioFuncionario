
package funcionarios;


public class Funcionario {
    
    String nome;
    String departamento;
    int idade;
    double salario;
    String admissao;
 
    
    
    public void recebeAumento (double aumento)
    {
        this.salario = this.salario + aumento;
      }
            
     public void cauculaGanhoAnual (){
         
         System.out.println (salario *12);
         
     }
   
}
