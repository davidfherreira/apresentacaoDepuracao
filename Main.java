import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int opcao = 1;
        
        while(opcao!=0){
            Scanner opc = new Scanner(System.in);
            System.out.println("Tecle 1 para calcular o IMC de uma pessoa. ");
            System.out.println("Tecle 0 para sair do programa. ");
            
            switch(opc.nextInt()){
                
                case 1:{

                        Pessoa p1 = new Pessoa();
                        System.out.println("Insira o nome da pessoa: ");
                        p1.setNome(scan.nextLine());
                        System.out.println("Insira o peso :");
                        p1.setPeso(scan.nextFloat());
                        System.out.println("Insira a altura: ");
                        p1.setAltura(scan.nextFloat());       
                        
                        System.out.println(p1.toString());
                        p1.calcularImc(p1);
                        
                        break;
                        }
                        case 0:{
                        System.out.println("Ate mais !!! ");
                        opcao = 0;
                        break;
                        }
                
                }
            }
        }
    }