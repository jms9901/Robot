import java.awt.*;

public class Main {

    public static void main(String[] args) {

          Robot robot = new Robot();
            robot.attack();

            robot.setWeapon(new Gun());
            robot.attack();

            robot.setWeapon(new Sword());
            robot.attack();

    }


    public static class Robot {
        private Weapon weapon;

        public void setWeapon(Weapon weapon) {
            this.weapon = weapon;
        }

        public void attack(){
            if (weapon == null) {
                System.out.println("공격실패다 이놈아");
            } else {
                this.weapon.attack();
            }
        }

        public void defense() {
            this.weapon.defense();
        }
    }

}