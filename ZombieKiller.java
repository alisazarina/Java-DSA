public class ZombieKiller {
    public static void main(String[] args) {
        System.out.println("Welcome to our zombie killer program!!");

        String backpack[] = {"Shotgun", "Assault Rifle", "Sniper"};     // String array
        String zombies[] = {"Close-range zombie","Mid-range zombie", "Long-range zombie"};

        int numbersZombiesHATE[] = {4, 90, 70, 123, 12, 4, 561, 1};     // number array

        System.out.println("Backpack items!");
        System.out.println(backpack[0]);    // print backpack array (index start from 0)
        System.out.println(backpack[1]);
        System.out.println(backpack[2]);

        System.out.println("These are the zombies!");
        System.out.println(zombies[0]);     // print zombies array -- prints "Close-range zombie"
        System.out.println(zombies[1]);     // prints "Mid-range zombie"
        System.out.println(zombies[2]);     // prints "Long-range zombie"

        System.out.println(numbersZombiesHATE[6]);

    }
}
