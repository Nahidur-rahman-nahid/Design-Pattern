
    class Robot {
        private String name;
        private Behavior behavior;

        public Robot(String name, Behavior behavior) {
            this.name = name;
            this.behavior = behavior;
        }

        public void setBehavior(Behavior behavior) {
            this.behavior = behavior;
        }

        public void performAction() {
            behavior.execute(name);
        }
    }


