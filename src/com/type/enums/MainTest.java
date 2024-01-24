package com.type.enums;

public class MainTest {
    public static void main(String[] args) {
        //consta değerler verirken sınırlama yok herhangi bir int değer verebiliyoruz.
        //eğer kod düzgün design edilmedi ise run time de hatalara neden olabilir
        useConstantMethod(1);
        useConstantMethod(3);
        useConstantMethod(5);


        //Enum tipinde var olan herhangi bir değer seçilebilir.
        //olmayan bir değer secilirse compile time da hata alınacaktır
        useEnumMethod(TransactionType.DEPOSIT);
        useEnumMethod(TransactionType.PAYMENT);
        useEnumMethod(TransactionType.WITHDRAW);
        System.out.println(TransactionType.PAYMENT.getTransactionCode()+"nmö");
    }
    private static void useEnumMethod(TransactionType transactionType){
        if (transactionType==TransactionType.DEPOSIT){
            System.out.println("Money is depositing");
        } else if (transactionType==TransactionType.WITHDRAW) {
            System.out.println("Money is withdrawing");
        } else if (transactionType==TransactionType.PAYMENT) {
            System.out.println("Payment is being made");
        }else System.out.println("Other transaction");

        System.out.println("Enum Name "+transactionType.name());
        System.out.println("Enum Ordinal "+transactionType.ordinal());
        System.out.println("Enum code value "+transactionType.getTransactionCode());
    }

    private static void useConstantMethod(int i){
        if (i==TransactionTypeConstant.DEPOSIT){
            System.out.println("Money is depositing");
        } else if (i==TransactionTypeConstant.WITHDRAW) {
            System.out.println("Money is withdrawing");
        } else if (i==TransactionTypeConstant.PAYMENT) {
            System.out.println("Payment is being made");
        }else System.out.println("Other transaction");
    }
}