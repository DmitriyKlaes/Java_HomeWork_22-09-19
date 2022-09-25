package ru.Geekbrains;

public class Notebook {
    public class Params implements Comparable<Params>{

        private int ram;
        private int price;
        private int diskSize;
        private int screenSize;
        private String color;
        private String typeOfVideoCard;
        private String processor;
        private String os;
        private String manufacturer;
        private String model;

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getRam() {
            return ram;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public int getDiskSize() {
            return diskSize;
        }

        public void setDiskSize(int diskSize) {
            this.diskSize = diskSize;
        }

        public int getScreenSize() {
            return screenSize;
        }

        public void setScreenSize(int screenSize) {
            this.screenSize = screenSize;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getTypeOfVideoCard() {
            return typeOfVideoCard;
        }

        public void setTypeOfVideoCard(String typeOfVideoCard) {
            this.typeOfVideoCard = typeOfVideoCard;
        }

        public String getProcessor() {
            return processor;
        }

        public void setProcessor(String processor) {
            this.processor = processor;
        }

        public String getOs() {
            return os;
        }

        public void setOs(String os) {
            this.os = os;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
        /**
         * Параметры поиска
         * @param ram - объем оперативной памяти
         * @param diskSize - размер жесткого диска
         * @param screenSize - диагональ экрана
         * @param color - цвет ноубука
         * @param typeOfVideoCard - тип видеокарты
         * @param processor - тип процессора
         * @param os - операционная система
         * @param manufacturer - производитель
         * @param price - цена
         * @param model - модель
         */
        public Params(String manufacturer,String model,String processor,
                      int ram,int diskSize, String typeOfVideoCard, int screenSize,
                      String os,String color,int price){
            this.ram = ram;
            this.diskSize = diskSize;
            this.screenSize = screenSize;
            this.color = color;
            this.typeOfVideoCard = typeOfVideoCard;
            this.processor = processor;
            this.os = os;
            this.manufacturer = manufacturer;
            this.price=price;
            this.model=model;
        }

        public Params() {
            this("Asus",null,"Intel",4,120,"встроенный",13,
                    "без ОС","черный",16500);

        }

        @Override
        public int compareTo(Params o) {
            return 0;
        }
    }
/*
ОС
ОП+
ЖД+
Размер экрана+
Процессор+
Тип видеокарты+
Цвет+
Производитель+
public class Cat implements Comparable<Cat> {

private int id;
private int age;
private int weight;
private String name;
private String poroda;
private String color;
private String recept;

public Cat(int id, int age, int weight, String name, String poroda, String color, String recept) {
    this.id = id;
    this.age = age;
    this.weight = weight;
    this.name = name;
    this.poroda = poroda;
    this.color = color;
    this.recept = recept;
}

public Cat(int id, String name) {
    this.id = id;
    this.name = name;
}

public Cat(String name) {
    this(0, 0 , 0 , name, null, null, null);
}

public Cat() {
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public int getWeight() {
    return weight;
}

public void setWeight(int weight) {
    this.weight = weight;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getPoroda() {
    return poroda;
}

public void setPoroda(String poroda) {
    this.poroda = poroda;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public String getRecept() {
    return recept;
}

public void setRecept(String recept) {
    this.recept = recept;
}

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cat cat = (Cat) o;
    return id == cat.id && age == cat.age && Objects.equals(name, cat.name) && Objects.equals(poroda, cat.poroda);
}

@Override
public int hashCode() {
    return Objects.hash(id, age, name, poroda);
}

@Override
public String toString() {
    return "Cat{" +
            "id=" + id +
            ", age=" + age +
            ", weight=" + weight +
            ", name='" + name + '\'' +
            ", poroda='" + poroda + '\'' +
            ", color='" + color + '\'' +
            ", recept='" + recept + '\'' +
            '}';
}

@Override
public int compareTo(Cat o) {
    return Integer.compare(this.age, o.age);
}


public static void main(String[] args) {
    Set<Cat> set = new HashSet<>();
    set.add(new Cat(1, "name1"));
    set.add(new Cat(1, "name1"));
    set.add(new Cat(1, 1,1, "name2", "poroda1", "black", "some"));
    set.add(new Cat(2, 2,2, "name3", "poroda2", "black", "some"));
    for (Cat c : set){
        System.out.println(c);
    }
    System.out.println("--------------------");
    Set<Cat> treeSet = new TreeSet<>(set);
    treeSet.add(new Cat(1, 2,1, "name2", "poroda1", "black", "some"));
    treeSet.add(new Cat(1, 3,1, "name2", "poroda1", "black", "some"));
    treeSet.add(new Cat(1, 3,1, "name2", "poroda1", "black", "some"));
    treeSet.add(new Cat(1, 4,1, "name2", "poroda1", "black", "some"));
    for (Cat c : treeSet){
        System.out.println(c);
    }

}

}



*/
}
