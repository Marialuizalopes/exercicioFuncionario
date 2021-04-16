
package funcionarios;


public class Funcionarios {

    
    public static void main(String[] args) {
       Funcionario f1 = new Funcionario(); 
   
    f1.nome = "João";
    f1.departamento = "Supervisão";
    f1.salario = 2700.0;
    f1.admissao = "01/08/2018";
    f1.recebeAumento(1000.0);
    f1.cauculaGanhoAnual();
    
    
        System.out.println(f1.nome);
        System.out.println(f1.departamento);
        System.out.println(f1.salario);
        System.out.println(f1.admissao);
       
    
    }
}
