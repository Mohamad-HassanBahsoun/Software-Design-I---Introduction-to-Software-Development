package DesignPatterns.Observer;

public class GrabStocks {

    public static void main(String[] args) {

        StockGrabber stockGrabber= new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);


        stockGrabber.setIBMPrice(197);
        stockGrabber.setApplPrice(197);
        stockGrabber.setGoogPrice(197);


        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(197);
        stockGrabber.setApplPrice(197);
        stockGrabber.setGoogPrice(197);

        stockGrabber.unregister(observer1);
        stockGrabber.setIBMPrice(197);
        stockGrabber.setApplPrice(197);
        stockGrabber.setGoogPrice(197);

    }
}
