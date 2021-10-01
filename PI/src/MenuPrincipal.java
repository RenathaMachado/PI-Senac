
import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {		
		
		Scanner menu = new Scanner (System.in);
	
		try {
	
	        while (true) {            
	
		        System.out.print("\nMenu Principal: \n\n");
		        System.out.print("Op��o 1 - Disciplina \n");
		        System.out.print("Op��o 2 - Aluno \n");
		        System.out.print("Op��o 3 - Professor \n");
		        System.out.print("Op��o 4 - Fornecedor \n");
		        System.out.print("Op��o 5 - Sair \n\n");
		        System.out.print("Digite uma op��o: \n");
		
		        String opcao = menu.nextLine();		
		
		        switch (opcao) {
		        
		        case "1":
		            new MenuDisciplina().AbrirMenu();
		            break;
		            
		        case "2":
		            new MenuAluno().AbrirMenu();
		            break;
		
		        case "3":
		        	//new MenuProfessor().AbrirMenu();
		            break;
		            
		        case "4":
		        	//new MenuFornecedor().AbrirMenu();
		            break;
		
		        case "5":
		        	System.out.print("\nAt� logo!");		        	
		            return;   
		
		        default:
		            System.out.print("\nOp��o Inv�lida!\n");
		            break;
		        }
	        }        
		} catch (Exception e) {
			e.printStackTrace();
			menu.close();
		}
	}		
}