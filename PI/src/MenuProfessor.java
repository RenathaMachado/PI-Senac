import java.util.Scanner;

public class MenuProfessor {
	
public void AbrirMenu() {
		
	Scanner menu = new Scanner (System.in);
	
	try {	
	
		while (true) {
			System.out.print("\nMenu Professor\n\n");
	        System.out.print("Op��o 1 - Cadastrar \n");
	        System.out.print("Op��o 2 - Atualizar \n");
	        System.out.print("Op��o 3 - Excluir \n");
	        System.out.print("Op��o 4 - Calcular Sal�rio \n");
	        System.out.print("Op��o 5 - Retornar \n\n");
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
	        	//CalculaSalario();
	            
	        case "5":
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