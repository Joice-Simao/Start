package exerciciosOrientacaoObjetos;

public class Main {

    public static void main(String[] args){

        Invoice inv = new Invoice(1,"faca",10,10.0f);
            System.out.println("Valor total = "+inv.getInvoiceAmount());
    }
}
