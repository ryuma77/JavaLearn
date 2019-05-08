package com.dicoding.javafundamental.operator;

public class OperatorEquality {
    public static void equality(){
        int value1 = 5;
        int value2 = 4;
        boolean  hasil;
        hasil = value1 == value2;

        System.out.println("Sama Dengan");
        System.out.println("Hasil value1 == value2 adalah :" +hasil);
        System.out.println();
        System.out.println("Tidak sama dengan");
        hasil = value1 != value2;
        System.out.println("Hasil value1 != value2 adalah :" +hasil);
        System.out.println();
        System.out.println("Lebih Besar Dari");

        hasil = value1 > value2;
        System.out.println("Hasil value1 > value2 adalah : "+hasil);
        System.out.println();
        System.out.println("Lebih Besar atau Sama Dengan dari");

        hasil = value1 >= value2;
        System.out.println("Hasil value1 >= value2 adalah "+hasil);
        System.out.println();
        System.out.println("Kurang dari");

        hasil = value1 < value2;
        System.out.println("Hasil value1 < value2 adalah :"+hasil);
        System.out.println();

    }
}
