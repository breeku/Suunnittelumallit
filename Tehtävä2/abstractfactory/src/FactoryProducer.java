public class FactoryProducer {
    public static AbstractFactory getFactory(boolean valmistunut){   
       if (valmistunut){
          return new BossFactory();         
       } else {
          return new AdidasFactory();
       }
    }
 }