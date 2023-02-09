import java.util.*;

abstract class Bank

{

   abstract void getBalance();

}

class BankA extends Bank

{

   void getBalance()

   {

       System.out.println("Money deposited in Bank A is $1000");

   }

}

class BankB extends Bank

{

   void getBalance()

   {

       System.out.println("Money deposited in Bank B is $1500");

   }

}

class BankC extends Bank

{

   void getBalance()

   {

       System.out.println("Money deposited in Bank C is $2000");

   }

}

