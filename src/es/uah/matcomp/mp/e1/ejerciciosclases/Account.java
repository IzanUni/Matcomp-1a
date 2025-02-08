package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Account {
    private String id;
    private String nombre;
    private int balance;

    public Account(String id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    public Account(String id, String nombre, int balance){
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return nombre;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        this.balance += amount;
        return this.balance;
    }
    public int debit(int amount){
        if (amount <= this.balance){
            this.balance -= amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;

    }
    public int transferTo(Account another, int amount){
        if (amount <= this.balance){
            this.balance -= amount;
            another.balance += amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    public String toString(){
        return "id = " + id + ",name = " + nombre + ",balance = " + balance + "]";
    }


}
