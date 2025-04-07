public class Corrida {
    
    public static void main(String[] args) {
        
    Thread corredor1 = new Thread(new Corredor(), "Senna");
    Thread corredor2 = new Thread(new Corredor(), "Barrichello");
    Thread corredor3 = new Thread(new Corredor(), "Mansell");
    Thread corredor4 = new Thread(new Corredor(), "Piquet");
    Thread corredor5 = new Thread(new Corredor(), "Hill");
    
    }

}
