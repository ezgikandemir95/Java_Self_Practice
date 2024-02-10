package day11_practice_tasks;

public class LocalRestaurant {
    public static void main(String[] args) {
        Server[] servers = {
                new Server("Ali", 1, 20, false),
                new Server("Veli", 2, 22, false),
                new Server("Ayse", 3, 24, false),
                new Server("Osman", 4, 26, true),
                new Server("Hatice", 5, 28, true),
        };

        Chef[] chefs = {
                new Chef("John", 6, 40, true),
                new Chef("Mehmet", 7, 30, false),
                new Chef("Sultan", 8, 35, true),
        };


        Restaurant restaurant = new Restaurant("Ezgi", "Seoul", 5);

        restaurant.hireServers(servers);
        restaurant.hireChefs(chefs);

        System.out.println(restaurant);

    }

}
