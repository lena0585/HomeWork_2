package org.example;

import org.junit.Test;

public class CompositeTest {
    @Test
    public void testComposite() {
        Worker worker1 = new Worker("Петя Петров");
        Worker worker2 = new Worker("Вася Васин");

        Manager manager1 = new Manager("Ольга Ольгина");
        manager1.addEmployee(worker1);
        manager1.addEmployee(worker2);

        Worker worker3 = new Worker("Михаил Мишин");

        Manager manager2 = new Manager("Андрей Андреев");
        manager2.addEmployee(worker3);
        manager2.addEmployee(manager1);

        manager2.printName();
    }
}


