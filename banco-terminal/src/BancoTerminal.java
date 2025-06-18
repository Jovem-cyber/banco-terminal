import java.util.Scanner; // classe scanner

public class BancoTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 

        //variaveis com os dois exemplos solicitados: (o segundo só inverter e deixar o outro comentado.)
        // double balance = 25.0; 
        // double valorSolicitado = 18.0;
        double balance = 15.0; 
        double valorSolicitado = 22.0;

            //mensagens do terminal
            System.out.println("Verificando a conta, por favor aguarde...");
            System.out.println("Seu saldo é " + balance);
            System.out.println("O valor solicitado é " + valorSolicitado);

            // condições que eu coloquei no terminal para analise dos valores:
        if ( balance > valorSolicitado) { 
            // se o saldo for MAIOR que o valor solicitado vai cair na formula de baixo.
            balance = balance - valorSolicitado; //formula para calcular o restante do saldo.
            
            System.out.println("Transação Concluída.");
            System.out.println("Seu novo saldo é " + balance);
        }

        else {
            // se for falso o if dará essa msg.
             System.out.println("Transação negada.");
             System.out.println("Saldo Insuficiente.");
        }
        
    }
}
