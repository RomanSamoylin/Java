package OPP_projects.HW4.src;

public class Main {
    public static void main(String[] args) {
       Commander commander = new Commander("Vasia", 250,new LongBow(), new KiteShield());
       Team<Archer> archers = new Team<>(commander);
        System.out.println(commander);
        archers.addWarrior(new Archer("Petr",180,new LongBow(), new KiteShield()));
        archers.addWarrior(new Archer("Val",210, new LongBow(), new RoundShield()));
        archers.forEach(item-> System.out.println(item));
        System.out.println("��������� ������ �������: " +archers.getAllDamage()+
                "\n��������� ��������: "+archers.getAllHealthPoint()+
                "\n������������ ���� ���������: "+archers.getMaxRadius()+
                "\n��������� ������ �����: " + archers.getAllShieldStrength());


        System.out.println("---------����� �������---------");
        Commander comandor1 = new Commander("SuperVasia",530,new LongBow(), new TowerShield());
        Team<Barbarian> axes = new Team<>(comandor1);
        axes.addWarrior(new Barbarian("Serg", 168, new Sekira(), new RoundShield()));
        System.out.println(comandor1);
        for (Barbarian item:axes) {
            System.out.println(item);
        }
        System.out.println("��������� ������ �������: "+axes.getAllDamage()+
                "\n��������� ��������: "+axes.getAllHealthPoint()+
                "\n������������ ���� ���������: "+axes.getMaxRadius() +
                "\n��������� ������ �����: " + axes.getAllShieldStrength());
        System.out.println("---------������ �������---------");
        Commander comandor2 = new Commander("Dmitriy", 290, new LongBow(), new RoundShield());
        Team<Warrior> gang = new Team<>(comandor2);
        gang.addWarrior(new Barbarian("John", 325,new Sekira(), new RoundShield()));
        gang.addWarrior(new Archer("Mayk",187,new LongBow(), new TowerShield()));
        System.out.println(comandor2);
        gang.forEach(item-> System.out.println(item));

        System.out.println("��������� ������ �������:"+gang.getAllDamage()+
                "\n��������� ��������: "+gang.getAllHealthPoint()+
                "\n������������ ���� ���������: "+gang.getMaxRadius()+
                "\n��������� ������ �����: " + gang.getAllShieldStrength());
        
    }
}
