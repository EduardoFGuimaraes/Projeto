import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cliente client = new Cliente("Ronaldo", 1111111111);
        sistemaOperacional sys1 = new sistemaOperacional("Linux Ubuntu ", 32);
        sistemaOperacional sys2 = new sistemaOperacional("Windows 8 ", 64);
        sistemaOperacional sys3 = new sistemaOperacional("Windows 10 ", 64);
        hardwareBasico[] hardB1 = new hardwareBasico[10];
        hardwareBasico[] hardB2 = new hardwareBasico[10];
        hardwareBasico[] hardB3 = new hardwareBasico[10];
        hardB1[0] = new hardwareBasico("Pentium Core i3", 2200);
        hardB1[1] = new hardwareBasico("Memória RAM", 8);
        hardB1[2] = new hardwareBasico("HD", 500);
        hardB2[0] = new hardwareBasico("Pentium Core i5", 3370);
        hardB2[1] = new hardwareBasico("Memória RAM", 16);
        hardB2[2] = new hardwareBasico("HD", 1000);
        hardB3[0] = new hardwareBasico("Pentium Core i7", 4500);
        hardB3[1] = new hardwareBasico("Memória RAM", 32);
        hardB3[2] = new hardwareBasico("HD", 2000);


        Computador computador1 = new Computador("Positivo", 755, sys1, hardB1);
        computador1.addMemoriaUSB(new memoriaUSB("Pen-Drive", 16));
        Computador computador2 = new Computador("Acer", 1989, sys2, hardB2);
        computador2.addMemoriaUSB(new memoriaUSB("Pen-Drive", 32));
        Computador computador3 = new Computador("Vaio", 6433, sys3, hardB3);
        computador3.addMemoriaUSB(new memoriaUSB("HD Externo", 1000));


        Scanner scan = new Scanner(System.in);
        int a ;
        float precototal= 0;

        System.out.println("Olá, bem vindo a PC Mania, uma das melhores lojas de PC's");
        System.out.println("Estamos com 3 promoções imperdiveis, qual delas desejas ver?");

        do {
            System.out.println("Promoção 1 (Digite 1)");
            System.out.println("Promoção 2 (Digite 2)");
            System.out.println("Promoção 3 (Digite 3)");
            int opcao = scan.nextInt();
            if (opcao == 1) {
                computador1.mostraPCConfigs();
            } else if (opcao == 2) {
                computador2.mostraPCConfigs();
            } else if (opcao == 3) {
                computador3.mostraPCConfigs();
            }
            System.out.println("Deseja adicionar esssa promoção ao seu carrinho?");
            System.out.println("1-Não");
            System.out.println("2-Sim");
            int esc = scan.nextInt();
            if(esc == 2){
                if (opcao == 1) {
                    precototal += client.calcularCompraTotal(computador1.preço);
                } else if (opcao == 2) {
                    precototal += client.calcularCompraTotal(computador2.preço);
                } else if (opcao == 3) {
                    precototal += client.calcularCompraTotal(computador3.preço);
                }
            }
            System.out.println("Deseja olhar outra promoção?");
            System.out.println("0-Não");
            System.out.println("1-Sim");
            a = scan.nextInt();
        }
        while(a != 0);

        System.out.println("Obrigado pela preferência "+client.nome +", sua compra ficou em: R$"+precototal);
    }
}