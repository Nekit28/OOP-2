public class Main {
        public static void main(String[] args) {
            Transport[] transports = new Transport[] {
                    new Car("машина 1",4),
                    new Car("машина 2",4),
                    new Truck("грузовик 1",6),
                    new Truck("грузовик 2",8),
                    new Bicycle("байк 1",2),
                    new Bicycle("байк 2", 2),
            };

            ServiceStation station = new ServiceStation();
            for (Transport transport : transports ) {
                station.check(transport);
            }
        }

    }
