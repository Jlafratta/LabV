package edu.utn.cerveceria;

public class BeerHouse {

    private int capacity;
    private int produced;
    private int beers;

    public BeerHouse(int capacity) {
        this.capacity = capacity;
        this.produced = 0;
        this.beers = 0;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getProduced() {
        return this.produced;
    }

    public int getBeers() {
        return this.beers;
    }

    public synchronized void produceBeer(String name){

        while (getProduced() >= getCapacity() && getBeers()!=0){    // Si no hay capacidad para producir, pero hay stock
            try {                                                   // para consumir, queda esperando
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if(getProduced()<getCapacity()){    // Si hay  capacidad de produccion
            this.produced++;    // Agrega 1 al total de producidas
            this.beers++;   // Agrega 1 al total de disponibles
            this.printProduced(name);
        }
        notifyAll();
    }

    public synchronized void consumeBeer(String name){

        while (getBeers() <= 0 && getProduced() < getCapacity()){    // Si no hay cervezas para consumir
            try {                                                    // pero si capacidad de producir,
                wait();                                              // queda esperando a que se produzca para consumir
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (getBeers()!=0){     // Si hay stock disponible, consume
            this.beers--;
            this.printConsumed(name);
        }
        notifyAll();
    }

    public synchronized void printProduced(String name){
        System.out.println("Cerveza producida ("+name+"), " + getProduced() + " producidas en total");
    }

    public synchronized void printConsumed(String name){
        System.out.println("Cerveza consumida ("+name+"), " + getBeers() + " disponibles.");
    }

}
