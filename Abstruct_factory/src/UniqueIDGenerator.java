public class UniqueIDGenerator {

        private static UniqueIDGenerator instance;
        private static int idCounter = 0;

        private UniqueIDGenerator() {}

        public static synchronized UniqueIDGenerator getInstance() {
            if (instance == null) {
                instance = new UniqueIDGenerator();
            }
            return instance;
        }

        public synchronized int getNextID() {
            return ++idCounter;
        }

}
