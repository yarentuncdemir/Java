package com.company;

public class Main {

    public static void main(String[] args) {
      //  Car porsche = new Car();
      //  Car holden = new Car();
      //  porsche.setModel("911");
      //  System.out.println("Model is " + porsche.getModel());

        Bank yarenBank=new Bank();
        yarenBank.setAccountNumber("1234");
        yarenBank.setBalance(0.00);
        yarenBank.setCostumerName("Yaren Tuncdemir");
        yarenBank.setAccountNumber("054321");
        yarenBank.setEmail("yt@hotmail.com");

        yarenBank.deposit(51.0);
        yarenBank.withdraw(50.0);

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());
        VipPerson person2 = new VipPerson("Bob", 25000.0D);
        System.out.println(person2.getName());
        VipPerson person3 = new VipPerson("Tim", 100.0D, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());


    }
}
