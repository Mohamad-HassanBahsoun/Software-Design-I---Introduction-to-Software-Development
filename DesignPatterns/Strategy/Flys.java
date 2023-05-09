package DesignPatterns.Strategy;

public interface Flys {

    String fly();
}

class itFlys implements Flys{
    public String fly(){
        return "Flying High";
    }
}

class cantFly implements Flys{

    public String fly() {
        return "Cant Fly";
    }
}
