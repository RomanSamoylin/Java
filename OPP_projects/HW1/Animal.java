package OPP_projects.HW1;

    import java.util.Random;
    
    public abstract class Animal {
    
        private static int id = 0;
        private static Random r;
        private final String name;
        private int number = 0;
    
        private int age;
        private int size;
    
        public String getName() {
            return name;
        }
    
        static {
            Animal.id = 0;
            Animal.r = new Random();
        }
    
        public Animal(String name, int age, int size) {
            this.name = name;
            this.age = age;
            this.size = size;
            ++id;
            this.number = id; 
          
        }
    
        public Animal(String name) {
            this(name, r.nextInt(1,100), r.nextInt(1,200));
        }
    
        public Animal() {
            this("DefaultName");
            
        }
    
        @Override
        public String toString() {
    
            return String.format("Animal #%d: %s %s : Age: %d Size: %d",this.number,this.getClass().getSimpleName(),
                    this.name, this.age, this.size);
    
        }
    
        public void voice(){
            System.out.println("Animal's voice: ...");
        }
    }
    

