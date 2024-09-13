public class Computador {
    public String marca;
    public float preço;
    public sistemaOperacional sistemOp;
    public hardwareBasico [] hardB = new hardwareBasico[10];
    public memoriaUSB memusb;
    public Computador(String marca, float preço, sistemaOperacional sistemOp, hardwareBasico[] hardB){
        this.marca = marca;
        this.preço = preço;
        this.sistemOp = sistemOp;
        for (int i = 0; i < this.hardB.length; i++) {
            if(this.hardB[i] == null)
            {

                this.hardB[i] = hardB[i];
            }
        }

    }



    public void mostraPCConfigs(){
        System.out.println("Este computador é da marca " +marca );
        System.out.println("Seu sistema operacinal é " +sistemOp.nome +" (" +sistemOp.tipo +" bits) ");
        System.out.println("Ele possui:");
        for (int i = 0; i < hardB.length; i++) {
            if(hardB[i] != null){
                System.out.println(hardB[i].nome +" de " +hardB[i].capacidade);
            }
        }
        System.out.println("Possui um "+memusb.nome +" de "+memusb.capacidade+" GB");
        System.out.println("Por apenas: R$" +preço);
    }

    public void addMemoriaUSB(memoriaUSB musb){
        this.memusb = musb;
    }

}