import java.util.Scanner;

public class MenuFornecedor {
	
public void AbrirMenu() {
		
	Scanner menu = new Scanner (System.in);
	
	try {	
	
		while (true) {
			System.out.print("\nMenu Fornecedor\n\n");
	        System.out.print("Op��o 1 - Cadastrar \n");
	        System.out.print("Op��o 2 - Atualizar \n");
	        System.out.print("Op��o 3 - Excluir \n");
	        System.out.print("Op��o 4 - Retornar \n\n");
	        System.out.print("Digite uma op��o: ");
	
	        String opcao = menu.nextLine();
	
	        switch (opcao) {
	        case "1":	        	
	        	//Cadastrar();		        	
	            break;
	
	        case "2":
	        	//Atualizar();
	            break;
	
	        case "3":
	        	//Excluir();
	            break;
	            
	        case "4":
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