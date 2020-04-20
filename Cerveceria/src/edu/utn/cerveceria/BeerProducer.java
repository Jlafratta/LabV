package edu.utn.cerveceria;

public class BeerProducer extends Thread{

    BeerHouse beerHouse;

    private String name;

    public BeerProducer(BeerHouse beerHouse, String name){
        super();
        this.beerHouse = beerHouse;
        this.name = name;
    }

    @Override
    public void run(){
        // Si hay capacidad disponible, produce la cerveza
        while (this.beerHouse.getProduced() < this.beerHouse.getCapacity()){
            this.beerHouse.produceBeer(this.name);
        }
    }

}
