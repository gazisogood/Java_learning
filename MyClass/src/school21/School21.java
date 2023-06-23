package school21;

public class School21 {
    public static void main(String[] args) {
        System.out.println();
        Peer someone = new Peer();
        Peer sergey = new Peer("Сергей", "Санкт-Петербург");
        Peer arthur = new Peer("Артур", "Казань", 33);
        Peer jony = new Peer();


        jony.setName("Жоня");
        jony.setCity("Kazan City");
        jony.setAge(22);
        jony.getInfo();
    }
}

class Peer {
    private String name;
    private String city;
    private int age;

    public Peer() {
        this.name = "Verter";
        this.city = "School 21";
    }
    public Peer(String name, String city) {
        this.name = name;
        this.city = city;
        sayHello();
    }
    public Peer(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        getInfo();
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст не может быть меньше 0");
        } else {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Пустое имя");
        } else {
            this.name = name;
        }
    }
    public String getName() {
        return name;
    }

    public void setCity(String city) {
        if (city.isEmpty()) {
            System.out.println("Пустой город");
        } else {
            this.city = city;
        }
    }
    public String getCity() {
        return city;
    }

    void sayHello() {
        System.out.println("Всем привет! Меня зовут " + name + ", я живу в городе " + city);
    }
    void sayVerter() {
        System.out.println("Я " + name + " from " + city + ", и я найду твои ошибки ))");
    }
    void getInfo() {
        System.out.println("Я " + name + " из " + city + " city, мне " + age);
    }
}