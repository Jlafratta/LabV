package edu.utn.cerveceria;

public class BeerConsumer extends Thread {

    BeerHouse beerHouse;

    private String name;

    public BeerConsumer(BeerHouse beerHouse, String name){
        super();
        this.beerHouse = beerHouse;
        this.name = name;
    }

    @Override
    public void run() {
        // Si hay cervezas para consumir ó aun falta producir alguna, ejecuta el consumidor
        while (this.beerHouse.getBeers() > 0 || this.beerHouse.getProduced() < this.beerHouse.getCapacity()){
            this.beerHouse.consumeBeer(this.name);
        }
    }
}
