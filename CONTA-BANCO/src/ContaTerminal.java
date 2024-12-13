import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        String clientName = ("Mario Andrade");
        Double balance = 237.48;

        Scanner numberAgency = new Scanner(System.in);

            System.out.println(("Por favor, digite o número da Agência!"));

            String agency = numberAgency.next();

        Scanner currencyNumber = new Scanner(System.in);

            System.out.println(("Por favor, digite o número da conta!"));

            String currency = currencyNumber.next();

        if (agency.equals("0678") &&  currency.equals("1021")) {

            System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + currency + " e seu saldo " + balance + " já está disponível para saque");

        }

        else {
            
            System.out.println ("Usuário não localizado");
        
        }
        
        
        

        


       /*  System.out.println(
                        "Número da agência: " + agency + "\n" + //
                        "Nome do usuário:" + user );*/


    }
}
