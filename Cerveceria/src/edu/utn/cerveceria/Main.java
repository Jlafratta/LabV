package edu.utn.cerveceria;

public class Main {

    public static void main(String[] args) {

        BeerHouse beerHouse = new BeerHouse(100);
        BeerProducer producer = new BeerProducer(beerHouse, "Barman 1");
        BeerProducer producer2 = new BeerProducer(beerHouse, "Barman 2");
        BeerConsumer consumer = new BeerConsumer(beerHouse, "Pepe");
        BeerConsumer consumer2 = new BeerConsumer(beerHouse, "Grillo");

        producer.start();
        producer2.start();
        consumer.start();
        consumer2.start();
    }
}
