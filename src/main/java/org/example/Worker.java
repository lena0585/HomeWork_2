package org.example;
    class Worker implements Employee {
        private String name;

        public Worker(String name) {
            this.name = name;
        }

        @Override
        public void printName() {
            System.out.println("Worker: " + name);
        }
    }

