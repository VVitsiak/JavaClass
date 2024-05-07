 public class Water {
        //Внутрішній клас для опису риби
        private class Fish {
            private String kind;
            private int size;

            public Fish(String kind, int size) {
                this.kind = kind;
                this.size = size;
            }

            public String getKind() {
                return kind;
            }

            public int getSize() {
                return size;
            }

            public String toString() {
                return "Риба: " + kind + ", розмір: " + size;
            }
        }

        //Вкладений статичний клас для опису температу води
        public static class Temperature {
            private double temperature;

            public Temperature(double temperature) {
                this.temperature = temperature;
            }

            public double getTemperature() {
                return temperature;
            }

            public String toString() {
                return "Температура води: " + temperature;
            }
        }

        //Локальний клас для опису забруднення
        private class Pollution {
            private String kindPollution;
            private int degree;

            public Pollution(String kindPollution, int degree) {
                this.kindPollution = kindPollution;
                this.degree = degree;
            }

            public String getKindPollution() {
                return kindPollution;
            }

            public int getDegree() {
                return degree;
            }

            public String toString() {
                return "Тип забруднення: " + kindPollution + ", ступінь: " + degree;
            }
        }

        //Поля класу Water
        private String name;
        private double square;
        private Fish[] fish;
        private Temperature temperatureWater;
        private Pollution[] pollution;

        //Конструктор класу Water
        public Water(String name, double square) {
            this.name = name;
            this.square = square;
            this.fish = new Fish[0];
            this.temperatureWater = new Temperature(20);
            this.pollution = new Pollution[0];
        }

        //Додати рибу
        public void plusFish(String kidOfFish, int sizeOfFish) {
            Fish[] newFishes = new Fish[fish.length + 1];
            System.arraycopy(fish, 0, newFishes, 0, fish.length);
            newFishes[newFishes.length - 1] = new Fish(kidOfFish, sizeOfFish);
            this.fish = newFishes;
        }

        //Отримати інформацію про риби
        public String getInformationFish() {
            StringBuilder info = new StringBuilder();
            for (Fish fish : fish) {
                info.append(fish.toString()).append("\n");
            }
            return info.toString();
        }

        //Змінити температуру води
        public void changeTemperatureOfWater(double newTemperature) {
            this.temperatureWater = new Temperature(newTemperature);
        }

        //Отримати інформацію про температуру води
        public String getInformationTemperatureWater() {
            return temperatureWater.toString();
        }

        //Додати забруднення
        public void plusPollution(String kindOfPollution, int degreeOfPollution) {
            Pollution[] newPollution = new Pollution[pollution.length + 1];
            System.arraycopy(pollution, 0, newPollution, 0, pollution.length);
            newPollution[newPollution.length - 1] = new Pollution(kindOfPollution, degreeOfPollution);
            this.pollution = newPollution;
        }

        //Отримати інформацію про забрудненння
        public String getInformationPollution() {
            StringBuilder info = new StringBuilder();
            for (Pollution pollution1 : pollution) {
                info.append(pollution1.toString()).append("\n");
            }
            return info.toString();
        }

        //Вивести інформацію про водойму
        public void printInfo() {
            System.out.println("Назва: " + name);
            System.out.println("Площа: " + square);
            System.out.println(getInformationFish());
            System.out.println(getInformationTemperatureWater());
            System.out.println(getInformationPollution());
        }

        //Приклад використання
        public static void main(String[] args) {
            Water lake = new Water("Озеро", 100);

            // Додати рибу
            lake.plusFish("Карась", 20);
            lake.plusFish("Щука", 50);

            // Змінити температуру води
            lake.changeTemperatureOfWater(25);

            // Додати забруднення
            lake.plusPollution("Хімічне", 3);

            // Вивести інформацію про водойму
            lake.printInfo();
        }
    }
